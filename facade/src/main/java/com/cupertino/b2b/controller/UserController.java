package com.cupertino.b2b.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.b2b.dubbo.rpc.OrderService;
import com.cupertino.b2b.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Jin Haojie
 * @date 17-3-2
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

    private static Logger logger = Logger.getLogger(UserController.class);

    @Reference
    private OrderService orderService;

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @ResponseBody
    public String add(
            HttpServletResponse response) {

//        String msg = orderService.get("adsf");
//        userService.insert(null);

        return null;
    }
}
