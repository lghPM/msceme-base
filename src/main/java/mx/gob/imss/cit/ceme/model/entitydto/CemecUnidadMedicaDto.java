package mx.gob.imss.cit.ceme.model.entitydto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.gob.imss.cit.ceme.persistence.CemecUnidadMedica;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * DTO for {@link CemecUnidadMedica}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CemecUnidadMedicaDto implements Serializable {
    private static final long serialVersionUID = -3849081288531027756L;
    private Integer id;
    private CemecCentralMezclaDto idCentralMezcla;
    private String nomUnidadMedica;
    private String cvePresupuest0UnidadMedica;
    private String domUnidadMedica;
    private String refEmailInstitucion;
    private BigDecimal numDistanciaKm;
    private String refTiempoEstimado;
    private Boolean indMezclaOncologica;
    private Boolean indMezclaNpt;
    private Boolean indMezclaAtb;
    private Boolean indActivo;
    private String cveUsuarioAlta;
    private String cveUsuarioBaja;
    private String cveUsuarioModifica;
	private Date stpAlta;
	private Date stpModifica;
	private Date stpBaja;
	
}