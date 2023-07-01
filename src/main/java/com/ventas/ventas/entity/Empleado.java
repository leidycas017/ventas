package com.ventas.ventas.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.io.Serializable;

@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="empleado")
public class Empleado extends Persona implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idempleado")
    private int idEmpleado;

    @Column(name = "numero_documento")
    private String numeroDocumento;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "correo")
    private String correo;

    @OneToOne(mappedBy="empleado")
    @PrimaryKeyJoinColumn
    private Usuario usuario;
}
