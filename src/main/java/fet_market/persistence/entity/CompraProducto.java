package fet_market.persistence.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "COMPRAS_PRODUCTOS")
public class CompraProducto{
    @EmbeddedId
    private CompraProductoId id;

    @ManyToOne
    @MapsId("idCompra")
    @JoinColumn(name = "id_compra")
    private Compra compra;

    @ManyToOne
    @MapsId("idProducto")
    @JoinColumn(name = "id_producto")
    private Producto producto;

    @Column(name = "cantidad")
    private Integer cantidad;

    @Column(name = "total")
    private BigDecimal total;

    @Column(name = "estado")
    private Boolean estado;

    public CompraProductoId getId() {
        return id;
    }

    public void setId(CompraProductoId id) {
        this.id = id;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
