package mx.gob.imss.cit.ceme.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import mx.gob.imss.cit.ceme.persistence.CemecModulo;

public interface CemecModuloRepository extends JpaRepository<CemecModulo, Integer>, JpaSpecificationExecutor<CemecModulo> {
}