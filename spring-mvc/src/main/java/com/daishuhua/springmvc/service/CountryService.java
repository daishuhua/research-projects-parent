package com.daishuhua.springmvc.service;

import com.daishuhua.springmvc.model.Country;
import com.daishuhua.springmvc.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by daishuhua on 17-2-10.
 */
@Service("countryService")
public class CountryService {

    @Autowired
    CountryRepository countryRepository;

    @Transactional
    public List<Country> getAllCountries() {
        List<Country> countryList = new ArrayList<>();
        Iterable<Country> countryIterable = countryRepository.findAll();
        Iterator<Country> countryIterator = countryIterable.iterator();
        while (countryIterator.hasNext()) {
            countryList.add(countryIterator.next());
        }
        return countryList;

    }

    @Transactional
    public Country getCountry(int id) {
        return countryRepository.findOne(id);
    }

    @Transactional
    public void addCountry(Country country) {
        countryRepository.save(country);
    }

    @Transactional
    public void updateCountry(Country country) {
        countryRepository.save(country);
    }

    @Transactional
    public void deleteCountry(int id) {
        countryRepository.delete(id);
    }
}
