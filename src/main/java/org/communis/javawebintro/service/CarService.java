package org.communis.javawebintro.service;//package org.communis.javawebintro.service;
//
//import org.communis.javawebintro.config.CarDetailsImp;
//import org.communis.javawebintro.config.UserDetailsImp;
//import org.communis.javawebintro.config.ldap.CustomPerson;
//import org.communis.javawebintro.dto.CarWrapper;
//import org.communis.javawebintro.dto.LdapAuthWrapper;
//import org.communis.javawebintro.dto.UserWrapper;
//import org.communis.javawebintro.entity.Car;
//import org.communis.javawebintro.entity.LdapAuth;
//import org.communis.javawebintro.enums.CarPlaces;
//import org.communis.javawebintro.enums.CarType;
//import org.communis.javawebintro.exception.ServerException;
//import org.communis.javawebintro.exception.error.ErrorCodeConstants;
//import org.communis.javawebintro.exception.error.ErrorInformationBuilder;
//import org.communis.javawebintro.repository.CarRepository;
//import org.communis.javawebintro.utils.LdapUtil;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.ldap.AttributeInUseException;
//import org.springframework.ldap.core.DirContextAdapter;
//import org.springframework.ldap.core.DirContextOperations;
//import org.springframework.ldap.core.LdapTemplate;
//import org.springframework.ldap.query.LdapQuery;
//import org.springframework.ldap.query.LdapQueryBuilder;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.session.SessionInformation;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import javax.naming.InvalidNameException;
//import javax.naming.NamingException;
//import javax.naming.directory.Attribute;
//import javax.naming.directory.BasicAttribute;
//import javax.naming.directory.DirContext;
//import java.util.*;
//
//@Service
//@Transactional(rollbackFor = ServerException.class)
//public class CarService /*implements UserDetailsService*/ {
//
//    private final CarRepository carRepository;
//    //private final PermissionRepository permissionRepository;
//    //private final BCryptPasswordEncoder bCryptPasswordEncoder;
//    //private final SessionRegistry sessionRegistry;
//    //private final LdapAuthRepository ldapAuthRepository;
//
//    @Autowired
//    public CarService(CarRepository carRepository) {
//        this.carRepository = carRepository;
//    }
//
//    /* /**
//     * Получает из базы машину по АЙДИ???, его разрешения и формирует объект класса {@link CarDetailsImp}
//     *
//     *//*
//
//    public String loadCarByCarname(String login) throws CarnameNotFoundException {
//        return carRepository.findFirstByLogin(login)
//                .map(CarWrapper::new)
//                .map(car -> new CarDetailsImp(car, permissionRepository.findActionsByRole(car.getRole())))
//                .orElseThrow(() -> new CarnameNotFoundException(ErrorCodeConstants.messages.get(ErrorCodeConstants.DATA_NOT_FOUND)));
//    }*/
//
////    /**
////     * Получает машину из текущей сессии
////     *
////     * @return сущность машины
////     */
////    @Transactional(noRollbackFor = ServerException.class)
////    public Car getCurrentCar() throws ServerException {
////        try {
////            Authentication authentication = SecurityContextHolder.getContext().getAuthentication(); // Вероятно убрать
////
////            CarDetailsImp carDetails = (CarDetailsImp) authentication.getPrincipal();
////            CarWrapper car = carDetails.getCar();
////            return getCar(car.getId());
////        } catch (Exception ex) {
////            throw new ServerException(ErrorInformationBuilder.build(ErrorCodeConstants.CAR_INFO_ERROR), ex);
////        }
////    }
//
////    /**
////     * Добавляет машину из ldap-сервера в базу
////     *
////     * @param car информация об атрибутах пользователя на ldap-сервере
////     * @return информация о добавленном пользователе
////     */
//
////    public CarDetailsImp addCarFromLdap(Car car) throws ServerException {
////        try {
////
////            carRepository.save(car);
////
////            return new CarDetailsImp(new CarWrapper(car),
////                    carRepository.findByFirm(car.getFirm()));
////
////        } catch (Exception ex) {
////            throw new ServerException(ErrorInformationBuilder.build(ErrorCodeConstants.CAR_ADD_ERROR), ex);
////        }
////    }
//
//    /**
//     * Добавляет информацию о новом пользователе в базу из {@link CarWrapper}
//     *
//     * @param carWrapper инфомарция о новом пользователе
//     * @return CustomHttpObject с кодом "OK" или с кодом "ERROR" и сообщением об ошибке
//     */
//    public void add(CarWrapper carWrapper) throws ServerException {
//        try {
//            Car car = new Car();
//            carWrapper.fromWrapper(car);
//
//            carRepository.save(car);
//        } catch (Exception ex) {
//            throw new ServerException(ErrorInformationBuilder.build(ErrorCodeConstants.CAR_ADD_ERROR), ex);
//        }
//    }
//
//    /**
//     * Обновляет информацию о пользователе в базе из {@link CarWrapper}
//     *
//     * @param carWrapper инфомарция о пользователе
//     * @return CustomHttpObject с кодом "OK" или с кодом "ERROR" и сообщением об ошибке
//     */
//    public void edit(CarWrapper carWrapper) throws ServerException {
//        try {
//            Car car = getCar(carWrapper.getId());
//            carWrapper.fromWrapper(car);
//            carRepository.save(car);
//
//        } catch (ServerException ex) {
//            throw ex;
//        } catch (Exception ex) {
//            throw new ServerException(ErrorInformationBuilder.build(ErrorCodeConstants.CAR_UPDATE_ERROR), ex);
//        }
//    }
//
//    /**
//     * Получает информацию о машине с заданным идентификатором из базы и пребразует ее в объект класса {@link CarWrapper}
//     *
//     * @param id идентификатор машины
//     * @return объект, содержащий информацию о машине
//     */
//    public CarWrapper getById(Long id) throws ServerException {
//        try {
//            return new CarWrapper(getCar(id));
//        } catch (ServerException ex) {
//            throw ex;
//        } catch (Exception ex) {
//            throw new ServerException(ErrorInformationBuilder.build(ErrorCodeConstants.CAR_INFO_ERROR), ex);
//        }
//    }
//
/////////////////////////////////////
//    private Car getCar(Long id) throws ServerException {
//        return carRepository.findById(id)
//                .orElseThrow(() -> new ServerException(ErrorInformationBuilder.build(ErrorCodeConstants.DATA_NOT_FOUND)));
//    }
//
//}
