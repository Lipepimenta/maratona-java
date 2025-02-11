package academy.devdojo.maratonajava.javacore.ZZEstreams.dominio;

import java.util.Objects;

public class LighNovel {
    private String title;
    private double price;

    public LighNovel(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LighNovel lighNovel = (LighNovel) o;
        return Objects.equals(title, lighNovel.title);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(title);
    }

    @Override
    public String toString() {
        return "LighNovel{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
