package com.example.apiCinema.service;

import com.example.apiCinema.domains.EntityActor;
import com.example.apiCinema.repositories.EntityActorRepositories;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ActorService implements IActorService{

    public final EntityActorRepositories actorRepositories;

    @Override
    public EntityActor create(EntityActor actor) {
        return actorRepositories.save(actor);
    }

    @Override
    public List<EntityActor> read() {
        return actorRepositories.findAll();
    }

    @Override
    public EntityActor update(Integer id, EntityActor actor) {
        return actorRepositories.findById(id).map(actor1 -> {
            actor1.setGender(actor.getGender());
            actor1.setName(actor.getName());
            actor1.setBirthday(actor.getBirthday());
            actor1.setDeathday(actor.getDeathday());
            actor1.setPlaceOfBirth(actor.getPlaceOfBirth());
            actor1.setProfilePath(actor.getProfilePath());
            actor1.setBiography(actor.getBiography());
            actor1.setPopularity(actor.getPopularity());
            return actorRepositories.save(actor1);
        }).orElseThrow(()-> new RuntimeException("Actor not found with id " + id));
    }

    @Override
    public String delete(Integer id) {
        actorRepositories.deleteById(id);
        return "Actor with id: " + id + " has been deleted successfully";
    }
}
