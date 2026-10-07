package com.daffa.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.daffa.product.entity.JenisProduk;
import com.daffa.product.entity.Produk;
import com.daffa.product.service.JenisProdukService;
import com.daffa.product.service.ProdukService;

@RestController
@RequestMapping("/api/produk")
public class ProdukController {

    @Autowired
    private ProdukService produkService;

    @Autowired
    private JenisProdukService jenisProdukService;

    // GET semua produk
    @GetMapping
    public List<Produk> getAllProduk(
            @RequestParam(value = "idjenis", required = false) Long idjenis) {

        if (idjenis != null) {
            return produkService.getAllBarangByIdJenis(idjenis);
        }

        return produkService.getAllProduk();
    }

    // GET produk berdasarkan ID
    @GetMapping("/{id}")
    public ResponseEntity<Produk> getProdukById(
            @PathVariable("id") Long id) {

        return ResponseEntity.ok(produkService.getProdukById(id));
    }

    // POST tambah produk
    @PostMapping
    public ResponseEntity<Produk> createProduk(
            @RequestBody Produk produk) {

        return ResponseEntity.ok(produkService.saveProduk(produk));
    }

    // PUT update produk
    @PutMapping("/{id}")
    public ResponseEntity<Produk> updateProduk(
            @PathVariable("id") Long id,
            @RequestBody Produk produk) {

        return ResponseEntity.ok(
                produkService.updateProduk(id, produk)
        );
    }

    // DELETE hapus produk
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduk(
            @PathVariable("id") Long id) {

        produkService.deleteProduk(id);

        return ResponseEntity.noContent().build();
    }

    // GET semua jenis produk
    @GetMapping("/jenis")
    public List<JenisProduk> getAllJenisProduk() {
        return jenisProdukService.getAllJenisProduk();
    }

    // GET jenis produk berdasarkan ID
    @GetMapping("/jenis/{id}")
    public ResponseEntity<JenisProduk> getJenisProdukById(
            @PathVariable("id") Long id) {

        return ResponseEntity.ok(
                jenisProdukService.getJenisProdukById(id)
        );
    }

    // POST tambah jenis produk
    @PostMapping("/jenis")
    public ResponseEntity<JenisProduk> createJenisProduk(
            @RequestBody JenisProduk jenisProduk) {

        return ResponseEntity.ok(
                jenisProdukService.saveJenisProduk(jenisProduk)
        );
    }
}