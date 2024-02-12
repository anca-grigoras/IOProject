package com.io.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class TedTalkModel {
    private @Id @GeneratedValue
    @Setter(AccessLevel.PROTECTED) Long id;

    private String title;
    private String author;
    private String date;
    private long views;
    private long likes;
    private String link;

    public TedTalkModel(String title, String author, String date, long views, long likes, String link) {
        this.title = title;
        this.author = author;
        this.date = date;
        this.views = views;
        this.likes = likes;
        this.link = link;
    }
}
