package com.example.firstProject.repository;

import com.example.firstProject.entity.upload;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.File;

public interface uploadRepository extends JpaRepository<upload,Long> {

    upload FindByFno (Long fno);
}
