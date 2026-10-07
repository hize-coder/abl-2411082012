package com.daffa.order.vo;

public class ProdukVO {
    private Long id;
    private String namaProduk;
    private double harga;
    // Tambahkan atribut lain sesuai dengan entity di service Produk

    // Generate Getter dan Setter
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNamaProduk() { return namaProduk; }
    public void setNamaProduk(String namaProduk) { this.namaProduk = namaProduk; }
    public double getHarga() { return harga; }
    public void setHarga(double harga) { this.harga = harga; }
}