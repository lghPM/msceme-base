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
@Table(name = "CEMEC_CENTRAL_MEZCLA")
public class CemecCentralMezcla implements Serializable {
    private static final long serialVersionUID = 1387152678138550955L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CENTRAL_MEZCLA", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DELEGACION")
    @ToString.Exclude
    private CemecDelegacion idDelegacion;

    @Column(name = "DES_CENTRAL_MEZCLA", nullable = false, length = 100)
    private String desCentralMezcla;

    @Column(name = "CVE_PRESUPUESTO_CEME")
    private Integer cvePresupuestoCeme;

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