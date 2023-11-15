package mx.gob.imss.cit.ceme.model.entitydto;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.gob.imss.cit.ceme.persistence.CemecViaAdministracion;

/**
 * DTO for {@link CemecViaAdministracion}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CemecViaAdministracionDto implements Serializable {
    private static final long serialVersionUID = 3730567530325090276L;
    private Integer id;
    private String desViaAdministracion;
    private Boolean indActivo;
    private String cveUsuarioAlta;
    private String cveUsuarioBaja;
    private String cveUsuarioModifica;
	private Date stpAlta;
	private Date stpModifica;
	private Date stpBaja;
	
}