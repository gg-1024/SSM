package com.rest;

import com.dao.UserDao;
import com.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;

@Controller
@RequestMapping("/rest")
public class UController {

    @Autowired
    UserDao userDao;

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public ModelAndView getAllUser(ModelAndView mv){
        Collection<User> allUser = userDao.getAllUser();
        mv.addObject("allUser",allUser);
        mv.setViewName("userList");
        return mv;
    }

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public String getUserById(@PathVariable("id") Integer id, HttpServletRequest request){
        User user = userDao.getUserById(id);
        request.setAttribute("user",user);
        return "forward:/user.jsp";
    }

    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String addUser(User user,HttpServletRequest request){
        userDao.addUser(user);
        return "redirect:/rest/return";
    }

    @RequestMapping("/return")
    public String aaa(){
        return "forward:/user.jsp";
    }

//    @RequestMapping(value = "/user",method = RequestMethod.DELETE)
//    public void deleteUserById(int id){
//        userDao.deleteUserById(id);
//    }
}
