package com.example.spring.phone;

import java.util.Date;

public interface FeeCalc {

    String planName();

    double costFee(Date timeFrom, int minites);
}
