package sn.finapps.restaurant.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import sn.finapps.restaurant.model.Costumer;

import java.util.Optional;

public interface CostumerRepo extends JpaRepository<Costumer, Long> {
    Optional<Costumer> findByEmail(String email);
    @Query("" +
            "SELECT CASE WHEN COUNT(c) > 0 THEN " +
            "TRUE ELSE FALSE END " +
            "FROM Costumer c " +
            "WHERE c.email = ?1"
    )
    Boolean selectExistsEmail(String email);
}
