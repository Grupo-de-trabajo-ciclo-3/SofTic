package com.softic.softa.services;

import com.softic.softa.entities.Transaction;
import com.softic.softa.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicesMovTransaction {
    @Autowired //Anotación para especificarle a Spring Boot que aquí estoy haciendo una inyección de dependencias
    TransactionRepository transactionRepository;

    //Metodos
    public void crearYActualizarTransaction(Transaction transaction){
        transactionRepository.save(transaction);
    }

    public List<Transaction> verTransaction(){
        List<Transaction> transactions = new ArrayList<Transaction>();
        transactions.addAll(transactionRepository.findAll());
        return transactions;
    }

    public void eliminarTransaction(Long idEnterprise){
        transactionRepository.deleteById(idEnterprise);
    }

}
