package com.mbodji.BackEndJEE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mbodji.BackEndJEE.entities.Contribuable;
@Repository
public interface ContribuableRepository extends JpaRepository<Contribuable, Long> {

}
