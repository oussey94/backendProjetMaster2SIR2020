package com.mbodji.BackEndJEE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mbodji.BackEndJEE.entities.ReferenceBancaire;
@Repository
public interface ReferenceBancaireRepository extends JpaRepository<ReferenceBancaire, Long> {

}
