package br.com.salaobeleza.pedidosservice.controller.response;

import br.com.salaobeleza.pedidosservice.dominio.Categoria;

import java.math.BigDecimal;

public class ProdutoResponse {
     String titulo;
     String descricao;
     BigDecimal valor;
     String cnpjEstabelecimento;
     Categoria categoria;
     Integer tempoPreparo;
     String urlFoto;

     public String getTitulo() {
          return titulo;
     }

     public void setTitulo(String titulo) {
          this.titulo = titulo;
     }

     public String getDescricao() {
          return descricao;
     }

     public void setDescricao(String descricao) {
          this.descricao = descricao;
     }

     public BigDecimal getValor() {
          return valor;
     }

     public void setValor(BigDecimal valor) {
          this.valor = valor;
     }

     public String getCnpjEstabelecimento() {
          return cnpjEstabelecimento;
     }

     public void setCnpjEstabelecimento(String cnpjEstabelecimento) {
          this.cnpjEstabelecimento = cnpjEstabelecimento;
     }

     public Categoria getCategoria() {
          return categoria;
     }

     public void setCategoria(Categoria categoria) {
          this.categoria = categoria;
     }

     public Integer getTempoPreparo() {
          return tempoPreparo;
     }

     public void setTempoPreparo(Integer tempoPreparo) {
          this.tempoPreparo = tempoPreparo;
     }

     public String getUrlFoto() {
          return urlFoto;
     }

     public void setUrlFoto(String urlFoto) {
          this.urlFoto = urlFoto;
     }
}
