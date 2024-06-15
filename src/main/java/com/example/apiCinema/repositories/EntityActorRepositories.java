package com.example.apiCinema.repositories;

import com.example.apiCinema.domains.EntityActor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntityActorRepositories extends JpaRepository<EntityActor, Integer> {
}
