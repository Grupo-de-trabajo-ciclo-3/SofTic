package com.softic.softa.entities;


import com.softic.softa.enums.Enum_RoleName;
import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "Employee")
public class Employee{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_employee", nullable = false)
    private Long idEmployee; //Clave primaria
//    @Column(name = "id_enterprise")  //Renombramos la columna idEnterprise con la anotación apropiada de base de datos.
//    private Long idEnterprise;

    //Atributos
    @Column(name = "name_employee")
    private String nameEmployee;
    private String email;
    @Column(name = "enterprise_employee")
    private String enterpriseEmployee;
    private String rol;


    //RELACION MUCHOS A UNO
    @ManyToOne
    @JoinColumn(name = "id_enterprise", insertable = false, updatable = false ) // No insertar ni modificar nada en la tabla de contante
    private Enterprise enterprise;

    //Enum
    @Enumerated(EnumType.STRING)
    @Column(name = "role_Name")
    private Enum_RoleName roleName;

}






