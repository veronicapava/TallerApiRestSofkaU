package com.sofkau.demospring.models;

import javax.persistence.*;


@Entity
@Table(name = "usuario")
public class UsuarioModel {
    //Mejora: se coloca un numero de columnas y no se permite que las propiedades sean nulas.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, length =20, nullable = false)
    private Long id;
    @Column(length = 20, nullable = false)
    private String nombre;
    @Column(length = 20, nullable = false)
    private String email;
    @Column(length = 20, nullable = false)
    private Integer prioridad;


    //Se generan getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }
}
