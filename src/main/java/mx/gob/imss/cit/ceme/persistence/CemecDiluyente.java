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
@Table(name = "CEMEC_DILUYENTE")
public class CemecDiluyente implements Serializable {
    private static final long serialVersionUID = -7171508049768433233L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DILUYENTE", nullable = false)
    private Integer id;

    @Column(name = "DES_CORTA_DILUYENTE", length = 100)
    private String desCortaDiluyente;

    @Column(name = "DES_LARGA_DILUYENTE", nullable = false, length = 500)
    private String desLargaDiluyente;

    @Column(name = "CVE_DESC_DILUYENTE", length = 15)
    private String cveDescDiluyente;

    @Column(name = "CVE_DESC_GPO", length = 3)
    private String cveDescGpo;

    @Column(name = "CVE_DESC_GEN", length = 3)
    private String cveDescGen;

    @Column(name = "CVE_DESC_ESP", length = 4)
    private String cveDescEsp;

    @Column(name = "CVE_DESC_DIF", length = 2)
    private String cveDescDif;

    @Column(name = "CVE_DESC_VAR", length = 2)
    private String cveDescVar;

    @Column(name = "REF_PRESENTACION", length = 10)
    private String refPresentacion;

    @Column(name = "NUM_PIEZAS_PRESENTACION")
    private Byte numPiezasPresentacion;

    @Column(name = "REF_UNIDAD_MIN_MEDIDA", length = 10)
    private String refUnidadMinMedida;

    @Column(name = "NUM_UNIDAD_MIN_MEDIDA_PIEZA")
    private Short numUnidadMinMedidaPieza;

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