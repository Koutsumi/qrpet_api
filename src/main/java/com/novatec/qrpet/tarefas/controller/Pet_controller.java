package com.novatec.qrpet.tarefas.controller;

import com.novatec.qrpet.tarefas.dto.Pet;
import com.novatec.qrpet.tarefas.service.PetService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping(value = "/pets")
@Validated
public class Pet_controller {

    @Autowired
    private PetService petService;

    @PostMapping
    public ResponseEntity<Pet> criar(@Valid @RequestBody Pet pet) {
        System.out.println("teste");
        Pet petCriado = petService.criar(pet);
        return new ResponseEntity<>(petCriado,HttpStatus.CREATED);
    }

    @GetMapping
    @ResponseBody
    public List<Pet> getAll(){
        return petService.readList();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pet> getProductById(@PathVariable String id) {
        Optional<Pet> product = petService.readOne(id);
        return product.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/user/{userID}")
    public ResponseEntity<List<Pet>> getRegistrosByUserID(@PathVariable String userID) {
        List<Pet> registros = petService.getRegistrosByUserID(userID);

        if (registros.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(registros);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Pet> updateProduct(@PathVariable String id,@Valid @RequestBody Pet pet) {
        pet.setId(id);
        Pet updatedProduct = petService.atualizar(pet);
        return new ResponseEntity<>(updatedProduct, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        petService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
