package com.novatec.qrpet.tarefas.service;

import com.novatec.qrpet.tarefas.dto.Pet;
import com.novatec.qrpet.tarefas.interfaces.Pet_repository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Optional;

@Service
@Validated
public class PetService {

    private final Pet_repository petRepository;
    @Autowired
    public PetService(Pet_repository petRepository) {
        this.petRepository = petRepository;
    }

    public Pet criar (@Valid Pet pet){
        return petRepository.save(pet);
    }

    public List<Pet> readList(){
        return petRepository.findAll();
    }

    public Optional<Pet> readOne(String id){
        return petRepository.findById(id);
    }

    public Pet atualizar (@Valid Pet pet){
        return petRepository.save(pet);
    }

    public void delete(String id){
        petRepository.deleteById(id);
    }
}
