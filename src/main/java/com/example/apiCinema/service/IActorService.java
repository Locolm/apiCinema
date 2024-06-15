package com.example.apiCinema.service;

import com.example.apiCinema.domains.EntityActor;

import java.util.List;

public interface IActorService {
    public EntityActor create(EntityActor actor);
    public List<EntityActor> read();
    public EntityActor update(Integer id, EntityActor actor);
    public String delete(Integer id);
}
