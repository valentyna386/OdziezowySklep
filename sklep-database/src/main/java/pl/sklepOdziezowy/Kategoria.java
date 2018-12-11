package pl.sklepOdziezowy;

import javax.persistence.*;

@Entity

public @Table(name = "KATEGORIE")
class Kategoria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idkategorii")
    private Long id;
    private String nazwa;

    public Kategoria(){}
    public Kategoria(String nazwa) {
        this.nazwa = nazwa;
    }

    public Long getId() {
        return id;
    }

    public String getNazwa() {
        return nazwa;
    }
}
