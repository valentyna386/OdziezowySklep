package pl.sklepOdziezowy;

import javax.persistence.*;

@Entity
public @Table(name = "RABATY")
class Rabat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idrabatu")
    private Long id;
    private Long wartosc;

    public Rabat() {}
    public Rabat(long wartosc){
        this.wartosc = wartosc;
    }

    public Long getId() {
        return id;
    }
    public Long getWartosc() {
        return wartosc;
    }
}
