package com.active.presentation.controller;

import com.active.presentation.exception.NoUserCurrentlySignedIn;
import com.active.presentation.exception.NotValidUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.view.RedirectView;

/**
 * Created by bungubbang
 * Email: sungyong.jung@sk.com
 * Date: 6/11/14
 */
@Controller
public class ExceptionController {

    @ExceptionHandler(NoUserCurrentlySignedIn.class)
    public RedirectView noUserCurrentlySignedIn() {
        return new RedirectView("/signout");
    }

    @ExceptionHandler(NotValidUser.class)
        public String NotValidUser() {
        return "error";
    }

    @ExceptionHandler(Exception.class)
    public String defaultException() {
        return "error";
    }
}
