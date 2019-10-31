package com.example.spring.phone;

import java.util.HashMap;
import java.util.Map;

/**
 * 使用spring后可交由spring管理  getBeansOfType(FeeCalc.class);放置到map中，key为planName()的返回
 */
public class PlanFactory {
    private static final Map<String, FeeCalc> FEE_CALC_MAP = new HashMap<>();

    static {
        FeeCalc planA = new PlanAFeeCalcImpl();
        FeeCalc planB = new PlanBFeeCalcImpl();

        FEE_CALC_MAP.put(planA.planName(), planA);
        FEE_CALC_MAP.put(planB.planName(), planB);
    }

    public static FeeCalc getFeeCalcPlan(String plan) {
        return FEE_CALC_MAP.getOrDefault(plan, new PlanAFeeCalcImpl());
    }
}
