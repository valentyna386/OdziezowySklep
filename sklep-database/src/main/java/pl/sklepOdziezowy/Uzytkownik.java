package pl.sklepOdziezowy;

import javax.persistence.*;

@Entity
public @Table(name = "UZYTKOWNICY")
class Uzytkownik {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "iduzytkownika")
    private Long id;
    private String imie;
    private String nazwisko;
    private String login;
    private String haslo;
    private String adres;

    public Uzytkownik() {}
    public Uzytkownik(Long id, String imie, String nazwisko, String login, String haslo, String adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.login = login;
        this.haslo = haslo;
        this.adres = adres;
    }

    public Long getId() {
        return id;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getLogin() {
        return login;
    }

    public String getAdres() {
        return adres;
    }
}
