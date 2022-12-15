package com.example.baithimodule4.repository;

import com.example.baithimodule4.model.Country;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICountryRepository extends PagingAndSortingRepository<Country,Long> {
}
