package com.novatec.qrpet.tarefas.service;

import com.novatec.qrpet.tarefas.dto.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsuarioService {

    private static final Map<Long, Usuario> usuarios = new HashMap<>();

    public Usuario criar(Usuario usuario){
        Long proximoId = usuarios.keySet().size()+1L;
        usuario.setId(proximoId);
        usuarios.put(proximoId, usuario);
        return usuario;
    }

    public Usuario atualizar(Usuario usuario, Long id){
        usuarios.put(id,usuario);
        return usuario;
    }

    public Usuario readOne(Long id){
        return usuarios.get(id);
    }

    public List<Usuario> readList(){
        return new ArrayList<>(usuarios.values());
    }

    public String delete(Long id){
        usuarios.remove(id);
        return "DELETED";
    }


}
