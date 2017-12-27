package com.glf.mobile.mobilews.controller;

import com.glf.mobile.mobilews.util.pathapi.BasePath;
import com.glf.mobile.mobilews.util.pathapi.Path;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = BasePath.BASE_PATH_V1 + BasePath.LESSEE_PATH)
public class LesseeRestController {

    @GetMapping(value = {Path.GET_DEFAULT})
    public String getRest() {
        return "HELLO LESSEE WS";
    }

    @GetMapping(value = {Path.GET_ATTRIBUTES})
    public String getLesseeAttribute() {
        return "Get Lessee Attribute";
    }

    @GetMapping(value = {Path.GET_COL_STATUS})
    public String getCollectionStatus() {
        return "Get Collection Status ";
    }
}
