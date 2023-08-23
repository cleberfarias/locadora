package br.edu.senai.sc.locadora.service;

import br.edu.senai.sc.locadora.entity.Carro;
import br.edu.senai.sc.locadora.entity.Repository.CarroRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GerenciamentoService {

    private final CarroRepository carroRepository;

    public GerenciamentoService(CarroRepository carroRepository) {

        this.carroRepository = carroRepository;
    }


    public Carro salvarCarro (Carro carro){
    carroRepository.save(carro);

    return carro;
    }
    public void excluirCarro(Long codigo){

        carroRepository.deleteById(codigo);
    }

    public Optional<Carro> bucarCarroPorCodigo(Long codigo){

    return carroRepository.findById(codigo);


    }
    public List<Carro> buscarCarros(){
        return carroRepository.findAll();

    }




    public void alterarPlaca(String placa, Long codigo){
        Optional<Carro> carro = carroRepository.findById(codigo);
        if (Optional.ofNullable(carro).isPresent()){
            carro.get().setPlaca(placa);
            carroRepository.save(carro.get());
        }

    }
    public List<Carro> buscarCarrosPorModelo(String modelo){
        return carroRepository.findCarroByModeloContaining(modelo);

    }



}
