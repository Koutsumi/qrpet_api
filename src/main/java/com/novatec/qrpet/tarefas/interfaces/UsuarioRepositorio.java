package com.novatec.qrpet.tarefas.interfaces;

import com.novatec.qrpet.tarefas.dto.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends MongoRepository<Usuario, String> {

}
