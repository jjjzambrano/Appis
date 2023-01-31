package bff.bweb.customer;

import java.sql.Date;

import lombok.Data;

@Data
public class ClienteDTO {
    
    private Long id;
    private String nombre;
    private String cedula;
    private Date fecha_nacimiento;
    private double monto_primera_compra;
    private Long tipo;
    private String jjzj_propietario;
}
