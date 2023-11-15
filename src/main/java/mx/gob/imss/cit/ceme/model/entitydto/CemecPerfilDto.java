package mx.gob.imss.cit.ceme.model.entitydto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.gob.imss.cit.ceme.persistence.CemecPerfil;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO for {@link CemecPerfil}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CemecPerfilDto implements Serializable {
    private static final long serialVersionUID = -7284815992203958515L;
    private Integer id;
    private String desPerfil;
    private Boolean indActivo;
    private String cveUsuarioAlta;
    private String cveUsuarioBaja;
    private String cveUsuarioModifica;
	private Date stpAlta;
	private Date stpModifica;
	private Date stpBaja;
	
}