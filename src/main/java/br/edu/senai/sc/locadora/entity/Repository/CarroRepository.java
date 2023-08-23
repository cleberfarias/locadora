package br.edu.senai.sc.locadora.entity.Repository;

import br.edu.senai.sc.locadora.entity.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface CarroRepository extends JpaRepository<Carro, Long> {
    List<Carro>findCarroByAno(int ano);

    List<Carro>findCarroByModeloContaining(String modelo);


    @Query(value = "select c from Carro c where c.modelo like ?1")
    List<Carro> buscaCarrosPorModelo(String Modelo);
    @Query(value = "SELECT count(*) from Carro", nativeQuery = true)
    Integer numerosCarros();
}
