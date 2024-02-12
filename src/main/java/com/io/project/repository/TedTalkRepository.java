package com.io.project.repository;

import com.io.project.model.TedTalkModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TedTalkRepository extends CrudRepository<TedTalkModel, Long> {
}
