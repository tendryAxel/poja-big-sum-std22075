package com.hei.axel.endpoint.rest.controller;

import com.hei.axel.conf.FacadeIT;
import com.hei.axel.endpoint.rest.controller.sum.SumController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumControllerIT extends FacadeIT {
    @Autowired SumController sumController;

    @Test
    void test_add_big_number(){
        assertEquals(
                "10",
                sumController.addBigInteger(
                        "9",
                        "1"
                )
        );
    }
}
