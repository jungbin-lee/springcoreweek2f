package com.sparta.springcoreweek2.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class BlogRequestDto {
    private String title;
    private String username;
    private String contents;


}
