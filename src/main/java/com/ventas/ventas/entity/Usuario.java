package com.ventas.ventas.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.io.Serializable;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="usuario")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_empleado")
    private int id;

    @Column(name="nombre_usuario")
    private String nombreUsuario;

    @Column(name="clave")
    private String clave;

    @OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @MapsId
    @JoinColumn(name = "id_empleado")
    private Empleado empleado;
}
