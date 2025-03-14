package com.example.back.services;

import com.example.back.models.Empleado;
import com.example.back.repositories.EmpleadoRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService {
    private final EmpleadoRepository empleadoRepository;

    public EmpleadoService(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    public Empleado crearEmpleado(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    public List<Empleado> listarEmpleados(Long departamentoId) {
        return empleadoRepository.findByDepartamentoId(departamentoId);
    }

    public Optional<Empleado> obtenerEmpleado(Long id) {
        return empleadoRepository.findById(id);
    }

    public void eliminarEmpleado(Long id) {
        empleadoRepository.deleteById(id);
    }
}
