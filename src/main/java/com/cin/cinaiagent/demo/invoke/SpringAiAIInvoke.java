package com.cin.cinaiagent.demo.invoke;

import jakarta.annotation.Resource;
import org.springframework.ai.chat.messages.AssistantMessage;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author cin
 * @version 1.0
 * @date 2025/5/17 15:54
 * @className SpringAiAIInvoke
 */
@Component
public class SpringAiAIInvoke implements CommandLineRunner {
//commandLineRunner接口只有唯一的方法，run为了让spring启动时就执行
    @Resource
    private ChatModel dashscope ;//按名称去搜索注入
    @Override
    public void run(String... args) throws Exception {
        AssistantMessage output = dashscope.call(new Prompt("你好，我是cin"))
                .getResult()
                .getOutput();
        System.out.println(output.getText());
    }
}
