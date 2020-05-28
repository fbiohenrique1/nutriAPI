package com.api.nutri.repository;

import org.springframework.stereotype.Repository;

import com.api.core.repository.GenericRepository;
import com.api.nutri.model.Menu;

@Repository
public interface MenuRepository extends GenericRepository<Menu, Integer> {

}