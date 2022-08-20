package com.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class JdbcUtils {
    private static SqlSessionFactory  factory = null;
    private static SqlSession sqlSession = null;
    static {
        InputStream in = null;
        try {
            in = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        factory = new SqlSessionFactoryBuilder().build(in);
        sqlSession = factory.openSession(true);
    }
    public static SqlSession getSqlSession() throws IOException {
        return sqlSession;
    }
    public static void close(){
        sqlSession.close();
    }
}
