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
@Table(name = "CEMET_USUARIO")
public class CemetUsuario implements Serializable {
    private static final long serialVersionUID = 2724172073198420450L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USUARIO", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_PERSONA", nullable = false)
    @ToString.Exclude
    private CemetPersona idPersona;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_PERFIL", nullable = false)
    @ToString.Exclude
    private CemecPerfil idPerfil;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_DELEGACION", nullable = false)
    @ToString.Exclude
    private CemecDelegacion idDelegacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CENTRAL_MEZCLA")
    @ToString.Exclude
    private CemecCentralMezcla idCentralMezcla;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_UNIDAD_MEDICA")
    @ToString.Exclude
    private CemecUnidadMedica idUnidadMedica;

    @Column(name = "REF_CATEGORIA", length = 50)
    private String refCategoria;

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