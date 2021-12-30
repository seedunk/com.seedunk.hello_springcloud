package com.seedunk.hello.springcloud.provider;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController; 
/**
 * Created by deng on 2017/12/24.
 */
@RestController
@RequestMapping(value = "/index")
public class IndexApi {
   
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public List<String> hello() {
        List<String> hello=new ArrayList<>();
                  hello.add("Hello World!");
        return    hello;
    } 
}
