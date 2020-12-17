package com.example.controller;

import com.example.service.IProducer;
import com.example.service.security.RequiredPermission;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;
import io.reactivex.Single;

@Controller("/product")
@Secured(SecurityRule.IS_AUTHENTICATED)
public class ProductController {
    private final IProducer iProducer;

    public ProductController(IProducer iProducer) {
        this.iProducer = iProducer;
    }

    @Get(uri = "/{text}")
    @RequiredPermission(resourceIdName = "Admin", permission = "Admin")
    public Single<String> get(String text){
        return iProducer.sendText(text);
    }

    @Get(uri = "/}")
    @Secured({"Admin"})
    public Single<String> getResult(){
        return Single.just("This is the testing");
    }
}
