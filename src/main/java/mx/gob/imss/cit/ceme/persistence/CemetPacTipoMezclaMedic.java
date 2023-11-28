package mx.gob.imss.cit.ceme.persistence;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "CEMET_PAC_TIPO_MEZCLA_MEDIC")
public class CemetPacTipoMezclaMedic implements Serializable {
    private static final long serialVersionUID = 289707594508789055L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PAC_TIPO_MEZCLA_MEDIC", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_PAC_TIPO_MEZCLA", nullable = false)
    @ToString.Exclude
    private CemetPacTipoMezcla idPacTipoMezcla;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_MEDICAMENTO", nullable = false)
    @ToString.Exclude
    private CemecMedicamento idMedicamento;

    @Column(name = "NUM_DOSIS_MEDICAMENTO", precision = 8, scale = 2)
    private BigDecimal numDosisMedicamento;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_DILUYENTE", nullable = false)
    @ToString.Exclude
    private CemecDiluyente idDiluyente;

    @Column(name = "NUM_DILUYENTE", precision = 8, scale = 2)
    private BigDecimal numDiluyente;

    @Column(name = "REF_OSMOLARIDAD", length = 25)
    private String refOsmolaridad;

    @Column(name = "NUM_KILOCALORIAS", precision = 8, scale = 2)
    private BigDecimal numKilocalorias;

    @Column(name = "REF_NITROGENO", length = 25)
    private String refNitrogeno;

    @Column(name = "REF_PROTEINAS", length = 25)
    private String refProteinas;

    @Column(name = "TIM_ADMINISTRACION", nullable = false)
    private LocalTime timAdministracion;

    @Column(name = "NUM_TOTAL_DOSIS")
    private Short numTotalDosis;

    @Column(name = "STP_ADMINISTRACION", columnDefinition = "timestamp(6) not null")
    private Date stpAdministracion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_INTERVALO_ADMINISTRACION")
    @ToString.Exclude
    private CemecIntervaloAdministracion idIntervaloAdministracion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_VIA_ADMINISTRACION")
    @ToString.Exclude
    private CemecViaAdministracion idViaAdministracion;

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