package pl.sklepOdziezowy;

import javax.persistence.*;

@Entity
public @Table(name = "KOLORY")
class Kolor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idkoloru")
    private Long id;
    private String kolor;

    public Kolor() {}
    public Kolor(String kolor){
        this.kolor = kolor;
    }

    public Long getId() {
        return id;
    }
    public String getKolor() {
        return kolor;
    }
}
