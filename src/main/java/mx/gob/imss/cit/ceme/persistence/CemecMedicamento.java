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
@Table(name = "CEMEC_MEDICAMENTO")
public class CemecMedicamento implements Serializable {
    private static final long serialVersionUID = -516401201656970273L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_MEDICAMENTO", nullable = false)
    private Integer id;

    @Column(name = "DES_CORTA_MEDICAMENTO", length = 100)
    private String desCortaMedicamento;

    @Column(name = "DES_LARGA_MEDICAMENTO", nullable = false, length = 2000)
    private String desLargaMedicamento;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_TIPO_MEZCLA", nullable = false)
    @ToString.Exclude
    private CemecTipoMezcla idTipoMezcla;

    @Column(name = "CVE_MEDICAMENTO", length = 15)
    private String cveMedicamento;

    @Column(name = "CVE_PARTIDA_PRESUPUESTAL", length = 15)
    private String cvePartidaPresupuestal;

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