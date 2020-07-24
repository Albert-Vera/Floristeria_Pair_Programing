package Model;

public class Flor extends Floristeria_Viejo.Model.Article {
    private String color;

    public Flor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
