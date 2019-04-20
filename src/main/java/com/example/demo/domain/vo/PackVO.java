package com.example.demo.domain.vo;

import java.util.List;

public class PackVO<T> {

    private T vo;

    private List<T> voList;

    private Boolean success = Boolean.TRUE;

    private String message;

    private String udf1;

    public T getVo() {
        return vo;
    }

    public void setVo(T vo) {
        this.vo = vo;
    }

    public List<T> getVoList() {
        return voList;
    }

    public void setVoList(List<T> voList) {
        this.voList = voList;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUdf1() {
        return udf1;
    }

    public void setUdf1(String udf1) {
        this.udf1 = udf1;
    }
}
