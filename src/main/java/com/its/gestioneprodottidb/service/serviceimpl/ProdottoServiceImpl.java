package com.its.gestioneprodottidb.service.serviceimpl;

import com.its.gestioneprodottidb.entity.Prodotto;
import com.its.gestioneprodottidb.repository.ProdottoRepository;
import com.its.gestioneprodottidb.service.ProdottoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProdottoServiceImpl implements ProdottoService {

    List<Prodotto> prodotti = new ArrayList<>();

    @Autowired
    private ProdottoRepository prodottoRepository;

    @Override
    public List<Prodotto> getAll() {
        return prodottoRepository.findAll() ;
    }

    @Override
    public Prodotto getId(Long id) {
      return prodottoRepository.findById(id).orElse(null);
    }

    @Override
    public String insert(Prodotto prodotto) {

        String msg = "";
        if (prodotto != null) {
            if (prodotto.getNome() != null && prodotto.getPrezzo()>0) {
                    prodottoRepository.save(prodotto);
                    msg = "Prodotto aggiunto con successo!";
                } else {
                    msg = "Impossibile aggiungere prodotto: valorizzare tutti i campi e inserire prezzo valido (> 0)!";
                }
            }
        return msg;
    }

}
