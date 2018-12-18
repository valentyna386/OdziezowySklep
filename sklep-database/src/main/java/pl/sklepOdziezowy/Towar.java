package pl.sklepOdziezowy;

import javax.persistence.*;

@Entity
@Table(name = "TOWARY")
public class Towar {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idtowaru")
    private Long id;

    private String nazwa;

    private Long ilosc;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idmarki")
    private Marka marka;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idkategorii")
    private Kategoria kategoria;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idtypu")
    private Typ typ;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idkoloru")
    private Kolor kolor;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idrozmiaru")
    private Rozmiar rozmiar;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idrabatu")
    private Rabat rabat;

    public Towar() {}
    public Towar(String nazwa, Long ilosc, Marka marka, Kategoria kategoria, Typ typ, Kolor kolor, Rozmiar rozmiar, Rabat rabat) {
        this.nazwa = nazwa;
        this.ilosc = ilosc;
        this.marka = marka;
        this.kategoria = kategoria;
        this.typ = typ;
        this.kolor = kolor;
        this.rozmiar = rozmiar;
        this.rabat = rabat;
    }

    public Long getId() {
        return id;
    }

    public Marka getMarka() {
        return marka;
    }

    public String getNazwa() {
        return nazwa;
    }

    public Kategoria getKategoria() {
        return kategoria;
    }

    public Kolor getKolor() {
        return kolor;
    }

    public Rozmiar getRozmiar() {
        return rozmiar;
    }

    public Rabat getRabat() {
        return rabat;
    }

    public Typ getTyp() {
        return typ;
    }

    public Long getIlosc() {
        return ilosc;
    }
}
