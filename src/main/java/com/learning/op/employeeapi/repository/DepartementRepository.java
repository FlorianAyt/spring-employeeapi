package com.learning.op.employeeapi.repository;

import com.learning.op.employeeapi.model.Departement;
import org.springframework.data.repository.CrudRepository;

public interface DepartementRepository extends CrudRepository<Departement, Long> {
}
