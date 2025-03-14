package com.example.back.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.back.models.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {
}
