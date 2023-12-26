package com.example.apifilms.repositories;

import com.example.apifilms.entities.FilmFav;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavRepo extends JpaRepository<FilmFav, Long> {
}
