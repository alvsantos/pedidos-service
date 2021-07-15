package br.com.salaobeleza.pedidosservice.repository;

import br.com.salaobeleza.pedidosservice.dominio.Pedido;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends ReactiveMongoRepository<Pedido, Long> {
}
