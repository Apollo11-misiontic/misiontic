package com.prueba.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.model.Profile;

public interface IProfileRepo extends JpaRepository<Profile, Integer>{

}
