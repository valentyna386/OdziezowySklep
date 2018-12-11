package pl.sklepOdziezowy;

import javax.persistence.*;

@Entity
public @Table(name = "MARKI")
class Marka {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idmarki")
    private Long id;
    private String nazwa;

    public Marka() {}
    public Marka(String nazwa) {
        this.nazwa = nazwa;
    }

    public Long getId() {
        return id;
    }

    public String getNazwa() {
        return nazwa;
    }
}
