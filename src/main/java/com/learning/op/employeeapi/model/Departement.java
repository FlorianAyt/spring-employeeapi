package com.learning.op.employeeapi.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
@Table(name="departements")
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nom_departement")
    @NotNull
    private String nom;

    @OneToMany(mappedBy = "departement")
    private Collection <Employee> employees;

}
