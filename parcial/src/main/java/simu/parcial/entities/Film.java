package simu.parcial.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Cleanup;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "film")
public class Film {
    @Id
    @Column(name = "film_id")
    private Long filmId;
    private String title;
    private String description;
    @Column(name = "release_year")
    private String releaseYear;
    @Column(name = "language_id")
    private Long languageId;
    @Column(name = "original_language_id")
    private Long originalLanguageId;
    @Column(name = "rental_duration")
    private Long rentalDuration;
    @Column(name = "rental_rate")
    private Double rentalRate;
    private Long length;
    @Column(name = "replacement_cost")
    private Double replacementCost;
    private String rating;
    @Column(name = "special_features")
    private String specialFeatures;
    @Column(name = "last_update")
    private LocalDateTime lastUpdate;

}
