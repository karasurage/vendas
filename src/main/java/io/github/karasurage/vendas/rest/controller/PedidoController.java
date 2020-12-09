package io.github.karasurage.vendas.rest.controller;

import io.github.karasurage.vendas.domain.entity.Pedido;
import io.github.karasurage.vendas.rest.dto.PedidoDTO;
import io.github.karasurage.vendas.service.PedidoService;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    private PedidoService service;

    public PedidoController(PedidoService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(CREATED)
    public Integer save(@RequestBody PedidoDTO dto) {
        Pedido pedido = service.salvar(dto);
        return pedido.getId();
    }

    public void testarDevTools() {

    }

}