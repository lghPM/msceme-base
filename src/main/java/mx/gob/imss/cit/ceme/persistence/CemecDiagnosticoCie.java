package mx.gob.imss.cit.ceme.persistence;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "CEMEC_DIAGNOSTICO_CIE")
public class CemecDiagnosticoCie implements Serializable {
    private static final long serialVersionUID = -3012083876585826679L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DIAGNOSTICO_CIE", nullable = false)
    private Integer id;

    @Column(name = "DES_DIAGNOSTICO_CIE", length = 200)
    private String desDiagnosticoCie;

    @Column(name = "CVE_DIAGNOSTICO_CIE", length = 5)
    private String cveDiagnosticoCie;

    @Column(name = "NUM_EDAD_INICIAL")
    private Short numEdadInicial;

    @Column(name = "NUM_EDAD_FINAL")
    private Short numEdadFinal;

    @Column(name = "CVE_SEXO")
    private Boolean cveSexo;

    @Column(name = "IND_CRONICA")
    private Boolean indCronica;

    @Column(name = "CVE_APARATO")
    private Short cveAparato;

    @Column(name = "IND_TRANSMISIBLE")
    private Boolean indTransmisible;

    @Column(name = "IND_PRINCIPAL")
    private Boolean indPrincipal;

    @Column(name = "IND_NIVEL1")
    private Boolean indNivel1;

    @Column(name = "IND_NIVEL2")
    private Boolean indNivel2;

    @Column(name = "IND_NIVEL3")
    private Boolean indNivel3;

    @Column(name = "CVE_GRUPO_CIE", length = 5)
    private String cveGrupoCie;

    @Column(name = "IND_RESURTIBLE")
    private Boolean indResurtible;

    @Column(name = "IND_ACTIVO")
    private Boolean indActivo;

    @Column(name = "CVE_USUARIO_ALTA", nullable = false, length = 60)
    private String cveUsuarioAlta;

    @Column(name = "CVE_USUARIO_BAJA", length = 60)
    private String cveUsuarioBaja;

    @Column(name = "CVE_USUARIO_MODIFICA", length = 60)
    private String cveUsuarioModifica;

    @Column(name = "STP_ALTA", columnDefinition = "timestamp(6) not null")
    private Date stpAlta;

    @Column(name = "STP_BAJA", columnDefinition = "timestamp(6)")
    private Date stpBaja;

    @Column(name = "STP_MODIFICA", columnDefinition = "timestamp(6)")
    private Date stpModifica;

}