package mx.gob.imss.cit.ceme.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import mx.gob.imss.cit.ceme.model.projection.CatalogoView;
import mx.gob.imss.cit.ceme.model.record.CemecDelegacionRecord;
import mx.gob.imss.cit.ceme.persistence.CemecDelegacion;

public interface CemecDelegacionRepository extends JpaRepository<CemecDelegacion, Integer> {
	
	@Query("SELECT del.id as id , del.desDelegacion as descripcion FROM CemecDelegacion del WHERE del.stpBaja IS NULL ")
	List<CatalogoView> findDelegacionView();
	
	List<CemecDelegacionRecord> findByStpAltaNull();
	
}