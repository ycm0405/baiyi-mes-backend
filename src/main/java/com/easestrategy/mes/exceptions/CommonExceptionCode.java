package com.easestrategy.mes.exceptions;

/**
 * @author ycmdoing@163.com
 * @Description:通用异常码
 * @date 2018年4月13日
 */

public enum CommonExceptionCode {

    // 参数包含特殊字符
    SPECIAL_PARA(50001),
    //参数过长
    TOO_LONG_PAEA(50002),
    /*
     * 参数非法
     */
    ILLEGAL_PARA(50005),
    //上传文件不能为空
    FILE_UPLOAD_EMPTY(51001),
    //上传文件不能大于2M
    FILES_UPLOAD_OVER_MAXIMUM(51002),
    //路径不存在
    FILE_PATH_NOT_EXIST(51003),
    //文件保存失败
    FILE_SAVE_FAILED(51004),
    //文件名不合法
    FILE_NAME_ILLEGAL(51005),
    //文件名已经存在
    FILE_NAME_EXISTS(51006),
    //文件夹下文件过多
    FILES_TOO_MANY(51007),
    //文件权限不够
    FILE_NO_PERMISSIONS(51008),
    //文件写入失败
    FILE_WRITE_FAILED(51009),
    //文件解析失败
    FILE_READ_FAILED(51010),
    //连接超时
    CONNECTION_TIMEOUT(52001),
    //网络中断
    NETWORK_INTERRUPTION(52002);

    private int value = 0;

    private CommonExceptionCode(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }
}

