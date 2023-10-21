package simu.parcial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import simu.parcial.entities.Film;

public interface FilmRepository extends JpaRepository<Film, Long> {
}
