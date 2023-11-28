package mx.gob.imss.cit.ceme.persistence;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "CEMET_SOLICITUD_MEZCLA")
public class CemetSolicitudMezcla implements Serializable {
    private static final long serialVersionUID = -1501109969342174611L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SOLICITUD_MEZCLA", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_UNIDAD_MEDICA_PRESCRIBE", nullable = false)
    @ToString.Exclude
    private CemecUnidadMedica idUnidadMedicaPrescribe;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_CENTRAL_MEZCLA_ELABORA", nullable = false)
    @ToString.Exclude
    private CemecUnidadMedica idCentralMezclaElabora;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_UNIDAD_MEDICA_ADMINISTRA", nullable = false)
    @ToString.Exclude
    private CemecUnidadMedica idUnidadMedicaAdministra;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_SERVICIO_ESPECIALIDAD", nullable = false)
    @ToString.Exclude
    private CemecServicioEspecialidad idServicioEspecialidad;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_PACIENTE", nullable = false)
    @ToString.Exclude
    private CemetPaciente idPaciente;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_ESTATUS_SOLICITUD", nullable = false)
    @ToString.Exclude
    private CemecEstatusSolicitud idEstatusSolicitud;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_MEDICO_RESPONSABLE", nullable = false)
    @ToString.Exclude
    private CemetUsuario idMedicoResponsable;

    @Column(name = "CVE_FOLIO_SOLICITUD_MEZCLA", length = 20)
    private String cveFolioSolicitudMezcla;

    @Column(name = "FEC_SOLICITUD_MEZCLA")
    private LocalDate fecSolicitudMezcla;

    @Column(name = "TIM_SOLICITUD_MEZCLA")
    private LocalTime timSolicitudMezcla;

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