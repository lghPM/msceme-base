package mx.gob.imss.cit.ceme.model.entitydto;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.gob.imss.cit.ceme.persistence.CemecIntervaloAdministracion;

/**
 * DTO for {@link CemecIntervaloAdministracion}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CemecIntervaloAdministracionDto implements Serializable {
    private static final long serialVersionUID = -6790658594789358385L;
    private Integer id;
    private String desIntervaloAdministracion;
    private Boolean indActivo;
    private String cveUsuarioAlta;
    private String cveUsuarioBaja;
    private String cveUsuarioModifica;
	private Date stpAlta;
	private Date stpModifica;
	private Date stpBaja;
	
}