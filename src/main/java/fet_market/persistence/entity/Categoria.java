package fet_market.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "CATEGORIAS")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Integer idCategoria;

    @Column(name = "descripcion", nullable = false, length = 45)
    private String descripcion;

    @Column(name = "estado", nullable = false)
    private Boolean estado;

    // constructor vacío
    public Categoria() {
    }

    // constructor con parámetros
    public Categoria(String descripcion, Boolean estado) {
        this.descripcion = descripcion;
        this.estado = estado;
    }

    // getters y setters
    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "idCategoria=" + idCategoria +
                ", descripcion='" + descripcion + '\'' +
                ", estado=" + estado +
                '}';
    }

}
