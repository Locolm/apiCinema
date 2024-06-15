package com.example.apiCinema.domains;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "actor")
@Getter
@Setter
@NoArgsConstructor
public class EntityActor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer gender;

    private String name;

    private Date birthday;

    @Column(name = "deathday", nullable = true)
    private Date deathday;

    @Column(name = "place_of_birth")
    private String placeOfBirth;

    @Column(name = "profile_path")
    private String profilePath;

    private String biography;

    private Double popularity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntityActor that = (EntityActor) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(gender, that.gender) &&
                Objects.equals(name, that.name) &&
                Objects.equals(birthday, that.birthday) &&
                Objects.equals(deathday, that.deathday) &&
                Objects.equals(placeOfBirth, that.placeOfBirth) &&
                Objects.equals(profilePath, that.profilePath) &&
                Objects.equals(biography, that.biography) &&
                Objects.equals(popularity, that.popularity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, gender, name, birthday, deathday, placeOfBirth, profilePath, biography, popularity);
    }
}
