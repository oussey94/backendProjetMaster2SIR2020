package com.mbodji.BackEndJEE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mbodji.BackEndJEE.entities.Mandataire;
@Repository
public interface MandataireRepository extends JpaRepository<Mandataire, Long> {

}
