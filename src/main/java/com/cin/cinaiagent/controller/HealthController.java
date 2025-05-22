package com.cin.cinaiagent.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cin
 * @version 1.0
 * @date 2025/5/17 14:34
 * @className HealthController
 */
@RestController//方法返回的都将作为http请求的响应体
@RequestMapping("/health")
public class HealthController {
    @GetMapping
    public String checkHealth() {
        return "ok";
    }
}
