package com.example.crudrapido.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data //para sustituri los getters y setters por los lombok
@Entity //para marcar la clase como una entidad de base de datos
@Table(name = "tbl_students") //para especificar el nombre de la tabla en la base de datos
public class Student {
    @Id //para marcar la columna como clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //para establecer la estrategia de generación de valores automáticos
    private Long studentId;

    private String firstName;

    private String lastName;

    @Column(name = "email_address",unique = true,nullable = false)
    private String email;


}
