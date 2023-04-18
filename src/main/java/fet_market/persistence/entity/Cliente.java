package fet_market.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "CLIENTES")
public class Cliente {
    @Id
    @Column(name = "id", nullable = false, length = 20)
    private String id;

    @Column(name = "nombre", length = 40)
    private String nombre;

    @Column(name = "apellidos", length = 100)
    private String apellidos;

    @Column(name = "celular")
    private Long celular;

    @Column(name = "direccion", length = 80)
    private String direccion;

    @Column(name = "correo_electronico", length = 70)
    private String correoElectronico;

    // constructor vacío
    public Cliente() {
    }

    // constructor con parámetros
    public Cliente(String id, String nombre, String apellidos, Long celular, String direccion, String correoElectronico) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.celular = celular;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
    }

    // getters y setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Long getCelular() {
        return celular;
    }

    public void setCelular(Long celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", celular=" + celular +
                ", direccion='" + direccion + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                '}';
    }

}
