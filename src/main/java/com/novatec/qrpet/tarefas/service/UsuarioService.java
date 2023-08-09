package com.novatec.qrpet.tarefas.service;

import com.novatec.qrpet.tarefas.dto.Usuario;
import com.novatec.qrpet.tarefas.interfaces.Usuario_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Service
@Validated
public class UsuarioService {
    private final Usuario_repository usuriousRepository;
    @Autowired
    public UsuarioService(Usuario_repository usuarioRepositorio) {
        this.usuriousRepository = usuarioRepositorio;
    }

    public Usuario criar(@Valid Usuario usuario){
        return usuriousRepository.save(usuario);
    }

    public List<Usuario> readList(){
        return usuriousRepository.findAll();
    }

    public Optional<Usuario> readOne(String id){
        return usuriousRepository.findById(id);
    }

    public Usuario atualizar(@Valid Usuario usuario){
        return usuriousRepository.save(usuario);
    }

    public void delete(String id){
        usuriousRepository.deleteById(id);
    }


}
