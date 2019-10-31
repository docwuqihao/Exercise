package com.example.spring.phone;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Objects;

public class PlanAFeeCalcImpl implements FeeCalc {


    private static final int DAY_HOUR_FROM = 7;
    private static final int DAY_HOUR_END = 19;
    /**
     * 第一分钟花费，单位：毛
     */
    private static final int DAY_FIRST_MINITE_COST = 5;
    private static final int NIGHT_FIRST_MINITE_COST = 3;

    @Override
    public String planName() {
        return "planA";
    }

    @Override
    public double costFee(Date timeFrom, int minites) {

        if (Objects.isNull(timeFrom)) {
            throw new ValidationException("PlanAFeeCalc costFee time is null.");
        }
        if (minites < 1) {
            return 0;
        }

        // 时区问题？
        LocalDateTime localDateTimeFrom = LocalDateTime.ofInstant(timeFrom.toInstant(), ZoneId.systemDefault());
        int hour = localDateTimeFrom.getHour();

        double fee = 0;
        if (hour >= DAY_HOUR_FROM && hour < DAY_HOUR_END) {
            fee = calcFeeInDay(minites);
        } else {
            fee = calcFeeInNight(minites);
        }
        return fee / 10;
    }

    private int calcFeeInNight(int minites) {
        if (minites == 1) {
            return NIGHT_FIRST_MINITE_COST;
        } else if (minites <= 11) {
            return NIGHT_FIRST_MINITE_COST + 10;
        } else {
            return NIGHT_FIRST_MINITE_COST + 10 + minites - 11;
        }
    }

    private int calcFeeInDay(int minites) {
        if (minites == 1) {
            return DAY_FIRST_MINITE_COST;
        } else {
            return DAY_FIRST_MINITE_COST + minites - 1;
        }
    }


}
