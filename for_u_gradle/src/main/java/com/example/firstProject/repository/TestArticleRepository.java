package com.example.firstProject.repository;

import com.example.firstProject.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestArticleRepository extends JpaRepository <Article,Long> {

}
