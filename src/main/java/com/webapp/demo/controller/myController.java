package com.webapp.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.demo.entity.myEntity;
import com.webapp.demo.repository.myRepository;

@RestController
@RequestMapping("/base")
public class myController {

    @Autowired
    private myRepository myRepository;

    @PostMapping("/request")
    public ResponseEntity<String> searchEntities(@RequestParam("testing id") Integer id,
            @RequestParam("result") Float result, @RequestParam("unit") String unit,
            @RequestParam("gender") String gender, @RequestParam("age") Integer age) {
        List<myEntity> ls;
        ls = myRepository.findByTestingidAndGenderAndUnit(id, gender, unit);
        if (ls.size() == 0) {
            return ResponseEntity.ok().body("Invalid Report");
        }
        for (int i = 0; i < ls.size(); i++) {
            if ((ls.get(i).getStartingage() <= age) && (ls.get(i).getEndingage() >= age)) {
                if (result < 0) {
                    return ResponseEntity.ok().body("Error in the test" + "(" + ls.get(i).getTestname() + ")");
                }
                if (result > ls.get(i).getMaxresults()) {
                    return ResponseEntity.ok().body("High" + "(" + ls.get(i).getTestname() + ")");
                }
                if (result < ls.get(i).getMinresults()) {
                    return ResponseEntity.ok().body("Low" + "(" + ls.get(i).getTestname() + ")");
                }
                return ResponseEntity.ok().body("Normal" + "(" + ls.get(i).getTestname() + ")");
            }
        }

        return ResponseEntity.ok().body("Age Out Of Range");
        // return null;
    }
}
