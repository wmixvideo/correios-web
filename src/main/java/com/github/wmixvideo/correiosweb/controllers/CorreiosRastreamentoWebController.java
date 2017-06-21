package com.github.wmixvideo.correiosweb.controllers;

import br.com.correios.webservice.rastro.Sroxml;
import com.github.wmixvideo.correios.WSCorreiosRastreador;
import com.github.wmixvideo.correiosweb.CorreiosWebConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class CorreiosRastreamentoWebController {

    private final WSCorreiosRastreador correiosRastreador;

    @Autowired
    public CorreiosRastreamentoWebController(CorreiosWebConfig config) {
        correiosRastreador = new WSCorreiosRastreador(config.getUsuario(), config.getSenha());
    }

    @RequestMapping(value = "/rastrear/html/{objeto}", method = RequestMethod.GET)
    public String rastrearObjeto(Map<String, Object> model, @PathVariable String objeto) {
        final Sroxml sroxml = correiosRastreador.consultaObjeto(objeto);
        model.put("message", sroxml.getVersao());
        return "rastreamento";
    }
}
