package com.memoire.benapay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.memoire.benapay.model.Transaction;
import com.memoire.benapay.services.TranService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/transactions")
@RequiredArgsConstructor
public class TransController {
    @Autowired
    private TranService service;

    @PostMapping
    public Transaction create(Transaction transaction){
        return service.create(transaction);
    }

    @GetMapping
    public Iterable<Transaction> fetch(){
        return service.get();
    }
    
    @GetMapping("/{id}")
    public Transaction fetch(int id){
        return service.get(id);
    }

    //Benji will include update

    @PutMapping
    public Transaction update(Transaction user){
        return service.update(user);
    }
}
