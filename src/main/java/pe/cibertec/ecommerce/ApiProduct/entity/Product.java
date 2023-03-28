/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiProduct.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import java.math.BigDecimal;
import lombok.Data;

@Entity
@Table(name="Productos")
@Data
public class Product {
    @Id
    @Column(name="idProducto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="nombreProducto")
    private String name;
    @Column(name="descripcion")
    private String description;
    @Column(name="precioUnitario")
    private BigDecimal unitPrice;
    @Column(name="imagenUrl")
    private String imageurl;
}
