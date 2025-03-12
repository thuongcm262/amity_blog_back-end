package com.example.backend.repositories;

import com.example.backend.models.PostTag;
import com.example.backend.models.PostTagId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostTagRepository extends JpaRepository<PostTag, PostTagId> {
}