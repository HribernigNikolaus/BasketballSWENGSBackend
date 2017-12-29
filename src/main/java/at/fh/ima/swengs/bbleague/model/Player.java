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

    private int sozNr;

    private Number height;

    private Number weight;

    private Number shoeSize;

    @ManyToOne
    private Team team;


    @Version
    private long version;


    public Player () {

    }

    public Player(String firstName, String lastName, Date dayOfBirth, Number marketValue, int sozNr, Number height, Number weight, Number shoeSize, Team team) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dayOfBirth = dayOfBirth;
        this.marketValue = marketValue;
        this.sozNr = sozNr;
        this.height = height;
        this.weight = weight;
        this.shoeSize = shoeSize;
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

    public int getSozNr() {
        return sozNr;
    }

    public void setSozNr(int sozNr) {
        this.sozNr = sozNr;
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

    public Number getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(Number shoeSize) {
        this.shoeSize = shoeSize;
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
