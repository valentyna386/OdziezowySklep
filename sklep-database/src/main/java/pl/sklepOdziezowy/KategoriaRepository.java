package pl.sklepOdziezowy;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KategoriaRepository extends JpaRepository<Kategoria, Long> {
    List<Kategoria> findByNazwa(String nazwa);
}
