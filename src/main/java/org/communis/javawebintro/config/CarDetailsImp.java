package org.communis.javawebintro.config;//package org.communis.javawebintro.config;
//
//import org.communis.javawebintro.dto.CarWrapper;
//import org.communis.javawebintro.entity.Car;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Optional;
//import java.util.Set;
//
///**
// * Класс для представления данных автомобиля из текущей сессии
// */
//
//public class CarDetailsImp /*implements UserDetails */ {
//
//    private final CarWrapper car;
//
//    private Set<GrantedAuthority> authorities;
//
//    public CarDetailsImp(CarWrapper car, List<CarAction> actions) {
//        if (car == null) {
//            throw new NullPointerException("CarWrapper is NULL");
//        }
//        this.car = car;
//
//        authorities = new HashSet<>();
//        if (car.getCartype() != null)
//            authorities.add(new SimpleGrantedAuthority(car.getCartype().name()));
//        actions.forEach(a -> authorities.add(new SimpleGrantedAuthority(a.name())));
//    }
//
//    public CarDetailsImp(CarWrapper car, Optional<Car> byFirm) {
//        this.car = car;
//    }
//
//    public CarWrapper getCar() {return car;}
//
//}