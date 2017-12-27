package com.glf.mobile.mobilews.controller;

import com.glf.mobile.mobilews.util.data.DataManager;
import com.glf.mobile.mobilews.util.dispatchapi.DispatchPath;
import com.glf.mobile.mobilews.util.inapi.BasePath;
import com.glf.mobile.mobilews.util.inapi.Path;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = {BasePath.BASE_PATH_V1 + BasePath.DOCUMENT_PATH })
public class DocumentRestController {

    @Autowired
    private DataManager manager;

    @GetMapping(value = {Path.GET_DEFAULT})
    public String getRest(){
        return "HELLO DOCUMENT";
    }

    @GetMapping(value = {Path.GET_DOCUMENTS})
    public ResponseEntity<Map<String, Object>> getDocumentList() {
        try {
            Map<String, Object> map = manager.fetchDataMapResponse(DispatchPath.GET_DOCUMENTS);
            if(map != null && !map.isEmpty()){
                return ResponseEntity.ok(map);
            }else{
                return ResponseEntity.noContent().build();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.noContent().build();
    }

}
