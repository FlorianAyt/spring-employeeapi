package com.learning.op.employeeapi.controller;

import com.learning.op.employeeapi.model.Departement;
import com.learning.op.employeeapi.service.DepartementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class DepartementController {
    @Autowired
    private DepartementService departementService;

    @GetMapping("/departements")
    public Iterable <Departement> getDepertaments(){
        return departementService.getDepartements();
    }

    @GetMapping("/departement/{id}")
    public Optional <Departement> getDepartement(@PathVariable Long id){
        return departementService.getDepartement(id);
    }

    @PostMapping("/departement")
    public Departement saveDepartement(@RequestBody Departement departement){
        return departementService.saveDepartement(departement);
    }
}
