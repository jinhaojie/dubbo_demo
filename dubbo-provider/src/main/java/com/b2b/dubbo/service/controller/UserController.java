package com.b2b.dubbo.service.controller;

import com.cupertino.b2b.domain.User;
import com.cupertino.b2b.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * @author Jin Haojie
 * @date 17-3-2
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

    private static Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @ResponseBody
    public String add(
            HttpServletResponse response) {
        User user = new User();
        user.setAge(11);
        user.setName("jin");
        user.setId(1);
        try {
        userService.insert(user);

        } catch (Exception e) {
             logger.error(e);
        }
        return "hello jinhaojie";
    }
}
