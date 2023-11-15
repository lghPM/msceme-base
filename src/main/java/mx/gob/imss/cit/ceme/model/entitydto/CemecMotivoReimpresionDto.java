package mx.gob.imss.cit.ceme.model.entitydto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.gob.imss.cit.ceme.persistence.CemecMotivoReimpresion;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO for {@link CemecMotivoReimpresion}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CemecMotivoReimpresionDto implements Serializable {
    private static final long serialVersionUID = 5717348049136143693L;
    private Integer id;
    private String desMotivoReimpresion;
    private Boolean indActivo;
    private String cveUsuarioAlta;
    private String cveUsuarioBaja;
    private String cveUsuarioModifica;
	private Date stpAlta;
	private Date stpModifica;
	private Date stpBaja;
	
}