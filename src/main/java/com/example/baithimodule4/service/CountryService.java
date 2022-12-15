package com.example.baithimodule4.service;

import com.example.baithimodule4.model.Country;
import com.example.baithimodule4.reponsitory.ICityReponsitory;
import com.example.baithimodule4.repository.ICountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CountryService implements ICountryService{
    @Autowired
    private ICountryRepository iCountryRepository;

    @Override
    public Iterable findAll() {
        return iCountryRepository.findAll();
    }

    @Override
    public Optional findById(Long id) {
        return iCountryRepository.findById(id);
    }

    @Override
    public void save(Country country) {
        iCountryRepository.save(country);
    }


    @Override
    public void delete(Long id) {
        iCountryRepository.deleteById(id);
    }
}
