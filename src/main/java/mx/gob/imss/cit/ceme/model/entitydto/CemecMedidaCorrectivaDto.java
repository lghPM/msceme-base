package mx.gob.imss.cit.ceme.model.entitydto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.gob.imss.cit.ceme.persistence.CemecMedidaCorrectiva;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO for {@link CemecMedidaCorrectiva}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CemecMedidaCorrectivaDto implements Serializable {
    private static final long serialVersionUID = 7337150573845905709L;
    private Integer id;
    private String desMedidaCorrectiva;
    private Boolean indActivo;
    private String cveUsuarioAlta;
    private String cveUsuarioBaja;
    private String cveUsuarioModifica;
	private Date stpAlta;
	private Date stpModifica;
	private Date stpBaja;
	
}