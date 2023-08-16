package com.novatec.qrpet.tarefas.interfaces;

import com.novatec.qrpet.tarefas.dto.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Usuario_repository extends MongoRepository<Usuario, String> {

}
