package com.ventas.ventas.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import java.io.Serializable;


@Data
@Entity
@Table(name="producto")
public class Producto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idproducto")
    private int id;
    @Column(name="ean")
    private String ean;
    @Column(name="idproveedor")
    private int idproveedor;
    @Column(name="cantidad")
    private int cantidad;
    @Column(name="descripcion_producto")
    private String nombre;
    @Column(name="fecha_ingreso_producto")
    private String fecha;
    @Column(name="valor_venta")
    private float precio;

    public Producto() {
    }

    public Producto(int cantidad, String ean, String fecha, int idproveedor,@NotBlank String nombre, @NotBlank float precio) {
        this.cantidad = cantidad;
        this.ean = ean;
        this.fecha = fecha;
        this.idproveedor = idproveedor;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public int getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(int idproveedor) {
        this.idproveedor = idproveedor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}