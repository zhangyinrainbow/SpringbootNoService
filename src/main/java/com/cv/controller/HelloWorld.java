package com.cv.controller;


import com.cv.common.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorld {
    @GetMapping("/{id}")
    public Result getSometing(@PathVariable("id") Long id){
        return Result.succ("ok",id);
    }
}
