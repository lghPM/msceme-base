package mx.gob.imss.cit.ceme.persistence;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "CEMEC_UNIDAD_MEDICA")
public class CemecUnidadMedica implements Serializable {
    private static final long serialVersionUID = -378690266127356743L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_UNIDAD_MEDICA", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CENTRAL_MEZCLA")
    @ToString.Exclude
    private CemecCentralMezcla idCentralMezcla;

    @Column(name = "DES_UNIDAD_MEDICA", nullable = false, length = 100)
    private String desUnidadMedica;

    @Column(name = "CVE_PRESUPUEST0_UNIDAD_MEDICA", length = 15)
    private String cvePresupuest0UnidadMedica;

    @Column(name = "DOM_UNIDAD_MEDICA", length = 150)
    private String domUnidadMedica;

    @Column(name = "REF_EMAIL_INSTITUCION", length = 100)
    private String refEmailInstitucion;

    @Column(name = "NUM_DISTANCIA_KM", precision = 7, scale = 2)
    private BigDecimal numDistanciaKm;

    @Column(name = "REF_TIEMPO_ESTIMADO", length = 25)
    private String refTiempoEstimado;

    @Column(name = "IND_MEZCLA_ONCOLOGICA")
    private Boolean indMezclaOncologica;

    @Column(name = "IND_MEZCLA_NPT")
    private Boolean indMezclaNpt;

    @Column(name = "IND_MEZCLA_ATB")
    private Boolean indMezclaAtb;

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