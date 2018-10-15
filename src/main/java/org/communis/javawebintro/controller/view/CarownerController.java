package org.communis.javawebintro.controller.view;//package org.communis.javawebintro.controller.view;
//
//import lombok.extern.log4j.Log4j2;
//import org.communis.javawebintro.dto.CarownerWrapper;
//import org.communis.javawebintro.exception.ServerException;
//import org.springframework.beans.factory.annotation.Autowired;
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
//public class CarownerController {
//
//    private String CAROWNER_VIEWS_PATH = "admin/user/";
//    //private final CarownerService carownerService;
//
///*    @Autowired
//    public CarownerController(CarownerService carownerService) {
//        this.carownerService = carownerService;
//    }*/
//
//    /* @RequestMapping(value = "")
//    public ModelAndView list(Pageable pageable) throws ServerException {
//        ModelAndView usersPage = new ModelAndView(CAROWNER_VIEWS_PATH + "list");
//        usersPage.addObject("page", carService.getPageByFilter(pageable));
//        prepareCarModelAndView(usersPage);
//        return usersPage;
//    } */
//
//    @RequestMapping(value = "/add", method = RequestMethod.GET)
//    public ModelAndView addPage() {
//        ModelAndView addPage = new ModelAndView(CAROWNER_VIEWS_PATH + "add");
//        addPage.addObject("carOwner", new CarownerWrapper());
//        //addPage.addObject("role", CarownerRole.values());
//        return addPage;
//    }
//
//    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
//    public ModelAndView editPage(@PathVariable("id") Long id) throws ServerException {
//        ModelAndView editPage = new ModelAndView(CAROWNER_VIEWS_PATH + "edit");
//        //editPage.addObject("carOwner", carownerService.getById(id));
//        //prepareCarModelAndView(editPage);
//        return editPage;
//    }
//
///*    private void prepareCarModelAndView(ModelAndView modelAndView) {
//        modelAndView.addObject("statuses", CarownerStatus.values());
//        modelAndView.addObject("models", CarownerRole.values());
//    }*/
//}