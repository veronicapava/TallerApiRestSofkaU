package com.sofkau.demospring.repositories;

import com.sofkau.demospring.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {
    //Busqueda por prioridad por ejemplo
    public abstract ArrayList<UsuarioModel> findByPrioridad(Integer prioridad);
}
