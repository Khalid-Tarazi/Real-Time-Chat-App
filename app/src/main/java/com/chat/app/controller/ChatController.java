package com.chat.app.controller;
//handle all incoming messages sent from frontend, and broadcast it to all clients.
import com.chat.app.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class ChatController {

    @MessageMapping("/sendMessage") //map websocket msgs to the destination.
    @SendTo("/topic/messages") //the return, where the msg will go

    public ChatMessage sendMessage(ChatMessage message) {
        return message;
    }

    //we need one more endpoint for thymeleaf
    @GetMapping("chat")

    public String chat() {
        return "chat";
    }
}
