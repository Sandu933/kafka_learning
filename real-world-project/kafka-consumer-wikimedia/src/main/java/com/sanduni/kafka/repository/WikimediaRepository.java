package com.sanduni.kafka.repository;

import com.sanduni.kafka.entity.WikimediaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikimediaRepository extends JpaRepository<WikimediaData, Long> {}