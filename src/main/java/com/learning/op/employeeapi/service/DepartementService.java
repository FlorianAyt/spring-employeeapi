package com.learning.op.employeeapi.service;

import com.learning.op.employeeapi.model.Departement;
import com.learning.op.employeeapi.repository.DepartementRepository;
import com.learning.op.employeeapi.repository.EmployeeRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class DepartementService {
    @Autowired
    private DepartementRepository departementRepository;

    /**
     * @param id
     * @return
     */
    public Optional <Departement> getDepartement(final Long id){
        return departementRepository.findById(id);
    }

    /**
     * @return
     */
    public Iterable <Departement> getDepartements(){
        return departementRepository.findAll();
    }

    /**
     * @param id
     */
    public void deleteDepartement(final Long id){
        departementRepository.deleteById(id);
    }

    /**
     * @param departement
     * @return
     */
    public Departement saveDepartement(Departement departement){
        return departementRepository.save(departement);
    }
}
