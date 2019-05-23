package com.easestrategy.mes.exceptions;

public class BussinessException extends CommonException {
    public BussinessException(int code, String msg) {
        super(code, msg);
        System.out.println(msg);
    }

    public BussinessException(int code, String msg, Object data) {
        super(code, msg, data);
    }

}
