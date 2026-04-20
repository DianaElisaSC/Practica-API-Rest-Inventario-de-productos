package mx.uv.desc.inventario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;
import mx.uv.desc.inventario.repository.ProductoRepository;


@SpringBootApplication
public class InventarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventarioApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(ProductoRepository repository) {
		return args -> {
			repository.save(new mx.uv.desc.inventario.entity.Producto(null, "Laptop Dell", "17 64RAM", 15000.50, 5, "Electrónica", null));
			repository.save(new mx.uv.desc.inventario.entity.Producto(null, "Mouse", "Inalámbrico", 500.50, 5, "Electrónica", null));
			repository.save(new mx.uv.desc.inventario.entity.Producto(null, "Audifonos", "Sony", 1500.50, 15, "Electrónica", null));
		};
	}

}
