package com.politecnica.workshops.services;

import com.politecnica.workshops.model.Carrier;
import com.politecnica.workshops.model.InputData;
import com.politecnica.workshops.model.OutputData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class SaleService {

    private static final Logger logger = LoggerFactory.getLogger(SaleService.class);

    private Random random = new Random();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public OutputData doSale(InputData inputData) {
        LocalDate now = LocalDate.now();
        logger.info("Sale received: {}", inputData);

        validateInput(inputData);

        OutputData outputData = new OutputData();

        outputData.setApprovalCode(String.format("%1$06d", random.nextInt(1000000)));
        outputData.setTransactionReference(String.format("%1$12d", random.nextInt(100000000)));
        outputData.setServerDateTime(now.format(formatter));

        logger.info("Approved sale: {}", outputData);

        return outputData;
    }

    private void validateInput(InputData inputData) {
        if(Carrier.MOVISTAR.equals(inputData.getCarrier())){
            throw new RuntimeException("Invalid carrier");
        }
    }
}
