package mx.gob.imss.cit.ceme.model.entitydto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.gob.imss.cit.ceme.persistence.CemecTipoMezcla;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO for {@link CemecTipoMezcla}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CemecTipoMezclaDto implements Serializable {
    private static final long serialVersionUID = -5788559629830083477L;
    private Integer id;
    private String nomTipoMezcla;
    private Boolean indActivo;
    private String cveUsuarioAlta;
    private String cveUsuarioBaja;
    private String cveUsuarioModifica;
	private Date stpAlta;
	private Date stpModifica;
	private Date stpBaja;
	
}