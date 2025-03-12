package com.example.backend.repositories;

import com.example.backend.models.Bookmarks;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BookmarksRepository extends JpaRepository<Bookmarks, UUID> {
}