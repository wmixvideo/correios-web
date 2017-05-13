package com.github.wmixvideo.correiosweb;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "correiosweb.config")
public class CorreiosWebConfig {

    private String usuario, senha;

    public String getUsuario() {
        return usuario;
    }

    public CorreiosWebConfig setUsuario(String usuario) {
        this.usuario = usuario;
        return this;
    }

    public String getSenha() {
        return senha;
    }

    public CorreiosWebConfig setSenha(String senha) {
        this.senha = senha;
        return this;
    }
}
