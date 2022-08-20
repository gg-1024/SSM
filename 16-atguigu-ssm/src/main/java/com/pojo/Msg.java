package com.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Msg {
    private int code;
    private String msg;
    private Map<String,Object> extend = new HashMap<String, Object>();

    public static Msg success(){
        Msg result = new Msg();
        result.setCode(200);
        result.setMsg("处理成功");
        return result;
    }
    public static Msg defeat(){
        Msg result = new Msg();
        result.setCode(500);
        result.setMsg("处理失败");
        return result;
    }

    public Msg add(String key,Object value){
        this.extend.put(key,value);
        return this;
    }
}
