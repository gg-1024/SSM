package com.utils;

import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class GeneratorTest {

    public static void main(String[] args) throws Exception {

    }

    @Test
    public void generatorConfig() throws Exception{
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        File configFile = new File("D:\\JAVA\\IDEA\\project\\SSM\\02-mybatis-FirstMybatis\\src\\main\\resources\\generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }

    @Test
    public void generatorConfig1() throws Exception{
        File file = new File("D:\\JAVA\\IDEA\\project\\SSM\\02-mybatis-FirstMybatis\\src\\main\\resources\\jdbc.properties");
        FileInputStream fileInputStream = new FileInputStream(file);
        Properties properties = new Properties();
        properties.load(fileInputStream);
        String property = properties.getProperty("password");
        System.out.println(property);
    }
}
