package com.alura.literalura;
import com.alura.literalura.principal.Menu;
import com.alura.literalura.service.AutorService;
import com.alura.literalura.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner {

	@Autowired
	private LibroService libroService;

	@Autowired
	private AutorService autorService;

	public static void main(String[] args) {
		SpringApplication.run(LiteraluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Menu menu = new Menu(libroService, autorService);

		System.out.println("\n-----------------------------------------------------------\n");

		System.out.println("¡Bienvenido a LiterAlura!\n");
		menu.mostrarMenu();

		System.out.println("-----------------------------------------------------------");
	}
}