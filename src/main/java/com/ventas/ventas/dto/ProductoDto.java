package com.ventas.ventas.dto;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
public class ProductoDto implements Serializable {
    private String ean;
    private int idproveedor;
    private int cantidad;
    @NotBlank
    private String nombre;
    private String fecha;
    @Min(0)
    private Float precio;
    private int idproducto;


    public ProductoDto() {
    }

    public ProductoDto(int cantidad, String ean, String fecha, int idproveedor,@NotBlank String nombre, @Min(0) Float precio) {
        this.cantidad = cantidad;
        this.ean = ean;
        this.fecha = fecha;
        this.idproveedor = idproveedor;
        this.nombre = nombre;
        this.precio = precio;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
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