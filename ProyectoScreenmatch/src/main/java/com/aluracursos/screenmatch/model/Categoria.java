package com.aluracursos.screenmatch.model;

public enum Categoria {
    ACCION("Action", "Accion"),
    ROMANCE("Romance", "Romance"),
    COMEDIA("Comedy", "Comedia"),
    CRIMEN("Crime", "Crimen"),
    DRAMA("Drama", "Drama"),
    ANIMACION("Animation", "Animacion"),
    AVENTURA("Adventure", "Aventura"),
    DOCUMENTAL("Documentary","Documental");

    private String categoriaOmdb;
    private String categoriaEspanol;

    Categoria (String categoriaOmdb, String categoriaEspanol){
        this.categoriaOmdb = categoriaOmdb;
        this.categoriaEspanol = categoriaEspanol;
    }

    public static Categoria fromString(String text){
        for (Categoria categoria : Categoria.values()){
            if (categoria.categoriaOmdb.equalsIgnoreCase(text)){
                return categoria;
            }
        }
        throw new IllegalArgumentException("Ninguna categoria encontrada: " + text);
    }
    public static Categoria fromEspanol(String text){
        for (Categoria categoria : Categoria.values()){
            if (categoria.categoriaEspanol.equalsIgnoreCase(text)){
                return categoria;
            }
        }
        throw new IllegalArgumentException("Ninguna categoria encontrada: " + text);
    }
}
