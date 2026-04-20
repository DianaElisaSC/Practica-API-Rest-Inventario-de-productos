package mx.uv.desc.inventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import mx.uv.desc.inventario.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    
}
