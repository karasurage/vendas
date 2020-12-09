package io.github.karasurage.vendas.domain.repository;

import io.github.karasurage.vendas.domain.entity.Cliente;
import io.github.karasurage.vendas.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Pedidos extends JpaRepository<Pedido, Integer> {

    List<Pedido> findByCliente(Cliente cliente);
}
