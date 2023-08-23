package br.edu.senai.sc.locadora.repository;

import br.edu.senai.sc.locadora.entity.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface carroRepository extends JpaRepository<Carro, Long> {
}
