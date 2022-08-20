package com.student;

import com.mapper.DepartmentMapper;
import com.pojo.Department;
import com.pojo.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class StudentTest {

    @Test
    public void studentTestgetAll() throws IOException {
        //使用文件流读取核心配置文件
        InputStream is = StudentTest.class.getClassLoader().getResourceAsStream("mybatis-config.xml");

        //创建sqlSessionFactory工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        //取出sqlSession的对象
        SqlSession sqlSession = factory.openSession();

        DepartmentMapper departmentMapper = sqlSession.getMapper(DepartmentMapper.class);
        Department department = departmentMapper.selectByPrimaryKey(1);
        System.out.println(department);

    }

//    @Test
//    public void getById() throws Exception {
//            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
//
//            SqlSession sqlSession = factory.openSession();
//
//            Student student = sqlSession.selectOne("aaa.getById",1);
//            System.out.println(student);
//
//            sqlSession.close();;
//    }
//
//    @Test
//    public void addStudent() throws IOException {
//        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
//        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
//        SqlSession sqlSession = factory.openSession(true);
//        sqlSession.insert("aaa.add",new Student("tom",6,"tom@qq.com"));
//        sqlSession.close();
//    }
//
//    @Test
//    public void show() throws IOException {
//        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
//        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
//        SqlSession sqlSession = factory.openSession();
//        List<String> stringList = sqlSession.selectList("aaa.show");
//        stringList.forEach(s -> System.out.println(s) );
//        sqlSession.close();
//    }
}
