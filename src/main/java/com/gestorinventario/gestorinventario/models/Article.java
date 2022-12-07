package com.gestorinventario.gestorinventario.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="articulo")
public class Article {
    @Id
    @Getter
    @Setter
    @Column(name="idarticulo")
    private Integer idarticulo;
    @Getter @Setter @Column(name="codigo")
    private String codigo;
    @Getter @Setter @Column(name="nombre")
    private String nombre;
    @Getter @Setter @Column(name="precio_venta")
    private String precio_venta;
    @Getter @Setter @Column(name="stock")
    private String stock;
    @Getter @Setter @Column(name="descripcion")
    private String descripcion;
    @Getter @Setter @Column(name="estado")
    private Boolean estado;
    @Getter @Setter @Column(name="idcategoria")
    private Boolean idcategoria;

}
