package org.communis.javawebintro.config;//package org.communis.javawebintro.config;
//
//import org.communis.javawebintro.dto.CarWrapper;
//import org.communis.javawebintro.dto.CarownerWrapper;
//import org.communis.javawebintro.entity.CarOwner;
//import org.communis.javawebintro.enums.CarAction;
//import org.communis.javawebintro.enums.CarownerAction;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Optional;
//import java.util.Set;
//
///**
// * Класс для представления данных клиента из текущей сессии
// */
//
//public class CarownerDetailsImp /*implements UserDetails */ {
//
//    private final CarownerWrapper carOwner;
//
//    private Set<GrantedAuthority> authorities;
//
//    public CarownerDetailsImp(CarownerWrapper carOwner, List<CarownerAction> actions) {
//        if (carOwner == null) {
//            throw new NullPointerException("CarownerWrapper is NULL");
//        }
//        this.carOwner = carOwner;
//
//        authorities = new HashSet<>();
//        if (carOwner.getRole() != null)
//            authorities.add(new SimpleGrantedAuthority(carOwner.getRole().name()));
//        actions.forEach(a -> authorities.add(new SimpleGrantedAuthority(a.name())));
//    }
//
//    public CarownerDetailsImp(CarownerWrapper carOwner) {
//        this.carOwner=carOwner;
//    }
//
//    public CarownerWrapper getCarOwner() {return carOwner;}
//}