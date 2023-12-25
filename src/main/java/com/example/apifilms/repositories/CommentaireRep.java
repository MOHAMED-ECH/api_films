package com.example.apifilms.repositories;

import com.example.apifilms.entities.Commentaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CommentaireRep extends JpaRepository<Commentaire, Long> {


    List<Commentaire> findByReference(Long reference);
}
