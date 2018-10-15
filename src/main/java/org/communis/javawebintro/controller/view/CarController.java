package org.communis.javawebintro.controller.view;//package org.communis.javawebintro.controller.view;
//
//import lombok.extern.log4j.Log4j2;
//import org.communis.javawebintro.dto.CarWrapper;
//import org.communis.javawebintro.exception.ServerException;
//import org.springframework.data.domain.Pageable;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//
//@Log4j2
//@Controller
//@RequestMapping(value = "admin/users")
//
//public class CarController {
//
//    private String CAR_VIEWS_PATH = "admin/car/";
//
//    //private final CarService carService;
//
//    /*@Autowired
//    public CarController(CarService carService) {
//        this.carService = carService;
//    }*/
//
//    @RequestMapping(value = "")
//    public ModelAndView list(Pageable pageable) throws ServerException {
//        ModelAndView carPage = new ModelAndView(CAR_VIEWS_PATH + "list");
//        //carPage.addObject("page", carService.getPageByFilter(pageable));
//        //prepareCarModelAndView(carPage);
//        return carPage;
//    }
//
//    @RequestMapping(value = "/add", method = RequestMethod.GET)
//    public ModelAndView addPage() {
//        ModelAndView addPage = new ModelAndView(CAR_VIEWS_PATH + "add");
//        addPage.addObject("car", new CarWrapper());
//        //addPage.addObject("models", carPlaces.values());
//        return addPage;
//    }
//
//    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
//    public ModelAndView editPage(@PathVariable("id") Long id) throws ServerException {
//        ModelAndView editPage = new ModelAndView(CAR_VIEWS_PATH + "edit");
//        //editPage.addObject("car", carService.getById(id));
//        //prepareCarModelAndView(editPage);
//        return editPage;
//    }
//
///*    private void prepareCarModelAndView(ModelAndView modelAndView) {
//        modelAndView.addObject("statuses", UserStatus.values());
//        modelAndView.addObject("models", CarPlaces.values());
//    }*/
//}