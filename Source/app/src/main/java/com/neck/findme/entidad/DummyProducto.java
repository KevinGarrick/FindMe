package com.neck.findme.entidad;

/**
 * Created by Kevin on 25/08/2016.
 */
public class DummyProducto {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLeftProducts() {
        return leftProducts;
    }

    public void setLeftProducts(String leftProducts) {
        this.leftProducts = leftProducts;
    }

    public String getRightProducts() {
        return rightProducts;
    }

    public void setRightProducts(String rightProducts) {
        this.rightProducts = rightProducts;
    }

    public String getProductoServicio() {
        return productoServicio;
    }

    public void setProductoServicio(String productoServicio) {
        this.productoServicio = productoServicio;
    }

    String id;
    String leftProducts;
    String rightProducts;
    String productoServicio;

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    int img;

    public DummyProducto(String id, String leftProducts, String rightProducts,
                         String productoServicio, int img) {
        this.id = id;
        this.leftProducts = leftProducts;
        this.rightProducts = rightProducts;
        this.productoServicio = productoServicio;
        this.img = img;
    }

    @Override
    public String toString() {
        return "producto{" +
                "ID='" + id + '\'' +
                ", Izquierda='" + leftProducts + '\'' +
                ", Derecha='" + rightProducts + '\'' +
                ", Titulo='" + productoServicio + '\'' +
                '}';
    }
}
