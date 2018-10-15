package org.communis.javawebintro.service;//package org.communis.javawebintro.service;
//
//import org.communis.javawebintro.dto.CarownerWrapper;
//import org.communis.javawebintro.entity.CarOwner;
//import org.communis.javawebintro.exception.ServerException;
//import org.communis.javawebintro.exception.error.ErrorCodeConstants;
//import org.communis.javawebintro.exception.error.ErrorInformationBuilder;
//import org.communis.javawebintro.repository.CarownerRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//@Service
//@Transactional(rollbackFor = ServerException.class)
//public class CarownerService /*implements UserDetailsService*/ {
//
//    private final CarownerRepository carownerRepository;
//    //private final PermissionRepository permissionRepository;
//    //private final BCryptPasswordEncoder bCryptPasswordEncoder;
//    //private final SessionRegistry sessionRegistry;
//    //private final LdapAuthRepository ldapAuthRepository;
//
//    @Autowired
//    public CarownerService(CarownerRepository carownerRepository) {
//        this.carownerRepository = carownerRepository;
//    }
//
//    /*     /**
//     * Получает из базы машину по АЙДИ???, его разрешения и формирует объект класса {@link CarownerDetailsImp}
//     *
//     *//*
//
//    public String loadCarownerByCarownername(String login) throws CarownernameNotFoundException {
//        return carRepository.findFirstByLogin(login)
//                .map(CarownerWrapper::new)
//                .map(car -> new CarownerDetailsImp(car, permissionRepository.findActionsByRole(car.getRole())))
//                .orElseThrow(() -> new CarownernameNotFoundException(ErrorCodeConstants.messages.get(ErrorCodeConstants.DATA_NOT_FOUND)));
//    }*/
//
////    /**
////     * Получает владельца из текущей сессии
////     *
////     * @return сущность машины
////     */
////    @Transactional(noRollbackFor = ServerException.class)
////    public CarOwner getCurrentCarowner() throws ServerException {
////        try {
////            Authentication authentication = SecurityContextHolder.getContext().getAuthentication(); // Вероятно убрать
////
////            CarownerDetailsImp carDetails = (CarownerDetailsImp) authentication.getPrincipal();
////            CarownerWrapper car = carDetails.getCarowner();
////            return getCarowner(car.getId());
////        } catch (Exception ex) {
////            throw new ServerException(ErrorInformationBuilder.build(ErrorCodeConstants.CAR_INFO_ERROR), ex);
////        }
////    }
//
////    /**
////     * Добавляет машину из ldap-сервера в базу
////     *
////     * @param carowner информация об атрибутах пользователя на ldap-сервере
////     * @return информация о добавленном пользователе
////     */
////    public CarownerDetailsImp addCarownerFromLdap(CarOwner carowner) throws ServerException {
////        try {
////
////            carownerRepository.save(carowner);
////
////            return new CarownerDetailsImp(new CarownerWrapper(carowner),
////                    carownerRepository.findByName(carowner.getName()));
////
////        } catch (Exception ex) {
////            throw new ServerException(ErrorInformationBuilder.build(ErrorCodeConstants.CAR_ADD_ERROR), ex);
////        }
////    }
//
//    /**
//     * Добавляет информацию о новом пользователе в базу из {@link CarownerWrapper}
//     *
//     * @param carownerWrapper инфомарция о новом пользователе
//     * @return CustomHttpObject с кодом "OK" или с кодом "ERROR" и сообщением об ошибке
//     */
//    public void add(CarownerWrapper carownerWrapper) throws ServerException {
//        try {
//            CarOwner carowner = new CarOwner();
//            carownerWrapper.fromWrapper(carowner);
//
//            carownerRepository.save(carowner);
//        } catch (Exception ex) {
//            throw new ServerException(ErrorInformationBuilder.build(ErrorCodeConstants.CAR_ADD_ERROR), ex);
//        }
//    }
//
//    /**
//     * Обновляет информацию о пользователе в базе из {@link CarownerWrapper}
//     *
//     * @param carownerWrapper инфомарция о пользователе
//     * @return CustomHttpObject с кодом "OK" или с кодом "ERROR" и сообщением об ошибке
//     */
//    public void edit(CarownerWrapper carownerWrapper) throws ServerException {
//        try {
//            CarOwner carowner = getCarowner((carownerWrapper.getId()));
//            carownerWrapper.fromWrapper(carowner);
//            carownerRepository.save(carowner);
//
//        } catch (ServerException ex) {
//            throw ex;
//        } catch (Exception ex) {
//            throw new ServerException(ErrorInformationBuilder.build(ErrorCodeConstants.CAR_UPDATE_ERROR), ex);
//        }
//    }
//
//    /**
//     * Получает информацию о машине с заданным идентификатором из базы и пребразует ее в объект класса {@link CarownerWrapper}
//     *
//     * @param id идентификатор машины
//     * @return объект, содержащий информацию о машине
//     */
//    public CarownerWrapper getById(Long id) throws ServerException {
//        try {
//            return new CarownerWrapper(getCarowner(id));
//        } catch (ServerException ex) {
//            throw ex;
//        } catch (Exception ex) {
//            throw new ServerException(ErrorInformationBuilder.build(ErrorCodeConstants.CAR_INFO_ERROR), ex);
//        }
//    }
//
//    ///////////////////////////////////
//    private CarOwner getCarowner(Long id) throws ServerException {
//        return carownerRepository.findById(id)
//                .orElseThrow(() -> new ServerException(ErrorInformationBuilder.build(ErrorCodeConstants.DATA_NOT_FOUND)));
//    }
//}
