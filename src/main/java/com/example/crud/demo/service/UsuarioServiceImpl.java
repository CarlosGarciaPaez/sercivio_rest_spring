package com.example.crud.demo.service;

import com.example.crud.demo.entity.Usuario;
import com.example.crud.demo.repository.UsuarioRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService{
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Override
    @Transactional(readOnly=true)
    public Iterable<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    @Transactional(readOnly=true)
    public Page<Usuario> findAll(Pageable pageable) {
        // TODO Auto-generated method stub
        return usuarioRepository.findAll(pageable);
    }

    @Override
    @Transactional(readOnly=true)
    public Optional<Usuario> findById(Integer id) {
        // TODO Auto-generated method stub
        return usuarioRepository.findById(id);
    }

    @Override
    @Transactional
    public Usuario save(Usuario alumno) {
        // TODO Auto-generated method stub
        return usuarioRepository.save(alumno);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        // TODO Auto-generated method stub
        usuarioRepository.deleteById(id);
    }
}
