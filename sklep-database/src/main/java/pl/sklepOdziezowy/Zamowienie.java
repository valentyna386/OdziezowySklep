package pl.sklepOdziezowy;

import javax.persistence.*;

@Entity
public @Table(name = "ZAMOWIENIA")
class Zamowienie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idzamowienia")
    private Long id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idtowaru")
    private Towar towar;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "iduzytkownika")
    private Uzytkownik uzytkownik;

    public Zamowienie() {}
    public Zamowienie(Towar towar, Uzytkownik uzytkownik) {
        this.towar = towar;
        this.uzytkownik = uzytkownik;
    }

    public Long getId() {
        return id;
    }

    public Towar getTowar() {
        return towar;
    }

    public Uzytkownik getUzytkownik() {
        return uzytkownik;
    }
}
