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
    //TODO: implement FKs
    //TODO: generate getter and setter
}


