package com.user;

import com.mapper.UserMapper;
import com.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class UserTest {

    @Test
    public void getAllUser() throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> allUser = mapper.getAllUser();
        allUser.forEach(user -> System.out.println(user));
    }

    @Test
    public void addUser() throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.addUser(new User(103,"aac","12346",new Date()));
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void getByLike() throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
//        user.setName("aaa");
//        user.setPassword("12345");
        List<User> userList = mapper.getByLike(user);
        userList.forEach(user1 -> System.out.println(user1));
        sqlSession.close();
    }

    @Test
    public void updateUser() throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setId(20);
        user.setName("abcdefg");
        mapper.updateUser(user);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void getBySomeId() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Integer[] arrayInteger = {1,2,3};
        List<User> userList = mapper.getBySomeId(arrayInteger);
        userList.forEach(user -> System.out.println(user));
        sqlSession.close();
    }

    @Test
    public void addUsers() throws Exception {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = new ArrayList<>();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");

        userList.add(new User("aaa","aaa",new Date()));
        userList.add(new User("fsafsa","143535",new Date()));
        userList.add(new User("htrhr","765765",new Date()));
        mapper.addUsers(userList);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println();
    }

    @Test
    public void getByMap() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        Map<String,Date> hashmap = new HashMap();
        hashmap.put("begin",new Date(122,7,5));
        hashmap.put("end",new Date(122,12,5));
        List<User> userList = mapper.getByMap(hashmap);
        userList.forEach(user -> System.out.println(user));
        sqlSession.close();
    }

    @Test
    public void getUserReturnMapById() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map map = mapper.getUserReturnMapById(1);
        System.out.println(map);
        sqlSession.close();
    }
}
