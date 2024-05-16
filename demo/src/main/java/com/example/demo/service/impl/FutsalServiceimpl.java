package com.example.demo.service.impl;

import com.example.demo.Pojo.FutsalPojo;

public class FutsalServiceimpl {

    private final FutsalRepository futsalrepository;

    @Override
    public List<Futsal> findAll() {
        return futsalrepository.findAll();
    }


    @Override
    public void saveData(FutsalPojo futsalPojo) {
        Futsal futsal= new Futsal();

        futsal.setId(futsalPojo.getId());
        futsal.setName(futsalPojo.getName());



        futsalrepository.save(futsal);
    }
}
