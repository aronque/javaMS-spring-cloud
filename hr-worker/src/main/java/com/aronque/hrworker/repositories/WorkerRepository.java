package com.aronque.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aronque.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
