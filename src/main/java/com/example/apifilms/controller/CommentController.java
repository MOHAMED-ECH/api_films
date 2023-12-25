package com.example.apifilms.controller;


import com.example.apifilms.entities.Commentaire;
import com.example.apifilms.repositories.CommentaireRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/api")
public class CommentController {


    @Autowired
    private CommentaireRep commentaireRep;


    @CrossOrigin(origins = "*")
    @GetMapping("/comments/{id}")
    List<Commentaire> getComments(@PathVariable Long id){
        return commentaireRep.findByReference(id);

    }

    @CrossOrigin(origins = "*")
    @PostMapping("/comments/")
    Commentaire addComment( @RequestBody Commentaire commentaire){

        return commentaireRep.save(commentaire);

    }



}
