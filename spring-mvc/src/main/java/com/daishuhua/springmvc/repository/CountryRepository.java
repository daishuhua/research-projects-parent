package com.daishuhua.springmvc.repository;

import com.daishuhua.springmvc.model.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by daishuhua on 17-2-10.
 */
@Repository
public interface CountryRepository extends CrudRepository<Country, Integer> {
}
