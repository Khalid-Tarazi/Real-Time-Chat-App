package com.chat.app.model;
//this is the class that will represent a particular msg.
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class ChatMessage {
    private Long id;
    private String sender;
    private String content;
}
