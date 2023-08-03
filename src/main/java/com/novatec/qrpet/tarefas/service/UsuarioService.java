package com.novatec.qrpet.tarefas.service;

import com.novatec.qrpet.tarefas.dto.Usuario;
import com.novatec.qrpet.tarefas.interfaces.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    private final UsuarioRepositorio usuarioRepositorio;
    @Autowired
    public UsuarioService(UsuarioRepositorio usuarioRepositorio) {
        this.usuarioRepositorio = usuarioRepositorio;
    }

    public Usuario criar(Usuario usuario){
        return usuarioRepositorio.save(usuario);
    }

    public List<Usuario> readList(){
        return usuarioRepositorio.findAll();
    }

    public Optional<Usuario> readOne(String id){
        return usuarioRepositorio.findById(id);
    }

    public Usuario atualizar(Usuario usuario){
        return usuarioRepositorio.save(usuario);
    }

    public void delete(String id){
        usuarioRepositorio.deleteById(id);
    }


}
