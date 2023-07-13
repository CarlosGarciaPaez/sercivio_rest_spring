package com.example.crud.demo.service;

import com.example.crud.demo.entity.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface UsuarioService {
    public Iterable<Usuario> findAll();
    public Page<Usuario> findAll(Pageable pageable);
    public Optional<Usuario> findById(Integer id);
    public Usuario save(Usuario alumno);
    public void deleteById(Integer id);
}
