package com.example.back.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.back.models.Empleado;

import java.util.List;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
    List<Empleado> findByDepartamentoId(Long departamentoId);
}
