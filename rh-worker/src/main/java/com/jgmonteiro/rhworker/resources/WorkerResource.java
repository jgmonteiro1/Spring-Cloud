package com.jgmonteiro.rhworker.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jgmonteiro.rhworker.entities.Worker;
import com.jgmonteiro.rhworker.repositories.WorkerRepository;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {
	
	@Autowired
	private WorkerRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Worker>> getWorkers(){
		List<Worker> workers = repository.findAll();
		return ResponseEntity.ok().body(workers);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker> findById(@PathVariable Long id){
		Worker obj = repository.findById(id).get();
		return ResponseEntity.ok().body(obj);
	}
}
