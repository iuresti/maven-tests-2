package com.politecnica.workshops.services;

import org.junit.Before;
import org.junit.Test;

import com.politecnica.workshops.model.Carrier;
import com.politecnica.workshops.model.InputData;

public class SaleServiceTest {

    private SaleService saleService;

    @Before
    public void setup() {
        saleService = new SaleService();
    }

    @Test(expected = RuntimeException.class)
    public void saleWithMovistarMustThrowUnsupportedCarrier() {
        //given:
        InputData inputData = new InputData();

        inputData.setPhoneNumber("4412123123");
        inputData.setCarrier(Carrier.MOVISTAR);
        inputData.setAmount(100);

        //when:
        saleService.doSale(inputData);
    }

}
