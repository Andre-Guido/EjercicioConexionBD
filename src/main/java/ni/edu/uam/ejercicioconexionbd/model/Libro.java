package ni.edu.uam.ejercicioconexionbd.model;

import java.util.Objects;

public class Libro {
    private int id;
    private String titulo;
    private String autor;
    private String categoria;
    private double precio;
    private int stock;

    public Libro() {
    }

    public Libro(int id, String titulo, String autor, String categoria, double precio, int stock) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return id == libro.id && Double.compare(precio, libro.precio) == 0 && stock == libro.stock && Objects.equals(titulo, libro.titulo) && Objects.equals(autor, libro.autor) && Objects.equals(categoria, libro.categoria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo, autor, categoria, precio, stock);
    }
}
