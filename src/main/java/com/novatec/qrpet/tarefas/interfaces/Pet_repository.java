package com.novatec.qrpet.tarefas.interfaces;

import com.novatec.qrpet.tarefas.dto.Pet;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Pet_repository extends MongoRepository<Pet, String> {
}
