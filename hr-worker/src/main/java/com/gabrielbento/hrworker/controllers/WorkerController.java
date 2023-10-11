package com.gabrielbento.hrworker.controllers;

import com.gabrielbento.hrworker.domain.entities.Worker;
import com.gabrielbento.hrworker.domain.services.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workers")
public class WorkerController {
    @Autowired
    private WorkerService workerService;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll() {
        List<Worker> workers = workerService.findAll();
        return ResponseEntity.ok().body(workers);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id) {
        Worker worker = workerService.findById(id);
        return ResponseEntity.ok().body(worker);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        workerService.delete(id);
    }

    @PostMapping
    public ResponseEntity<Worker> save(@RequestBody Worker worker) {
        Worker savedWorker = workerService.save(worker);
        return ResponseEntity.ok().body(savedWorker);
    }
}
