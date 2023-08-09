package com.novatec.qrpet.tarefas.controller;

import com.novatec.qrpet.tarefas.dto.Usuario;
import com.novatec.qrpet.tarefas.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value = "/usuario")
@Validated
public class Usuario_controller {
    @Autowired
    private final UsuarioService usuarioService;

    public Usuario_controller(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<Usuario> criar(@Valid @RequestBody Usuario usuario) {
        Usuario usuarioCriado = usuarioService.criar(usuario);
        return new ResponseEntity<>(usuarioCriado,HttpStatus.CREATED);
    }

    @GetMapping
    @ResponseBody
    public List<Usuario> getAll(){
        return usuarioService.readList();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getProductById(@PathVariable String id) {
        Optional<Usuario> product = usuarioService.readOne(id);
        return product.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Usuario> updateProduct(@Valid @PathVariable String id, @RequestBody Usuario usuario) {
        usuario.setId(id);
        Usuario updatedProduct = usuarioService.atualizar(usuario);
        return new ResponseEntity<>(updatedProduct, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        usuarioService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}