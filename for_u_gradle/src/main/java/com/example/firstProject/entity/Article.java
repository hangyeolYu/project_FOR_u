package com.example.firstProject.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity //DB가 해당 객체를 인식 가능!
@AllArgsConstructor //필드에 있는 모든 걸 가지고 생성자를 만들어줌!
@ToString
@Getter
@NoArgsConstructor//빈생성자
public class Article {

    @Id //대표값을 지정! like a 주민등록번호
    @GeneratedValue//1,2,3,....자동생성 어노테이션!
    private Long id;


    @Column
    private String title;

    @Column
    private String content;




}
