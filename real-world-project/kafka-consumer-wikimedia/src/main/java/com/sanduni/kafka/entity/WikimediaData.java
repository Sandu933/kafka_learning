package com.sanduni.kafka.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Entity
@Getter
@Setter
@Table(name = "wikimedia_recentchanges")
public class WikimediaData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
//    since the size of eventData is huge, we can use this @Lob
    @Lob
    private String eventData;
}
