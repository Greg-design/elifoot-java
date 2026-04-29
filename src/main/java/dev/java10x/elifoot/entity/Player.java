package dev.java10x.elifoot.entity;

import dev.java10x.elifoot.enums.Position;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NotNull
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "player_seq")
    @SequenceGenerator(name = "player_seq", sequenceName = "player_seq", allocationSize = 1)
    private Long id;
    private String name;

    @Enumerated(EnumType.STRING)
    private Position position;

    private int shirtNumber;
    private String urlImg;

    @ManyToOne
    @JoinColumn(name = "club_id")
    private Club club;
}
