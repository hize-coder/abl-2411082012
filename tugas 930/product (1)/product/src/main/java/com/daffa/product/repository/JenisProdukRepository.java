package com.daffa.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daffa.product.entity.JenisProduk;

@Repository
public interface JenisProdukRepository extends JpaRepository<JenisProduk, Long> {
}
