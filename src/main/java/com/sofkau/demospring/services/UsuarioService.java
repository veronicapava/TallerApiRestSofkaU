package com.sofkau.demospring.services;

import com.sofkau.demospring.models.UsuarioModel;
import com.sofkau.demospring.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    //Metodo para obtener los usuarios
    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }

    //Metodo para guardar usuario, si le enviamos el id actualiza el usuario, si no se lo enviamos crea uno nuevo
    public UsuarioModel guardarUsuarios(UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }

    //Optional para que devuelva si existe el parametro que le pasemos
    public Optional<UsuarioModel> obtenerPorID(Long id){
        return usuarioRepository.findById(id);
    }

    public ArrayList<UsuarioModel> obtenerPorPrioridad(Integer prioridad){
        return usuarioRepository.findByPrioridad(prioridad);
    }

    //Mejora: se añade metodo para buscar por nombre
    public ArrayList<UsuarioModel> obtenerPorNombre(String nombre){
        return usuarioRepository.findByNombre(nombre);
    }

<<<<<<< HEAD
    //Mejora: se añade metodo para buscar por email
    public ArrayList<UsuarioModel> obtenerPorEmail(String email){
        return usuarioRepository.findByEmail(email);
    }

=======
>>>>>>> 8797c83c417a669f3913f39e990ccca8d17e5a34
    public boolean eliminarUsuario(Long id){
        try{
            usuarioRepository.deleteById(id);
            return true;
        } catch (Exception err){
            return false;
        }
    }
}
