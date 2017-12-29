package com.glf.mobile.mobilews.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.glf.mobile.mobilews.model.base.BaseEntity;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "tb_document_group")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
public class DocGroup extends BaseEntity{
    @Override
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "dg_id")
    public Long getId() {
        return id;
    }

}
