package com.example.apiCinema.controller;

import com.example.apiCinema.domains.EntityActor;
import com.example.apiCinema.service.ActorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/actor")
@AllArgsConstructor
public class ActorController {
    private final ActorService actorService;

    @PostMapping("/create")
    public EntityActor create(@RequestBody EntityActor actor){
        return actorService.create(actor);
    }

    @GetMapping("/read")
    public List<EntityActor> read(){
        return actorService.read();
    }

    @PutMapping("/update/{id}")
    public EntityActor update(@PathVariable Integer id, @RequestBody EntityActor actor){
        return actorService.update(id, actor);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        return actorService.delete(id);
    }

}
