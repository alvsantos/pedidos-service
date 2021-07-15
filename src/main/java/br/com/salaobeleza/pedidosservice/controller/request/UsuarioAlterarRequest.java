package br.com.salaobeleza.pedidosservice.controller.request;

import br.com.salaobeleza.pedidosservice.dominio.Endereco;

import javax.validation.constraints.NotBlank;
import java.util.List;

public class UsuarioAlterarRequest {

    @NotBlank
    private String nome;

    @NotBlank
    private String email;

    @NotBlank
    private String senha;

    private List<Endereco> enderecos;

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
