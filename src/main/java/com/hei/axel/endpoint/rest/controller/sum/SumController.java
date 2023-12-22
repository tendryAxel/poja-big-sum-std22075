package com.hei.axel.endpoint.rest.controller.sum;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
public class SumController {
    @GetMapping("/big-sum")
    public String addBigInteger(
            @RequestParam(name = "a", defaultValue = "0") String a,
            @RequestParam(name = "b", defaultValue = "0") String b) {
        return String.valueOf(
                BigInteger.valueOf(Long.parseLong(a))
                        .add(BigInteger.valueOf(Long.parseLong(b)))
        );
    }
}
