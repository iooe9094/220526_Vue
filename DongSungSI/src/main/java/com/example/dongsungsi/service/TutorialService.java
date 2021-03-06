package com.example.dongsungsi.service;

import com.example.dongsungsi.model.Tutorial;

import java.util.List;
import java.util.Optional;

/**
 * packageName : com.example.dongsungsi.service
 * fileName : TutorialService
 * author : Seok
 * date : 2022-05-25
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-25         Seok          최초 생성
 */

public interface TutorialService {

    public Optional<Tutorial> findById(long id);

    public List<Tutorial> findByPublished(String published);

    public List<Tutorial> findByTitleContaining(String title);

    public List<Tutorial> findAll();

    // insert / update 같이 구성되는 메소드
    public boolean save(Tutorial tutorial);

    public boolean deleteById(Long id);
    public boolean deleteAll();
}