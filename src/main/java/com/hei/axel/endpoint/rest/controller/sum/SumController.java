package com.hei.axel.endpoint.rest.controller.sum;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
public class SumController {
    @GetMapping("/big-sum")
    public BigInteger addBigInteger(
            @RequestParam(name = "a", defaultValue = "0") BigInteger a,
            @RequestParam(name = "b", defaultValue = "0") BigInteger b) {
        return a.add(b);
    }
}
