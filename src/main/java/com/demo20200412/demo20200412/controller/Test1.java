package com.demo20200412.demo20200412.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * Description: TODO
 * </p>
 *
 * @author majun
 * @version 1.0
 * @date 2020-04-12 01:46
 */
@RestController
public class Test1 {

    @GetMapping("test1")
    public String test1() {

        return "test1" + System.currentTimeMillis();
    }

}
