package mx.uv.desc.inventario.service;
import java.util.List;
import mx.uv.desc.inventario.repository.ProductoRepository;
import mx.uv.desc.inventario.entity.Producto;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class ProductoService {
    @Autowired
    private ProductoRepository repository;


    public List<Producto> listarTodos() {
        return repository.findAll();
    }

    public Optional<Producto> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Producto guardar(Producto producto) {
        return repository.save(producto);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }



}
