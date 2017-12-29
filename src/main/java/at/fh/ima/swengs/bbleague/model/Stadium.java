package at.fh.ima.swengs.bbleague.model;

import at.fh.ima.swengs.bbleague.util.JsonDateDeserializer;
import at.fh.ima.swengs.bbleague.util.JsonDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Stadium {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private String land;

    private String city;

    private String streetAndNumber;

    private short plz;

    @JsonDeserialize(using = JsonDateDeserializer.class)
    @JsonSerialize(using = JsonDateSerializer.class)
    @Temporal(TemporalType.DATE)
    private Date buildDate;

    private long visitorLimit;

    @OneToMany
    private Stadium stadium;




    @Version
    private long version;

    public Stadium() {

    }

    public Stadium(String name, String land, String city, String streetAndNumber, short plz, Date buildDate, long visitorLimit) {
        this.name = name;
        this.land = land;
        this.city = city;
        this.streetAndNumber = streetAndNumber;
        this.plz = plz;
        this.buildDate = buildDate;
        this.visitorLimit = visitorLimit;
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

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetAndNumber() {
        return streetAndNumber;
    }

    public void setStreetAndNumber(String streetAndNumber) {
        this.streetAndNumber = streetAndNumber;
    }

    public short getPlz() {
        return plz;
    }

    public void setPlz(short plz) {
        this.plz = plz;
    }

    public Date getBuildDate() {
        return buildDate;
    }

    public void setBuildDate(Date buildDate) {
        this.buildDate = buildDate;
    }

    public long getVisitorLimit() {
        return visitorLimit;
    }

    public void setVisitorLimit(long visitorLimit) {
        this.visitorLimit = visitorLimit;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }
}


