package com.example.spring.phone;

import java.util.Date;

public class PlanBFeeCalcImpl implements FeeCalc {


    @Override
    public String planName() {
        return "planB";
    }

    @Override
    public double costFee(Date timeFrom, int minites) {
        return 0;
    }
}
