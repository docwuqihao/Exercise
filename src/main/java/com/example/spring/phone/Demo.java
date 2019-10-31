package com.example.spring.phone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;


public class Demo {
    private static final Logger logger = LoggerFactory.getLogger(Demo.class);
    private static final String FEE_CALC_PLAN = "planA";

    public static void main(String[] args) {
        Date dateFrom = new Date();
        int minites = 9;
        FeeCalc feeCalc = PlanFactory.getFeeCalcPlan(FEE_CALC_PLAN);
        double costFee = feeCalc.costFee(dateFrom, minites);

        logger.info("FeeCost {}", costFee);
    }
}
