package br.com.salaobeleza.pedidosservice.controller.response;

public class ItemPedidoResponse {
    String tituloProduto;
    Integer quantidade;

    public String getTituloProduto() {
        return tituloProduto;
    }

    public void setTituloProduto(String tituloProduto) {
        this.tituloProduto = tituloProduto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
