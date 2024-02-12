package com.io.project.service;

import com.io.project.model.TedTalkModel;
import com.io.project.repository.TedTalkRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TedTalkService {

    private TedTalkRepository repository;
    public TedTalkService(TedTalkRepository repository) {

        this.repository = repository;
    }

    public TedTalkModel getTedTalk(long id) {
        return repository.findById(id).get();
    }

    public TedTalkModel addTedTalk(TedTalkModel model) {
        return repository.save(model);
    }

    public void deleteTedTalk(long id) {
        repository.deleteById(id);
    }

    public Iterable<TedTalkModel> findAll() {
        return repository.findAll();
    }
}
