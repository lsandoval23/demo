package com.ryg.demo.model;


import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "tipo_telefonos")
public class TipoTelefono {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_telefono")
    private int idTipoTelefono;

    @NonNull
    @Column(unique = true)
    private String tipo;

}
