package com.example.baithimodule4.repository;

import com.example.baithimodule4.model.City;
import com.example.baithimodule4.model.Country;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICityRepository extends PagingAndSortingRepository<City,Long> {

    Page<City>findAllByNameContaining(Pageable pageable,String name);

    Page<City> findByCountry(Pageable pageable, Country country);
}
