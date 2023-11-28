package mx.gob.imss.cit.ceme.persistence.repository;

import mx.gob.imss.cit.ceme.persistence.CemecDiagnosticoCie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CemecDiagnosticoCieRepository extends JpaRepository<CemecDiagnosticoCie, Integer>, JpaSpecificationExecutor<CemecDiagnosticoCie> {
}