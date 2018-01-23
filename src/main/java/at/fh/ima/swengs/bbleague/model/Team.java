package at.fh.ima.swengs.bbleague.model;

import at.fh.ima.swengs.bbleague.util.JsonDateDeserializer;
import at.fh.ima.swengs.bbleague.util.JsonDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private String hometown;

 //   @JsonDeserialize(using = JsonDateDeserializer.class)
   // @JsonSerialize(using = JsonDateSerializer.class)
   // @Temporal(TemporalType.DATE)
    private String startDate;

    private String mascot;

    @ManyToOne
    private Stadium stadium;

    @ManyToOne
    private League league;

    @OneToMany(mappedBy = "team")//,orphanRemoval = true)
    private List<Player> players;

    @Version
    private long version;

    public Team() {

    }

    public Team(String name, String hometown, String startDate, String mascot, Stadium stadium, League league){
        this.name = name;
        this.hometown = hometown;
        this.startDate = startDate;
        this.mascot = mascot;
        this.stadium = stadium;
        this.league = league;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getMascot() {
        return mascot;
    }

    public void setMascot(String mascot) {
        this.mascot = mascot;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public List<Player> getPlayer() {return players;}

    public void setPlayer(List<Player> player) {
        this.players = players;
    }

    public void addPlayer(Player players) {
        this.players.add(players);
    } //TODO: check if setPlayer isnt necessary
}
