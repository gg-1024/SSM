package com.converter;

import com.pojo.User;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class ResponseTest {

    @ResponseBody
    @RequestMapping("/responseBodyTest")
    public User responseBodyTest(RequestEntity<String> requestEntity){
        System.out.println(requestEntity);
        System.out.println("responseBodyTest方法执行了");
        return new User(1,"张三","admin123456");
    }

    @RequestMapping("/responseAPI")
    public void responseAPI(HttpServletResponse response) throws IOException {
        response.getWriter().println("hello,mvc");
    }
}
