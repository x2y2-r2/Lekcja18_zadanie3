package restauracja;

import java.util.Objects;

public class Stolik {
    double cenaZamowien;
    String imieKelnerki;

    public Stolik(double cenaZamowien, String imieKelnerki) {
        this.cenaZamowien = cenaZamowien;
        this.imieKelnerki = imieKelnerki;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stolik stolik = (Stolik) o;
        return Objects.equals(imieKelnerki, stolik.imieKelnerki);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imieKelnerki);
    }
}