package com.gestorinventario.gestorinventario.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "usuario")
@Table(name = "usuario")
public class Usuario {
    @Id
    @Getter@Setter @Column(name="idusuario")
    private Integer idusuario;
    @ManyToOne
    @Getter @Setter @JoinColumn(name="idrol")
    private Rol rol;
    @Getter @Setter @Column(name="nombre")
    private String nombre;
    @Getter @Setter @Column(name="tipo_documento")
    private String tipo_documento;
    @Getter @Setter @Column(name="num_docuimento")
    private String num_docuimento;
    @Getter @Setter @Column(name="direccion")
    private String direccion;
    @Getter @Setter @Column(name="telefono")
    private String telefono;
    @Getter @Setter @Column(name="email")
    private String email;
    @Getter @Setter @Column(name="password")
    private String password;
    @Getter @Setter @Column(name="estado")
    private Boolean estado;
}






