package com.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Student {
    @Value("181164341")
    private int personId;

    @Value("李某人")
    private String personName;

    @Value("某南省信某市固某县")
    private String personAddress;

    @Autowired
    @Qualifier("school")
    private School school;
}
