package com.example.firstProject.repository;

import com.example.firstProject.entity.Article;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.annotation.RequiredTypes;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class ArticleRepository2 {
    private final EntityManager entityManager;

    public List<Article> findAll () {
        return entityManager.createQuery("select a from Article a",Article.class)
                .getResultList();
    }
}
