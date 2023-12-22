package com.hei.school.endpoint.rest.controller.health;

import java.math.BigInteger;

import com.hei.school.PojaGenerated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import lombok.AllArgsConstructor;

@PojaGenerated
@RestController
@AllArgsConstructor
public class BigSumController {

    @GetMapping("/big-sum")
    public String getBigSum(@RequestParam(name = "a") String a, @RequestParam(name = "b") String b) {
        return new BigInteger(a).add(new BigInteger(b)).toString();
    }
}