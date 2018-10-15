package org.communis.javawebintro.repository;//package org.communis.javawebintro.repository;
//
//import org.communis.javawebintro.entity.Car;
//import org.communis.javawebintro.enums.CarPlaces;
//import org.communis.javawebintro.enums.CarType;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
//
//import java.util.Optional;
//
//public interface CarRepository extends JpaRepository<Car, Long>, JpaSpecificationExecutor<Car> {
//
//    Optional<Car> findByPlaces(CarPlaces places);
//
//    Optional<Car> findByFirm(String firm);
//
//    Optional<Car> findById(Long id);
//
//}
//
