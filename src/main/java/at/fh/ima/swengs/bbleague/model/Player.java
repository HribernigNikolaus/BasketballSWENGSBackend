package at.fh.ima.swengs.bbleague.model;

import at.fh.ima.swengs.bbleague.util.JsonDateDeserializer;
import at.fh.ima.swengs.bbleague.util.JsonDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstName;
    private String lastName;

    @JsonDeserialize(using = JsonDateDeserializer.class)
    @JsonSerialize(using = JsonDateSerializer.class)
    @Temporal(TemporalType.DATE)
    private Date dayOfBirth;

    private Number marketValue;

    private int playerNumber;

    private Number height;

    private Number weight;

    private String position;

    //TODO: es gibt hier ein Problem - Height, marketvalue und weight werden in der DB als "tinyblob" angelegt und dementsprechend abgespeichert? 
    @ManyToOne
    private Team team;


    @Version
    private long version;


    public Player () {

    }

    public Player(String firstName, String lastName, Date dayOfBirth, Number marketValue, int playerNumber, Number height, Number weight, String position, Team team) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dayOfBirth = dayOfBirth;
        this.marketValue = marketValue;
        this.playerNumber = playerNumber;
        this.height = height;
        this.weight = weight;
        this.position = position;
        this.team = team;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(Date dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public Number getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(Number marketValue) {
        this.marketValue = marketValue;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public Number getHeight() {
        return height;
    }

    public void setHeight(Number height) {
        this.height = height;
    }

    public Number getWeight() {
        return weight;
    }

    public void setWeight(Number weight) {
        this.weight = weight;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
