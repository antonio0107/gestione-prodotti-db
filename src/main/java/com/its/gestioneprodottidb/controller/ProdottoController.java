package com.its.gestioneprodottidb.controller;

import com.its.gestioneprodottidb.entity.Prodotto;
import com.its.gestioneprodottidb.service.ProdottoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/prodotti")
public class ProdottoController {
    @Autowired
    private ProdottoService prodottoService;

    @GetMapping("/get-all")
    public List<Prodotto> getAll(){
        return prodottoService.getAll();
    }

    @GetMapping("/get-prodotto/{id}")
    public Prodotto getId(@PathVariable Long id){
       return prodottoService.getId(id);
    }

    @PostMapping("/aggiungi-prodotto")
    public String aggiungi(@RequestBody Prodotto prodotto){
        return prodottoService.insert(prodotto);
    }


}
