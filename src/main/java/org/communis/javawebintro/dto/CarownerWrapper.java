package org.communis.javawebintro.dto;//package org.communis.javawebintro.dto;
//
//import lombok.Data;
//import org.communis.javawebintro.entity.CarOwner;
//import org.communis.javawebintro.entity.Car;
//import org.communis.javawebintro.enums.CarownerRole;
//
//import javax.persistence.Enumerated;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
//import java.io.Serializable;
//import java.util.Set;
//
//@Data
//public class CarownerWrapper implements ObjectWrapper<CarOwner>, Serializable {
//
//    /*private final String EMAIL_REGEXP = "(.+@.+)";*/
//
//    private Long id;
//
//    @NotNull
//    @Size(max = 100)
//    private String name;
//
//    @NotNull
//    @Size(max = 100)
//    private String surname;
//
//    @NotNull
//    /* @Size(max = 100)*/
//    private Set<Car> cars;
//
//    @Enumerated
//    private CarownerRole role;
//
//    public CarownerWrapper() {}
//
//    public CarownerWrapper(CarOwner carOwner) {
//        toWrapper(carOwner);
//    }
//
//    @Override
//    public void toWrapper(CarOwner item) {
//        id = item.getId();
//        name = item.getName();
//        surname = item.getSurname();
//        cars = item.getCars();
//        role = item.getRole();
//    }
//
//    @Override
//    public void fromWrapper(CarOwner item) {
//        if (item != null) {
//            item.setId(id);
//            item.setName(name);
//            item.setSurname(surname);
//            item.setCars(cars);
//            item.setRole(role);
//        }
//    }
//}