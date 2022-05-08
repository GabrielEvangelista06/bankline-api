package com.dio.santander.bankline.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.santander.bankline.api.model.Correntista;

import com.dio.santander.bankline.api.model.*;

public interface CorrentistaRepository extends JpaRepository<Correntista, Integer> {

}