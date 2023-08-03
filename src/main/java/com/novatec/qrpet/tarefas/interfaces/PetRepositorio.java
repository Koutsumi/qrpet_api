package com.novatec.qrpet.tarefas.interfaces;

import com.novatec.qrpet.tarefas.dto.Pet;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepositorio extends MongoRepository<Pet, String> {
}
