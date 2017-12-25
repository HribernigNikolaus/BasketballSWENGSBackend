package at.fh.ima.swengs.bbleague.model;

import at.fh.ima.swengs.bbleague.util.JsonDateDeserializer;
import at.fh.ima.swengs.bbleague.util.JsonDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;
import java.util.Date;

public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private String hometown;

    @JsonDeserialize(using = JsonDateDeserializer.class)
    @JsonSerialize(using = JsonDateSerializer.class)
    @Temporal(TemporalType.DATE)
    private Date startDate;

    private String mascot;

    @ManyToOne
    private Stadium stadium;

    @ManyToOne
    private League league;

    @OneToMany
    private Player player;

    //TODO: getter setter

}
