package br.com.consumer.financeiro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.consumer.financeiro.model.Financeiro;

@Repository
public interface FinanceiroRepository extends JpaRepository<Financeiro, Long> {	
}
