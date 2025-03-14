package com.example.back.controllers;

import com.example.back.models.Departamento;
import com.example.back.services.DepartamentoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/departamentos")
public class DepartamentoController {
    private final DepartamentoService departamentoService;

    public DepartamentoController(DepartamentoService departamentoService) {
        this.departamentoService = departamentoService;
    }

    @PostMapping
    public Departamento crearDepartamento(@RequestBody Departamento departamento) {
        return departamentoService.crearDepartamento(departamento);
    }

    @GetMapping
    public List<Departamento> listarDepartamentos() {
        return departamentoService.listarDepartamentos();
    }

    @GetMapping("/{id}")
    public Optional<Departamento> obtenerDepartamento(@PathVariable Long id) {
        return departamentoService.obtenerDepartamento(id);
    }
}
