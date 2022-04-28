package com.ryg.demo.model;
import lombok.NonNull;
import javax.persistence.*;

@Entity
@Table(name = "tipo_status")
public class TipoStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estado")
    private int idEstado;

    @NonNull
    @Column(unique = true)
    private String status;
}
