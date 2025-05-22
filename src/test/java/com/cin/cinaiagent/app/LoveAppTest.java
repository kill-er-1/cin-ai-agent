package com.cin.cinaiagent.app;

import cn.hutool.core.lang.UUID;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class LoveAppTest {
    @Resource
    private LoveApp loveApp;

    @Test
    void doChat() {
        String chatId = UUID.randomUUID().toString();
        //第一次
        String message = "你好我是大学生cin";
        String answer = loveApp.doChat(message, chatId);
        Assertions.assertNotNull(answer);//如果为空就会停下
        //第二次
        message = "我喜欢的人是安子乐，她有男朋友了";
         answer =  loveApp.doChat(message,chatId);
        Assertions.assertNotNull(answer);
        //第三次
        message = "请问我喜欢的人是谁？我刚告诉你了，请帮我回忆";
         answer =  loveApp.doChat(message,chatId);
        Assertions.assertNotNull(answer);
    }
}