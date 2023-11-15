package mx.gob.imss.cit.ceme.model.entitydto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.gob.imss.cit.ceme.persistence.CemecReaccionAdversa;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO for {@link CemecReaccionAdversa}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CemecReaccionAdversaDto implements Serializable {
    private static final long serialVersionUID = 1431982027069647569L;
    private Integer id;
    private String desReaccionAdversa;
    private Boolean indActivo;
    private String cveUsuarioAlta;
    private String cveUsuarioBaja;
    private String cveUsuarioModifica;
	private Date stpAlta;
	private Date stpModifica;
	private Date stpBaja;
}