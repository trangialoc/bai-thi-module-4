package com.example.baithimodule4.reponsitory;

import com.example.baithimodule4.model.Country;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ICountryReponsitory extends PagingAndSortingRepository<Country,Long> {

}
