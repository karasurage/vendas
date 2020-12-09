package io.github.karasurage.vendas.domain.repository;

import io.github.karasurage.vendas.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto,Integer> {
}
