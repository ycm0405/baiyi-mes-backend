package com.easestrategy.mes.model;

public class ResultUtil {
    /**
     * 请求成功返回
     *
     * @param object
     * @return
     */
    public static OpResult success(Object object) {
        OpResult msg = new OpResult();
        msg.setCode(100);
        msg.setMsg("请求成功");
        msg.setData(object);
        return msg;
    }

    public static OpResult success() {
        return success(null);
    }

    public static OpResult error(Integer code, String resultMsg) {
        OpResult msg = new OpResult();
        msg.setCode(code);
        msg.setMsg(resultMsg);
        return msg;
    }

    public static OpResult error(Integer code, String resultMsg, Object data) {
        OpResult msg = new OpResult();
        msg.setCode(code);
        msg.setMsg(resultMsg);
        msg.setData(data);
        return msg;
    }


}
