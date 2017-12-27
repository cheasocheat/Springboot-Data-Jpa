package com.glf.mobile.mobilews.repository;

import com.glf.mobile.mobilews.model.entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document, Long> {
}
