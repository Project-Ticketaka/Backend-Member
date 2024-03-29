package com.ticketaka.member.dto;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum StatusCode {
    // 성공
    OK(200, "성공"),
    // 존재하지 않는 회원
    NO_MEBMER(404,"존재하지 않는 회원 정보입니다"),
    INVALID_NUM(404,"잘못된 인증번호 입니다"),
    // email 중복
    DUPLICATE_EMAIL(409, "중복된 이메일 입니다"),
    DUPLICATE_MEMBER(409,"이미 존재하는 회원입니다");

    private final int code;
    private final String description;
    StatusCode(int code, String description) {
        this.code = code;
        this.description = description;
    }
}
