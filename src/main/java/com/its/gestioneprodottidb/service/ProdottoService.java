package com.its.gestioneprodottidb.service;

import com.its.gestioneprodottidb.entity.Prodotto;

import java.util.List;
import java.util.Optional;

public interface ProdottoService {
    List<Prodotto> getAll();

    String insert(Prodotto prodotto);

    Optional getId(Long id);
}
