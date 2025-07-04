package com.juaracoding.smartpro_web.httpclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.juaracoding.smartpro_web.dto.validation.EditDivisionDTO;

@FeignClient(name = "division-service", url = "http://localhost:8085/division")
public interface DivisionService {
    
    @GetMapping
    public ResponseEntity<Object> findAll(@RequestHeader("Authorization") String token);

    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@RequestHeader("Authorization") String token, @PathVariable Long id);

    @PutMapping("/{id}")
    public ResponseEntity<Object> update(@RequestHeader("Authorization") String token, @RequestBody EditDivisionDTO divisionDTO, @PathVariable Long id);
}
