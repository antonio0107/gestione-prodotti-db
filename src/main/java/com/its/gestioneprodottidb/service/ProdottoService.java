package com.its.gestioneprodottidb.service;

import com.its.gestioneprodottidb.entity.Prodotto;

import java.util.List;

public interface ProdottoService {
    List<Prodotto> getAll();

    String insert(Prodotto prodotto);

    Prodotto getId(Long id);
}
