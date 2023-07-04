package com.webapp.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.webapp.demo.entity.myEntity;
import com.webapp.demo.repository.myRepository;
import com.webapp.demo.service.myService;

@Service
public class ServiceImpl implements myService {

    private final myRepository myRepository;

    public ServiceImpl(myRepository myRepository) {
        this.myRepository = myRepository;
    }

    @Override
    public List<myEntity> validate() {
        List<myEntity> ls;
        // List<Integer> ids = List.of(id);

        ls = myRepository.findAll();
        for (Object obj : ls) {
            System.out.println(obj);
        }
        return ls;
        // return testsvalRepository.findAll();
    }
}
