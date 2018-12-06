package com.nelioalves.cursomc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.cursomc.domain.PedidoItem;

@Repository
public interface PedidoItemRepository extends JpaRepository<PedidoItem, Integer> {

}
