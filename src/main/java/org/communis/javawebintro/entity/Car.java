package org.communis.javawebintro.entity;//package org.communis.javawebintro.entity;
//
//import lombok.*;
//import javax.persistence.*;
//import java.math.BigInteger;
//
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
//@ToString
//@EqualsAndHashCode
//@Entity
//@Table(name = "cars")
//public class Car {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name = "firm")
//    private String firm;
//
//    @Enumerated(EnumType.STRING)
//    @Column(name = "cartype")
//    //private CarType cartype;
//    private String cartype;
//
//    @Column(name = "places")
//    private int places;
//
//    @ManyToOne(fetch = FetchType.LAZY /*, cascade = {CascadeType.MERGE, CascadeType.PERSIST}*/)
//    @JoinColumn(name = "owner_id", nullable = false)
//    private CarOwner owner;
//
//}