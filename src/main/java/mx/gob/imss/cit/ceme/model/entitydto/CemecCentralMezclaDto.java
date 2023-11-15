package mx.gob.imss.cit.ceme.model.entitydto;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.gob.imss.cit.ceme.persistence.CemecCentralMezcla;

/**
 * DTO for {@link CemecCentralMezcla}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CemecCentralMezclaDto implements Serializable {
    private static final long serialVersionUID = 8527127130174088748L;
    private Integer id;
    private CemecDelegacionDto idDelegacion;
    private String desCentralMezcla;
    private Integer cvePresupuestoCeme;
    private Boolean indActivo;
    private String cveUsuarioAlta;
    private String cveUsuarioBaja;
    private String cveUsuarioModifica;
	private Date stpAlta;
	private Date stpModifica;
	private Date stpBaja;
}