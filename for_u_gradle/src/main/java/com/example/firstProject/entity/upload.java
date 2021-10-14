package com.example.firstProject.entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@ToString
@Getter
@Setter
@NoArgsConstructor
public class upload {

    @Id
    @GeneratedValue
    private Long id;


    private String email;//이메일! 주로 이걸로 찾을듯!


    private String post; //계시물 글 내용

    private String fileName; // 파일 이름

    private String fileOrName; //파일 진짜 이름

    private String fileUrl;

    private long Latitude; //위도

    private long Hardness; //경도

    private String date; //업로드 날짜



}
