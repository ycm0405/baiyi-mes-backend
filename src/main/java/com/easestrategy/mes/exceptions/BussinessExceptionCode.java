package com.easestrategy.mes.exceptions;

/**
 * @author ycmdoing@163.com
 * @Description: 业务异常码, 与业务相关
 * @date 2018年4月13日
 */

public enum BussinessExceptionCode {

    /**
     * 非本考场考生
     */
    NOT_EXAM_STUDENT(55001),
    /**
     * 获取考生信息失败
     */
    GET_STUDENT_INFO_FAILED(55002),

    /**
     * 停止读卷失败
     */
    STOP_READING_FAIL(55103),

    /**
     * 数据非法
     */
    ILLEGAL_DATA(56001);


    private int value = 1;

    private BussinessExceptionCode(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }
}

