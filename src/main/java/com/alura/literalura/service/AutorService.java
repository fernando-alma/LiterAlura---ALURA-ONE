package com.alura.literalura.service;

import com.alura.literalura.model.Autor;
import com.alura.literalura.repository.IAutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {

    @Autowired
    private IAutorRepository autorRepository;

    public void crearAutor(Autor autor){
        autorRepository.save(autor);
    }

    public List<Autor> listarAutores(){
        return autorRepository.findAllConLibros();
    }

    public List<Autor> listarAutoresVivosEnAnio(int anio){
        return autorRepository.findAutoresVivosEnAnioConLibros(anio);
    }

    public Optional<Autor> obtenerAutorPorNombre(String nombre){
        return autorRepository.findByNombre(nombre);
    }
}