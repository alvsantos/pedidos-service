package br.com.salaobeleza.pedidosservice.controller;

import br.com.salaobeleza.pedidosservice.controller.response.BuscarPedidoResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.Collections;
import java.util.List;

@RestController
public class ProdutoController {

    @GetMapping
    public Flux<BuscarPedidoResponse> listarPedidos(){
        List<BuscarPedidoResponse> pedidos = Collections.singletonList(new BuscarPedidoResponse());
        pedidos.add(new BuscarPedidoResponse());
        pedidos.add(new BuscarPedidoResponse());
        pedidos.add(new BuscarPedidoResponse());
        pedidos.add(new BuscarPedidoResponse());


        return Flux.fromIterable(pedidos);
    }

}
