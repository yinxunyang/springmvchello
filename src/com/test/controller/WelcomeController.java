package com.test.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * https://blog.csdn.net/xiangyihu/article/details/79974923
 * Created by: zs
 * Date-Time: 2017/8/9 19:05
 */
public class WelcomeController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest,
                                      HttpServletResponse httpServletResponse) throws Exception {
        return new ModelAndView("welcome");
    }
}
