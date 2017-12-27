package com.glf.mobile.mobilews.controller;

import com.glf.mobile.mobilews.model.entity.Document;
import com.glf.mobile.mobilews.repository.DocumentRepository;
import com.glf.mobile.mobilews.util.pathapi.BasePath;
import com.glf.mobile.mobilews.util.pathapi.Path;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = {BasePath.BASE_PATH_V1 + BasePath.DOCUMENT_PATH })
public class DocumentRestController {

    @Autowired
    private DocumentRepository repository;

    @GetMapping(value = {Path.GET_DEFAULT})
    public String getRest() {
        return "HELLO DOCUMENT WS";
    }

    @GetMapping(value = {Path.GET_DOCUMENTS})
    public List<Document> getDocumentList(){
        List<Document> lstDocument = new ArrayList<>();

        lstDocument = repository.findAll();

        return lstDocument;
    }
}
