package mx.gob.imss.cit.ceme.persistence;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "CEMET_PACIENTE")
public class CemetPaciente implements Serializable {
    private static final long serialVersionUID = 511689923543853671L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PACIENTE", nullable = false)
    private Integer id;

    @Column(name = "ID_PERSONA", nullable = false)
    private Integer idPersona;

    @Column(name = "REF_NSS", length = 11)
    private String refNss;

    @Column(name = "REF_AGREGADO_MEDICO", length = 100)
    private String refAgregadoMedico;

    @Column(name = "FEC_NACIMIENTO")
    private LocalDate fecNacimiento;

    @Column(name = "REF_PESO", length = 25)
    private String refPeso;

    @Column(name = "REF_TALLA", length = 25)
    private String refTalla;

    @Column(name = "REF_SUPERF_CORPORAL", length = 25)
    private String refSuperfCorporal;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_DIAGNOSTICO_CIE", nullable = false)
    @ToString.Exclude
    private CemecDiagnosticoCie idDiagnosticoCie;

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