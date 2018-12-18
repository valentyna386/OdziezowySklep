package pl.sklepOdziezowy;

import javax.persistence.*;

@Entity
public @Table(name = "TYPY")
class Typ {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idtypu")
    private Long id;
    private String nazwa;

    public Typ() {}
    public Typ(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }
}
