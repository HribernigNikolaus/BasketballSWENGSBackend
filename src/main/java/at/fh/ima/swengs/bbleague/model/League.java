package at.fh.ima.swengs.bbleague.model;

import javax.persistence.*;

@Entity
public class League {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private String land;



    @Version
    private long version;

    public League() {

    }

    public League(String name, String land) {
        this.name = name;
        this.land = land;
    }
    //TODO: implement FKs
    //TODO: generate getter and setter
}


