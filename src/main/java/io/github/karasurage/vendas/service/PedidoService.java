package io.github.karasurage.vendas.service;

import io.github.karasurage.vendas.domain.entity.Pedido;
import io.github.karasurage.vendas.rest.dto.PedidoDTO;

public interface PedidoService {
    Pedido salvar(PedidoDTO dto);
}
