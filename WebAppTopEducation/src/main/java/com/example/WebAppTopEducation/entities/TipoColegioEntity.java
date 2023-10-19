package com.example.WebAppTopEducation.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tipocolegio")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoColegioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id_tipo_colegio;
    private String nombre_tipo;
    private int descuento_tipo;
    private int cuotas;
}
