package com.daffa.order.vo;

public class PelangganVO {
    private Long id;
    private String nama;
    private String email;
    // Tambahkan atribut lain sesuai dengan entity di service Pelanggan

    // Generate Getter dan Setter
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}