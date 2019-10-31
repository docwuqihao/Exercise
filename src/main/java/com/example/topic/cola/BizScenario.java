package com.example.topic.cola;


import java.util.Collections;
import java.util.List;

public class BizScenario {
    public final static String DEFAULT_Country = "defaultCountry";
    public final static String DEFAULT_BIZ_CODE = "defaultBizCode";
    public final static List<ExtensionPointI> DEFAULT_POINTI = Collections.emptyList();


    private String country = DEFAULT_Country;


    private String bizCode = DEFAULT_BIZ_CODE;


    private List<ExtensionPointI> pointIList = DEFAULT_POINTI;


}
