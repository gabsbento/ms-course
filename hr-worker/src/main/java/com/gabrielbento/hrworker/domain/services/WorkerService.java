package com.gabrielbento.hrworker.domain.services;

import com.gabrielbento.hrworker.domain.entities.Worker;
import com.gabrielbento.hrworker.domain.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerService {
    @Autowired
    private WorkerRepository repository;

    public Worker save(Worker worker) {
        return repository.save(worker);
    }

    public List<Worker> findAll() {
        return repository.findAll();
    }

    public Worker findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Worker update(Worker worker) {
       return  repository.save(worker);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
