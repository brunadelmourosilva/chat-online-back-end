package com.example.chatonline.services;

import com.example.chatonline.domain.Usuario;
import com.example.chatonline.repositories.UsuarioRepository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repo;

    public List<Usuario> findAll(){
        return repo.findAll();
    }

    public Usuario findById(Integer id){
        Optional<Usuario> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(1, "Não encontrado"));
    }
}