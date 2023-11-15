package mx.gob.imss.cit.ceme.model.entitydto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.gob.imss.cit.ceme.persistence.CemecDiluyente;

import java.io.Serializable;

/**
 * DTO for {@link CemecDiluyente}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CemecDiluyenteDto implements Serializable {
    private static final long serialVersionUID = 1389007158258443051L;
    private Integer id;
    private String desCortaDiluyente;
    private String desLargaDiluyente;
    private String cveDescDiluyente;
    private String cveDescGpo;
    private String cveDescGen;
    private String cveDescEsp;
    private String cveDescDif;
    private String cveDescVar;
    private String refPresentacion;
    private Byte numPiezasPresentacion;
    private String refUnidadMinMedida;
    private Short numUnidadMinMedidaPieza;
    private Boolean indActivo;
    private String cveUsuarioAlta;
    private String cveUsuarioBaja;
    private String cveUsuarioModifica;
}