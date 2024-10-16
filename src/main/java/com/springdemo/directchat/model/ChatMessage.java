package com.springdemo.directchat.model;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class ChatMessage {


    private String content;

    private String sender;

    private MessageType type;

    private String time;

    public enum MessageType {
        CHAT,
        JOIN,
        LEAVE
    }
}
