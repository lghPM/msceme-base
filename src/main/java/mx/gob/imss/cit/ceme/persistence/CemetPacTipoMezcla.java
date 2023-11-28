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
@Table(name = "CEMET_PAC_TIPO_MEZCLA")
public class CemetPacTipoMezcla implements Serializable {
    private static final long serialVersionUID = 966646656572881L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PAC_TIPO_MEZCLA", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_PACIENTE", nullable = false)
    @ToString.Exclude
    private CemetPaciente idPaciente;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_TIPO_MEZCLA_ESTERIL", nullable = false)
    @ToString.Exclude
    private CemecTipoMezcla idTipoMezclaEsteril;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_ESPECIALIDAD", nullable = false)
    @ToString.Exclude
    private CemecServicioEspecialidad idEspecialidad;

    @Column(name = "IND_HOSPITALIZACION")
    private Boolean indHospitalizacion;

    @Column(name = "REF_NO_CAMA", length = 10)
    private String refNoCama;

    @Column(name = "FEC_ADMON_MEZCLA_ESTERIL")
    private LocalDate fecAdmonMezclaEsteril;

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