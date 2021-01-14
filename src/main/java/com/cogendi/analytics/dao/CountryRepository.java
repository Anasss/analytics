package com.cogendi.analytics.dao;

import com.cogendi.analytics.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Data access layer for Entity {@link com.cogendi.analytics.entity.Country}
 *
 * @author Anass RACH
 */
@Repository
@Transactional
public interface CountryRepository extends JpaRepository<Country, Long> {

}


