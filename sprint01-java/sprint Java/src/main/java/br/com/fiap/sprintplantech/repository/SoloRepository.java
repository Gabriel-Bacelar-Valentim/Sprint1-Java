package br.com.fiap.sprintplantech.repository;

import br.com.fiap.sprintplantech.entity.Solo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SoloRepository extends JpaRepository<Solo, Long> {
    List<Solo> findByFazendaId(Long id);
}