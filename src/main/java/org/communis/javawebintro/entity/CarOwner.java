package org.communis.javawebintro.entity;//package org.communis.javawebintro.entity;
//
//import lombok.Data;
//import lombok.EqualsAndHashCode;
//import lombok.*;
//import javax.persistence.*;
//import java.util.List;
//import java.util.Set;
//
//@Data
//@ToString
//@EqualsAndHashCode
//@Entity
//@Table(name = "carowners")
//public class CarOwner {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "owner_id")
//    private Long id;
//
//    @Column(name = "name")
//    private String name;
//
//    @Column(name = "surname")
//    private String surname;
//
//    @Column(name = "role")
//    //private CarownerRole role;
//    private String role;
//
//    @OneToMany(/*fetch = FetchType.LAZY,*/ mappedBy = "carowners", cascade = CascadeType.ALL)
//    //private Set<String> owners;
//    //private Set<Car> owners;
//    private List<Car> cars;
//
//}