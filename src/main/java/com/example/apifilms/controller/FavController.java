package com.example.apifilms.controller;


import com.example.apifilms.entities.FilmFav;
import com.example.apifilms.repositories.FavRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController


public class FavController {


    @Autowired
    private FavRepo favRepo;


    @CrossOrigin(origins = "*")
    @GetMapping("/fav")
    public List<FilmFav> getFav(){
        return favRepo.findAll();
    }


    @CrossOrigin(origins = "*")
    @PostMapping("/fav")
    public FilmFav addFav(@RequestBody FilmFav fav){

        return favRepo.save(fav);

    }


    @CrossOrigin(origins = "*")
    @DeleteMapping("/fav/{id}")
    public void deleteFav(@PathVariable Long id){
        favRepo.deleteById(id);
    }




}
