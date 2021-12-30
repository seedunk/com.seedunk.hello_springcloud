package com.seedunk.hello.springcloud.provider;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by deng on 2017/12/24.
 */
@Controller 
public class IndexView {
    @RequestMapping(value = "/index")
    public String getIndex() {
        return "index";
    }
}
