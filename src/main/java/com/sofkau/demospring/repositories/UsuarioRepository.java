package com.sofkau.demospring.repositories;

import com.sofkau.demospring.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {
    ArrayList<UsuarioModel> findByPrioridad(Integer prioridad);
    ArrayList<UsuarioModel> findByNombre(String nombre);
<<<<<<< HEAD
    ArrayList<UsuarioModel> findByEmail(String email);
=======
>>>>>>> 8797c83c417a669f3913f39e990ccca8d17e5a34
}
