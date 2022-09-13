package com.softic.softa.entities;

import com.softic.softa.enums.Enum_RoleName;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor //Al modelar las clases como entidades hay que tener un constructor vacío para evitar errores a futuro.
@Getter
@Setter
@ToString
@Table(name = "enterprise")
public class Enterprise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_enterprise", nullable = false)
    private Long idEnterprise;

    //Atributos
    @Column(name = "name_enterprise")
    private String nameEnterprise;
    private String address;
    private String phone;
    private String document;

    //RELACION UNO A MUCHOS
    @OneToMany(mappedBy = "enterprise")
    private List<Employee> employees;

}