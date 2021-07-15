package br.com.salaobeleza.pedidosservice.controller.response;

import br.com.salaobeleza.pedidosservice.dominio.Endereco;
import br.com.salaobeleza.pedidosservice.dominio.StatusPedido;

import java.math.BigDecimal;

public class FazerPedidoResponse {
    Long idPedido;
    Integer tempoEntrega;
    Endereco enderecoEntrega;
    BigDecimal valorTotal;
    StatusPedido statusPedido;


    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public Integer getTempoEntrega() {
        return tempoEntrega;
    }

    public void setTempoEntrega(Integer tempoEntrega) {
        this.tempoEntrega = tempoEntrega;
    }

    public Endereco getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(Endereco enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }
}
