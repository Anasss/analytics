package com.cogendi.analytics.service;

import com.cogendi.analytics.dao.CountryRepository;
import com.cogendi.analytics.entity.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CountryService {

  @Autowired
  private CountryRepository repository;

  /**
   * List all available countries
   * @return
   */
  public List<Country> listAll() {
    return repository.findAll();
  }

  /**
   * Save a country
   * @param country
   */
  public void save(Country country) {
    repository.save(country);
  }

  /**
   *  Get a country by id
   * @param id
   * @return
   */
  public Country get(long id) {
    return repository.findById(id).orElse(null);
  }
}
