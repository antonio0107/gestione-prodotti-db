package com.its.gestioneprodottidb.repository;

import com.its.gestioneprodottidb.entity.Prodotto;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdottoRepository extends JpaRepository<Prodotto, Long> {




}
