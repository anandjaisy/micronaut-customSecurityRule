package com.example.controller;

import io.micronaut.http.annotation.*;

@Controller("/order")
public class OrderController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}