package com.glf.mobile.mobilews.util.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ResponseBuilder<T> {
    @JsonProperty("RSLT_CD")
    private int code;
    @JsonProperty("RSLT_MSG")
    private String message;
    @JsonProperty("RSLT_DATA")
    private List<T> lstData;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<T> getLstData() {
        return lstData;
    }

    public void setLstData(List<T> lstData) {
        this.lstData = lstData;
    }
}
