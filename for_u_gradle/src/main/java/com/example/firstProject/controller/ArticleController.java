package com.example.firstProject.controller;

import com.example.firstProject.dto.ArticleForm;
import com.example.firstProject.entity.Article;
import com.example.firstProject.repository.ArticleRepository;
import com.example.firstProject.repository.ArticleRepository2;
import com.example.firstProject.repository.TestArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

@Controller
@Slf4j //로깅을 위한 골뱅이 (어노테이션 )
public class ArticleController {

    @Autowired //스프링 부트가 미리 생성해놓은 객체를 가져다가 자동연결!
    private ArticleRepository articleRepository;
    private ArticleRepository2 articleRepository2;
    private TestArticleRepository testArticleRepository;


    @GetMapping("/articles/new")
    public String newArticleForm() {
        return"articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form , Model model) {
        log.info(form.toString());

//        System.out.println(form.toString());-> 로깅 기능으로 대체
//        실제 서버에서는 sout 을 절대로 사용하면 안됨!
          //로그도 안남고 속도에 엄청난 영향을줌


        //1. Dto를 변환! Entity!
        Article article =form.toEntity();
        log.info("article.tostring={}",article.toString());


        //2.Repository에 Entity를 DB 안에 저장하게 함!
       Article saved = articleRepository.save(article);

            model.addAttribute("tit",saved.getTitle());
             model.addAttribute("pick",saved.getContent());
        return "articles/create";
    }
    @GetMapping("/yes/{id}")
    public String iwantSee(Model model, @PathVariable Long id) {

//        model.addAttribute("tit",articleRepository.findAll());
        model.addAttribute("tit", articleRepository.findById(id));
        log.info("articleRepository.findAll()={}",articleRepository.findAll());


        return "yes"; //
    }

//    @GetMapping("/here")
//    public String iam (Model model){
//
//        model.addAttribute("his",articleRepository2.findAll());
//        log.info("articleRepository2.findAll()={}",articleRepository2.findAll());
//        return "here";


//}
        @RequestMapping(value = "/here",method = RequestMethod.GET)
    public @ResponseBody List<Article> articleslist () {
        return testArticleRepository.findAll();
        }


}
