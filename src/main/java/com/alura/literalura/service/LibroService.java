package com.alura.literalura.service;

import com.alura.literalura.model.Libro;
import com.alura.literalura.repository.ILibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroService {

    @Autowired
    private ILibroRepository libroRepository;

    public void crearLibro(Libro libro){
        libroRepository.save(libro);
    }

    public List<Libro> listarLibros(){
        return libroRepository.findAll();
    }

    public List<Libro> ObtenerLibroPorIdioma(String idioma){
        return libroRepository.findByIdioma(idioma);
    }

    public Optional<Libro> obtenerLibroPorTitulo(String titulo){
        return libroRepository.findByTitulo(titulo);
    }
}
