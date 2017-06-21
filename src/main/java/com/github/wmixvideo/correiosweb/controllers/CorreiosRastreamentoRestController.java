package com.github.wmixvideo.correiosweb.controllers;

import br.com.correios.webservice.rastro.Sroxml;
import com.github.wmixvideo.correios.WSCorreiosRastreador;
import com.github.wmixvideo.correiosweb.CorreiosWebConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CorreiosRastreamentoRestController {

    private final WSCorreiosRastreador correiosRastreador;

    @Autowired
    public CorreiosRastreamentoRestController(CorreiosWebConfig config) {
        correiosRastreador = new WSCorreiosRastreador(config.getUsuario(), config.getSenha());
    }

    @RequestMapping(value = "/rastrear/json/{objeto}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    Sroxml rastrearObjetoJson(@PathVariable String objeto) {
        return correiosRastreador.consultaObjeto(objeto);
    }

    @RequestMapping(value = "/rastrear/xml/{objeto}", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
    Sroxml rastrearObjetoXml(@PathVariable String objeto) {
        return correiosRastreador.consultaObjeto(objeto);
    }
}
