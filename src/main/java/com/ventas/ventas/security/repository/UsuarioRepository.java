package com.ventas.ventas.security.repository;

import com.ventas.ventas.security.entity.UsuarioRol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioRol, Integer> {
    Optional<UsuarioRol> findByNombreUsuario(String nombreUsuario);
    boolean existsByNombreUsuario(String nombreUsuario);
    boolean existsByEmail(String email);

}