package com.hei.school.endpoint.rest.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.hei.school.PojaGenerated;
import com.hei.school.endpoint.rest.controller.health.BigSumController;
import org.junit.jupiter.api.Test;



@PojaGenerated
public class BigSumControllerTest {

    BigSumController bigSumController = new BigSumController();

    @Test
    void bigSum() {
        assertEquals("100000000000000000000000002", bigSumController.getBigSum("100000000000000000000000000", "2"));
    }
}