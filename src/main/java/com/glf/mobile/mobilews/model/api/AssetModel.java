package com.glf.mobile.mobilews.model.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AssetModel {
    @JsonProperty("ID")
    private Long id;
    @JsonProperty("DESC")
    private String desc;
    @JsonProperty("DESC_EN")
    private String descEn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDescEn() {
        return descEn;
    }

    public void setDescEn(String descEn) {
        this.descEn = descEn;
    }
}
