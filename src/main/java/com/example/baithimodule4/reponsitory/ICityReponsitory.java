package com.example.baithimodule4.reponsitory;

import com.example.baithimodule4.model.City;
import com.example.baithimodule4.model.Country;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ICityReponsitory extends PagingAndSortingRepository<City,Long> {
    Page<City>findAllByNameContaining(Pageable pageable, String name);

    Page<City> findByCountry(Pageable pageable, Country country);
}
