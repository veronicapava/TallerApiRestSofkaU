package com.sofkau.demospring.services;

import com.sofkau.demospring.models.UsuarioModel;
import com.sofkau.demospring.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    //Metodo para obtener los usuarios
    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }

    //Metodo para guardar usuario, si le enviamos el id actualiza el usuario, si no se lo enviamos
    //Crea uno nuevo
    public UsuarioModel guardarUsuarios(UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }
}
