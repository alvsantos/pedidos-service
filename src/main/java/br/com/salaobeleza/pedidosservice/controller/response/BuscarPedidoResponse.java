package br.com.salaobeleza.pedidosservice.controller.response;

import br.com.salaobeleza.pedidosservice.dominio.Endereco;
import br.com.salaobeleza.pedidosservice.dominio.Entregador;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class BuscarPedidoResponse {

    String nomeUsuario;
    Endereco enderecoEntrega;
    String nomeFantasia;
    BigDecimal valorTotal;
    Entregador entregador;
    LocalDateTime horarioPrevistoEntrega;
    List<ItemPedidoResponse> itensPedido;

    public void setItensPedido(List<ItemPedidoResponse> itensPedido) {
        this.itensPedido = itensPedido;
    }

    public List<ItemPedidoResponse> getItensPedido() {
        return itensPedido;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public Endereco getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(Endereco enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Entregador getEntregador() {
        return entregador;
    }

    public void setEntregador(Entregador entregador) {
        this.entregador = entregador;
    }

    public LocalDateTime getHorarioPrevistoEntrega() {
        return horarioPrevistoEntrega;
    }

    public void setHorarioPrevistoEntrega(LocalDateTime horarioPrevistoEntrega) {
        this.horarioPrevistoEntrega = horarioPrevistoEntrega;
    }

}
