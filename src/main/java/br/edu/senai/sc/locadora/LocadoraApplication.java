package br.edu.senai.sc.locadora;

import br.edu.senai.sc.locadora.entity.Carro;
import org.hibernate.sql.Select;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
@EnableSwagger2
public class LocadoraApplication {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("locadora");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Iniciar uma transação antes de atualizar a entidade
        entityManager.getTransaction().begin();

//        Carro carro = new Carro();
//        carro.setCodigo(2);
//        carro.setModelo("Corsa");
//        carro.setCor("Branco");

        List<Carro> lista = new ArrayList<>();
        lista = entityManager.createQuery("SELECT new Carro (c.codigo, c.modelo, c.ano, c.placa, c.cor, c.preco, c.categoria) from Carro c").getResultList();

        for (Carro carro:lista){
            System.out.println(carro);
        }



        // Realizar o commit da transação
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

        System.out.println("Hello World!");
    }
}
