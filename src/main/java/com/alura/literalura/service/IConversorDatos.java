package com.alura.literalura.service;

public interface IConversorDatos {

    <T> T convertirDatos(String json, Class<T> clase);
}