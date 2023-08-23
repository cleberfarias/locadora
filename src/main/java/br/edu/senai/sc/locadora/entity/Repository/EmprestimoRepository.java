package br.edu.senai.sc.locadora.entity.Repository;

import br.edu.senai.sc.locadora.entity.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long> {

}
