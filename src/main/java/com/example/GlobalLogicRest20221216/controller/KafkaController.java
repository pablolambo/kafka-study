package com.example.GlobalLogicRest20221216.controller;

import com.example.GlobalLogicRest20221216.model.Vehicle;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class KafkaController {

    @PostMapping("/send")
    public void addVehicle(@RequestBody Vehicle vehicle){

    }



}
