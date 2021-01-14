package com.cogendi.analytics.controller;

import com.cogendi.analytics.entity.Country;
import com.cogendi.analytics.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AppController {

  @Autowired
  private CountryService service;

  @RequestMapping("/")
  public String viewHomePage(Model model) {
    List<Country> countries = service.listAll();
    model.addAttribute("countries", countries);

    return "index";
  }

  @RequestMapping("/new")
  public String showNewProductPage(Model model) {
    Country country = new Country();
    model.addAttribute("country", country);

    return "new_country";
  }

  @RequestMapping(value = "/save", method = RequestMethod.POST)
  public String saveProduct(@ModelAttribute("country") Country country) {
    service.save(country);

    return "redirect:/";
  }

  @RequestMapping("/edit/{id}")
  public ModelAndView showEditProductPage(@PathVariable(name = "id") int id) {
    ModelAndView mav = new ModelAndView("edit_country");
    Country country = service.get(id);
    mav.addObject("country", country);

    return mav;
  }
}
