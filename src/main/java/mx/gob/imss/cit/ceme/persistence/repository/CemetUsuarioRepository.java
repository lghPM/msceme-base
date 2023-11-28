package mx.gob.imss.cit.ceme.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import mx.gob.imss.cit.ceme.persistence.CemetUsuario;

public interface CemetUsuarioRepository extends JpaRepository<CemetUsuario, Integer>, JpaSpecificationExecutor<CemetUsuario> {
}