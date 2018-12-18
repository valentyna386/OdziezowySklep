package pl.sklepOdziezowy;

import javax.persistence.*;

@Entity
public @Table(name = "ROZMIARY")
class Rozmiar {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idrozmiaru")
    private Long id;
    private String nazwa;

    public Rozmiar() {}
    public Rozmiar(String nazwa) {
        this.nazwa = nazwa;
    }

    public Long getId() {
        return id;
    }

    public String getNazwa() {
        return nazwa;
    }
}
