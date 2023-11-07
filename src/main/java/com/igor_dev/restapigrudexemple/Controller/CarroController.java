package com.igor_dev.restapigrudexemple.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.igor_dev.restapigrudexemple.Repositoy.CarroRepository;
import com.igor_dev.restapigrudexemple.model.Carro;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class CarroController {

    CarroRepository repository;

    @GetMapping("/Carro")
    public List<Carro> getallcarros(){
        return repository.findAll();
    }

    @GetMapping("/Carro/{id}")
     public Carro getCarrobyidCarro(@PathVariable long id){
        return repository.findById(id).get();
     }

    @PostMapping("/Carro")
    public Carro saveCarro(@RequestBody Carro carro){
        return repository.save(carro); 
    }
    
    @DeleteMapping("/Carro/{id}")
    public void deletecarro(@PathVariable Long id){
         repository.deleteById(id);
        
    }


    @PutMapping("/Carro/{id}")
    public void updatecarro(@PathVariable long id){
        repository.


    }
}
