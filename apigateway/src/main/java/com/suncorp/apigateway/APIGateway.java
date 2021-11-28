package com.suncorp.apigateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/APIGateway")
public class APIGateway {

    @Autowired
    Routing routing;


    @GetMapping("/Customer")
    public void routeToCustomer(){
    }
}
