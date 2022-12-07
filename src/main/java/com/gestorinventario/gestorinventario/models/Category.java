package com.gestorinventario.gestorinventario.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="categoria")
public class Category {
    @Id
    @Getter @Setter @Column(name="idcategoria")
    private Integer idCategoria;
    @Getter @Setter @Column(name="nombre")
    private String nombre;
    @Getter @Setter @Column(name="descripcion")
    private String descripcion;
    @Getter @Setter @Column(name="estado")
    private Boolean estado;

}
