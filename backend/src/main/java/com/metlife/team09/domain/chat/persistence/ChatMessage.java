package com.metlife.team09.domain.chat.persistence;

import lombok.Getter;

@Getter
public class ChatMessage {
    // 메시지 타입 : 입장, 채팅, 나감
    public enum MessageType {
        ENTER, TALK, QUIT
    }
    private MessageType type; // 메시지 타입
    private String roomId; // 방번호
    private String senderId; // 메시지 보낸사람
    private String message; // 메시지

    public void setMessage(final String message) {
        this.message = message;
    }
}
