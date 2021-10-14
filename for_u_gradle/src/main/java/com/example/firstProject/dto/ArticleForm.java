package com.example.firstProject.dto;

import com.example.firstProject.entity.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor //자동 생성자 생성
@ToString           //자동 투스트링 재정의
@Getter
@Setter
public class ArticleForm {

    private Long id;
    private String title;
    private String content;


    //생성자
//    public ArticleForm(String title, String content) {
//        this.title = title;
//        this.content = content;
//    }


    //투스트링 재정의
//    @Override
//    public String toString() {
//        return "ArticleForm{" +
//                "title='" + title + '\'' +
//                ", content='" + content + '\'' +
//                '}';
//    }

    public Article toEntity() {
        return new Article(id,title,content);
    }//insert
}
