package br.com.salaobeleza.pedidosservice.controller.request;

import br.com.salaobeleza.pedidosservice.dominio.FormaPagamento;

import java.util.List;

public class PedidoRequest {

    private Long idEstabelecimento;

    private Long idUsuarioSolicitante;

    private Long idEnderecoEntrega;

    private List<ItemPedidoRequest> itens;

    private FormaPagamento formaPagamento;

    public Long getIdEstabelecimento() {
        return idEstabelecimento;
    }

    public void setIdEstabelecimento(Long idEstabelecimento) {
        this.idEstabelecimento = idEstabelecimento;
    }

    public Long getIdUsuarioSolicitante() {
        return idUsuarioSolicitante;
    }

    public void setIdUsuarioSolicitante(Long idUsuarioSolicitante) {
        this.idUsuarioSolicitante = idUsuarioSolicitante;
    }

    public Long getIdEnderecoEntrega() {
        return idEnderecoEntrega;
    }

    public void setIdEnderecoEntrega(Long idEnderecoEntrega) {
        this.idEnderecoEntrega = idEnderecoEntrega;
    }

    public List<ItemPedidoRequest> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedidoRequest> itens) {
        this.itens = itens;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
}