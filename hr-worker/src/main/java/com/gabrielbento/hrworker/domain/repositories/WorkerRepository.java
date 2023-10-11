package com.gabrielbento.hrworker.domain.repositories;

import com.gabrielbento.hrworker.domain.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
