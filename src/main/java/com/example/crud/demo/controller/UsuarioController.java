package com.example.crud.demo.controller;

import com.example.crud.demo.entity.Usuario;
import com.example.crud.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService; //Consume la interfaz
    /*
    // Read all Users
    @GetMapping("/app")
    public @ResponseBody Iterable<Usuario> list() {
        Iterable<Usuario> usuarios = usuarioService.findAll();

        return usuarios;
    }*/

    // Read all Users
    @GetMapping("/all")
    public @ResponseBody Iterable<Usuario> read() {
        Iterable<Usuario> usuarios = usuarioService.findAll();

        return usuarios;
    }

    // Read an User
    @GetMapping("/{id}")
    public @ResponseBody Optional<Usuario> read(@PathVariable(value = "id") Integer usuarioId) {
        Optional<Usuario> oUsuario = usuarioService.findById(usuarioId);

        return oUsuario;
    }

    // Create a new User
    @PostMapping("/create")
    public @ResponseBody Usuario create(@RequestBody Usuario usuario) {
        return usuarioService.save(usuario);
    }

    // Update an User
    @PutMapping("/{id}")
    public @ResponseBody Usuario update(@RequestBody Usuario usuario, @PathVariable(value = "id") Integer usuarioId) {
        return usuarioService.save(usuario);
    }

    // Delete an User
    @DeleteMapping("/del/{id}")
    public @ResponseBody void delete(@PathVariable(value = "id") Integer usuarioId) {
        usuarioService.deleteById(usuarioId);

    }
}
