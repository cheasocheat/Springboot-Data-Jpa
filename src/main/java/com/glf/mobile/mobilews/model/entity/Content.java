package com.glf.mobile.mobilews.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.glf.mobile.mobilews.model.base.BaseEntity;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

/**
 * Developer : cheasocheat
 * Created on 12/28/17 00:02
 */
@Entity
@Table(name = "tb_content")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
public class Content extends BaseEntity {

    @Override
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "con_id", nullable = false, unique = true)
    public Long getId() {
        return id;
    }

    @Column(name = "con_title", nullable = false)
    private String title;

    @Column(name = "con_title_en")
    private String titleEn;

    @Column(name = "con_desc", nullable = false)
    private String conDesc;

    @Column(name = "con_desc_en")
    private String conDescEn;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleEn() {
        return titleEn;
    }

    public void setTitleEn(String titleEn) {
        this.titleEn = titleEn;
    }

    public String getConDesc() {
        return conDesc;
    }

    public void setConDesc(String conDesc) {
        this.conDesc = conDesc;
    }

    public String getConDescEn() {
        return conDescEn;
    }

    public void setConDescEn(String conDescEn) {
        this.conDescEn = conDescEn;
    }
}
