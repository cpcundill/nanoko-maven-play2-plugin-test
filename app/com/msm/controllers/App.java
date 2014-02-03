package com.msm.controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class App extends Controller
{
    public static Result index() {
        return ok("Hello, I'm alive. You're good.");
    }
}
