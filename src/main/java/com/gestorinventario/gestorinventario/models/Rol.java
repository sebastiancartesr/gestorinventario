package com.gestorinventario.gestorinventario.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name="rol")
@Table(name = "rol")
public class Rol {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name="idrol")
    private Integer idrol;
    @Getter @Setter @Column(name="nombre")
    private String nombre;
    @Getter @Setter @Column(name="descripcion")
    private String descripcion;
    @Getter @Setter @Column(name="estado")
    private Boolean estado;

}
