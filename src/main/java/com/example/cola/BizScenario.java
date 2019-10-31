package com.example.cola;


public class BizScenario {
    public final static String DEFAULT_COUNTRY = "defaultCountry";
    public final static String DEFAULT_BIZ_CODE = "defaultBizCode";

    private String country = DEFAULT_COUNTRY;


    private String bizCode = DEFAULT_BIZ_CODE;


    public String getUniqueIdentity() {
        return country + "." + bizCode;
    }
}
