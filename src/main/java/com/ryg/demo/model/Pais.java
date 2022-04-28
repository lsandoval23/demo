package com.ryg.demo.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "pais")
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pais")
    private int idPais;

    @NonNull
    @Column(unique = true)
    private String pais;

    @Column(name = "codigo_pais")
    private String codigoPais;


}
