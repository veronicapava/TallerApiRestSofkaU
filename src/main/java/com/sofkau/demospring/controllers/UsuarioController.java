package com.sofkau.demospring.controllers;

import com.sofkau.demospring.models.UsuarioModel;
import com.sofkau.demospring.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;
<<<<<<< HEAD
=======

import static org.aspectj.weaver.tools.cache.SimpleCacheFactory.path;
>>>>>>> 8797c83c417a669f3913f39e990ccca8d17e5a34

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

<<<<<<< HEAD
    //Metodo para obtener usuarios
=======
    //Metodo para obtener usuario
>>>>>>> 8797c83c417a669f3913f39e990ccca8d17e5a34
    @GetMapping()
    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }

<<<<<<< HEAD

=======
    //Metodo para regresar el usuario con id
>>>>>>> 8797c83c417a669f3913f39e990ccca8d17e5a34
    @PostMapping()
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario){
        return this.usuarioService.guardarUsuarios(usuario);
    }

    //Metodo para obtener por id
    @GetMapping(path = "/{id}")
    public Optional<UsuarioModel> obtenerUsuarioPorId(@PathVariable("id") Long id){
        return this.usuarioService.obtenerPorID(id);
    }

    //Metodo para obtener por prioridad
    @GetMapping("/query")
    public ArrayList<UsuarioModel> obtenerUsuarioPorPrioridad(@RequestParam("prioridad") Integer prioridad){
        return  this.usuarioService.obtenerPorPrioridad(prioridad);
    }

    //Mejora: se agrega metodo para obtener por nombre
    @GetMapping(path = "/nombre")
    public ArrayList<UsuarioModel> obtenerUsuarioPorNombre(@RequestParam("nombre") String nombre){
        return  this.usuarioService.obtenerPorNombre(nombre);
    }

<<<<<<< HEAD
    //Mejora: se agrega metodo para obtener por email
    @GetMapping(path = "/email")
    public ArrayList<UsuarioModel> obtenerUsuarioPorEmail(@RequestParam("email") String email){
        return  this.usuarioService.obtenerPorEmail(email);
    }

=======
>>>>>>> 8797c83c417a669f3913f39e990ccca8d17e5a34
    //Metodo para eliminar usuario
    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.usuarioService.eliminarUsuario(id);
        if(ok){
            return "Se eliminó el usuario con id: " + id;
        } else {
            return "No se pudo eliminar el usuario con id: " + id;
        }
    }

}
