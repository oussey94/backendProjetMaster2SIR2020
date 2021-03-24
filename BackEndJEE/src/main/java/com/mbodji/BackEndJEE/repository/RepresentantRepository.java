package com.mbodji.BackEndJEE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.representer.Represent;

import com.mbodji.BackEndJEE.entities.Representant;
@Repository
public interface RepresentantRepository extends JpaRepository<Representant, Long> {

}
