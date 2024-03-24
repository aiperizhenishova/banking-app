package com.example.bankingapp.controllers;

import com.example.bankingapp.entities.Consultant;
import com.example.bankingapp.service.ConsultantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.bankingapp.entities.Consultant;



import java.util.List;

@RestController
@RequestMapping("/consultants")
public class ConsultantController {


    @Autowired
    private ConsultantService consultantService;

    // GET: Получение списка всех консультантов
    @GetMapping
    public ResponseEntity<List<Consultant>> getAllConsultants() {
        List<Consultant> consultants = consultantService.getAllConsultant();
        return new ResponseEntity<>(consultants, HttpStatus.OK);
    }

    // GET: Получение консультанта по ID
    @GetMapping("/{id}")
    public ResponseEntity<Consultant> getConsultantById(@PathVariable Long id) {
        Consultant consultant = consultantService.getConsultantById(id);
        return new ResponseEntity<>(consultant, consultant != null ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

    // POST: Создание нового консультанта
    @PostMapping
    public ResponseEntity<Consultant> createConsultant(@RequestBody Consultant consultant) {
        Consultant createdConsultant = consultantService.createConsultant(consultant);
        return new ResponseEntity<>(createdConsultant, HttpStatus.CREATED);
    }

    // PUT: Обновление существующего консультанта
    @PutMapping("/{id}")
    public ResponseEntity<Consultant> updateConsultant(@PathVariable Long id, @RequestBody Consultant consultant) {
        consultant.setId(id); // Устанавливаем ID консультанта, чтобы обновить существующего
        Consultant updatedConsultant = consultantService.updateConsultant(consultant);
        return new ResponseEntity<>(updatedConsultant, HttpStatus.OK);
    }

    // DELETE: Удаление консультанта
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteConsultant(@PathVariable Long id) {
        consultantService.deleteConsultant(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
