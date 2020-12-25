package com.jgmonteiro.rhworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jgmonteiro.rhworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
