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
@Table(name = "CEMEC_ESTATUS_SOLICITUD")
public class CemecEstatusSolicitud implements Serializable {
    private static final long serialVersionUID = 4573238720622636305L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ESTATUS_SOLICITUD", nullable = false)
    private Integer id;

    @Column(name = "DES_ESTATUS_SOLICITUD", nullable = false, length = 50)
    private String desEstatusSolicitud;

    @Column(name = "IND_RECHAZO")
    private Boolean indRechazo;

    @Column(name = "REF_MOTIVO_RECHAZO", length = 250)
    private String refMotivoRechazo;

    @Column(name = "REF_OBSERVACIONES", length = 250)
    private String refObservaciones;

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