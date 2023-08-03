package com.novatec.qrpet.tarefas.service;

import com.novatec.qrpet.tarefas.dto.Pet;
import com.novatec.qrpet.tarefas.interfaces.PetRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetService {

    private final PetRepositorio petRepositorio;
    @Autowired
    public PetService(PetRepositorio petRepositorio) {
        this.petRepositorio = petRepositorio;
    }

    public Pet criar (Pet pet){
        return petRepositorio.save(pet);
    }

    public List<Pet> readList(){
        return petRepositorio.findAll();
    }

    public Optional<Pet> readOne(String id){
        return petRepositorio.findById(id);
    }

    public Pet atualizar (Pet pet){
        return petRepositorio.save(pet);
    }

    public void delete(String id){
        petRepositorio.deleteById(id);
    }
}
