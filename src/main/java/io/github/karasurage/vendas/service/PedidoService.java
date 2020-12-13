package io.github.karasurage.vendas.service;

import io.github.karasurage.vendas.domain.entity.Pedido;
import io.github.karasurage.vendas.domain.enums.StatusPedido;
import io.github.karasurage.vendas.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar(PedidoDTO dto);
    Optional<Pedido> obterPedidoCompleto(Integer id);
    void atualizaStatus(Integer id, StatusPedido statusPedido);

}
