package com.example.cola.exception;


public class ColaException extends BaseException {

    private static final long serialVersionUID = 1L;

    public ColaException(String errMessage) {
        super(errMessage);
        this.setErrCode(BasicErrorCode.COLA_ERROR);
    }

    public ColaException(String errMessage, Throwable e) {
        super(errMessage, e);
        this.setErrCode(BasicErrorCode.COLA_ERROR);
    }
}