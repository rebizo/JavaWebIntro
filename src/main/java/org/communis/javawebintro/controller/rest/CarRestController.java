package org.communis.javawebintro.controller.rest;//package org.communis.javawebintro.controller.rest;
//
//import org.communis.javawebintro.dto.CarWrapper;
//import org.communis.javawebintro.exception.InvalidDataException;
//import org.communis.javawebintro.exception.NotFoundException;
//import org.communis.javawebintro.exception.ServerException;
//import org.communis.javawebintro.exception.error.ErrorCodeConstants;
//import org.communis.javawebintro.exception.error.ErrorInformationBuilder;
//import org.communis.javawebintro.service.CarService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.validation.Valid;
//
//@RestController
//@RequestMapping(value = "admin/users")
//public class CarRestController {
//
//    private final CarService carService;
//
//    @Autowired
//    public CarRestController(CarService carService) {
//        this.carService = carService;
//    }
//
//    @RequestMapping(value = "", method = RequestMethod.POST)
//    public void add(@Valid CarWrapper carWrapper, BindingResult bindingResult) throws InvalidDataException, ServerException {
//        if (bindingResult.hasErrors()) {
//            throw new InvalidDataException(ErrorInformationBuilder.build(ErrorCodeConstants.DATA_VALIDATE_ERROR));
//        }
//        carService.add(carWrapper);
//    }
//
//    @RequestMapping(value = "", method = RequestMethod.PATCH)
//    public void editCar(@Valid CarWrapper carWrapper, BindingResult bindingResult)
//            throws InvalidDataException, NotFoundException, ServerException {
//        if (bindingResult.hasErrors()) {
//            throw new InvalidDataException(ErrorInformationBuilder.build(ErrorCodeConstants.DATA_VALIDATE_ERROR));
//        }
//        carService.edit(carWrapper);
//    }
//
///*    @RequestMapping(value = "/{id}/block", method = RequestMethod.POST)
//    public void block(@PathVariable("id") Long id)
//            throws InvalidDataException, ServerException, NotFoundException {
//        carService.block(id);
//    }
//
//    @RequestMapping(value = "/{id}/unblock", method = RequestMethod.POST)
//    public void unblock(@PathVariable("id") Long id) throws NotFoundException, ServerException {
//        carService.unblock(id);
//    }*/
//}
