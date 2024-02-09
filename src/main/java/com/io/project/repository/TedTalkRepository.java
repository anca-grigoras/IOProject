package com.io.project.repository;

import com.io.project.model.TedTalkModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface TedTalkRepository extends CrudRepository<TedTalkModel, Long> {
    List<TedTalkModel> findByAuthorAndTitleAndViewsAndLikes(String author, String title, long views, long likes);
}
