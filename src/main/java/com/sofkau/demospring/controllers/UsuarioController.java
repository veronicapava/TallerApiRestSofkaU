package com.sofkau.demospring.controllers;

import com.sofkau.demospring.models.UsuarioModel;
import com.sofkau.demospring.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

import static org.aspectj.weaver.tools.cache.SimpleCacheFactory.path;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    //Metodo para obtener usuario
    @GetMapping()
    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }

    //Metodo para regresar el usuario con id
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
