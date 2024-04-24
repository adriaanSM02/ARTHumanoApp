package com.example.arthumano_Consultores;

public class Producto {

    private String nombre;
    private String precio;
    private int imagenid;
    private String disp;
    private String categoria;
    private String descripcion;


    public Producto(String nombre, String precio, int imagenid, String disp, String categoria, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.imagenid = imagenid;
        this.disp = disp;
        this.categoria = categoria;
        this.descripcion = descripcion;
    }

    public String getNombre(){ return nombre;}
    public void setNombre (String nombre) {this.nombre = nombre;}

    public String getPrecio(){ return precio;}
    public void setPrecio (String precio) {this.precio = precio;}

    public int getImagenId(){return imagenid;}
    public void setImagenid (int imagenid) {this.imagenid = imagenid;}

    public String getDisp(){return disp;}
    public void setDisp (String disp) {this.disp = disp;}

    public String getDescripcion(){ return descripcion;}
    public void setDescripcion (String descripcion) {this.descripcion = descripcion;}

    public String getCategoria(){ return categoria;}
    public void setCategoria (String categoria) {this.categoria = categoria;}

}
