package com.cogendi.analytics.controller;

import com.cogendi.analytics.entity.Country;
import com.cogendi.analytics.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
