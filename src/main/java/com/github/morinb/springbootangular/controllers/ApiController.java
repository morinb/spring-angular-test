package com.github.morinb.springbootangular.controllers;

import com.github.morinb.springbootangular.beans.ApiVersion;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class ApiController {

    @RequestMapping(value = "/api/version", method = GET)
    public ApiVersion getApiVersion() {
        return new ApiVersion("0.0.1");
    }

}
