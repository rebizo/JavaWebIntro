package org.communis.javawebintro.dto;//package org.communis.javawebintro.dto;
//
//import lombok.Data;
//import org.communis.javawebintro.entity.Car;
//import org.communis.javawebintro.enums.CarType;
//
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
//import java.io.Serializable;
//
//@Data
//public class CarWrapper implements ObjectWrapper<Car>, Serializable {
//
//    /*private final String EMAIL_REGEXP = "(.+@.+)";*/
//
//    private Long id;
//
//    @NotNull
//    @Size(max = 100)
//    private String firm;
//
//    @NotNull
//    @Size(max = 100)
//    private CarType cartype;
//
//    @NotNull
//    @Size(max = 6)
//    private int places;
//
//    @NotNull
//    @Size(max = 100)
//    private String owner;
//
//    public CarWrapper(Car car) {}
//
//    public CarWrapper() {}
//
////    public CarWrapper(Car car) {
////        toWrapper(car);
////    }
//
//    @Override
//    public void toWrapper(Car item) {
//        if (item != null) {
//            id = item.getId();
//            firm = item.getFirm();
//            cartype = item.getCartype();
//            places = item.getPlaces();
//        }
//    }
//
//    @Override
//    public void fromWrapper(Car item) {
//        if (item != null) {
//            item.setFirm(firm);
//            item.setCartype(cartype);
//            item.setPlaces(places);
//        }
//    }
//}