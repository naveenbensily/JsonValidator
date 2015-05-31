package com.demo.jsonvalidator.controller;

import com.demo.jsonvalidator.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by Naveen Bensily on 5/30/15.
 */

@RestController
public class JsonValidatorController {

    private final static Logger logger = LoggerFactory.getLogger(JsonValidatorController.class);


    @RequestMapping(value = "/postJson" , method = RequestMethod.POST,consumes = {"application/xml","application/json"})
    public void jsonValidation(@RequestBody @Valid Customer customer){

        logger.debug("customer First Name-->"+customer.getFirstName());
        logger.debug("customer Last Name-->" +customer.getLastName());
        logger.debug("customer First Name-->"+customer.getId());


    }

    @RequestMapping(value="/isServiceRunning", method = RequestMethod.GET)
    public @ResponseBody boolean isServiceRunning(){

        return true;
    }

    @RequestMapping(value="/getDefaultCustomer", method = RequestMethod.GET)
    public @ResponseBody Customer getDefaultCustomer(){

            Customer newCustomer = new Customer("Naveen" ,"Bensily" ,1983);
            return newCustomer;

    }


}
