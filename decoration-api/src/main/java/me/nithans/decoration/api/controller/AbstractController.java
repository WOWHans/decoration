package me.nithans.decoration.api.controller;

import me.nithans.decoration.api.controller.bean.ResultInfo;

public abstract class AbstractController {

    public ResultInfo<?> renderError(Integer errorCode, String msg) {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setStatus(Boolean.FALSE);
        resultInfo.setCode(errorCode);
        resultInfo.setMsg(msg);
        return resultInfo;
    }

    public ResultInfo<?> renderSuccess() {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setMsg("请求成功");
        return resultInfo;
    }

    public ResultInfo<?> renderResult(Object result) {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setData(result);
        resultInfo.setMsg("请求成功");
        return resultInfo;
    }




}
