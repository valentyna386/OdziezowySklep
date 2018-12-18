package pl.sklepOdziezowy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.NamedQuery;
import java.util.List;

public interface MarkaRepository extends JpaRepository<Marka, Long> {
    List<Marka> findByNazwa(String nazwa);
    @Query(value = "SELECT * FROM Marki",nativeQuery = true)
    List<Marka> pobierzWszystkieMarki();
}