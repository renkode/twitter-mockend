package com.example.bitter.entity;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Hashtag {
    @Id
    @GeneratedValue
    private Integer id;

    private String label;

    private Timestamp firstUsed;

    private Timestamp lastUsed;

    private Boolean deleted;

    @ManyToMany(mappedBy = "hashtags")
    private Set<Tweet> tweets;

}
