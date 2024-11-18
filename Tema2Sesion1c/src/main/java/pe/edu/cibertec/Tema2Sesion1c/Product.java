package pe.edu.cibertec.Tema2Sesion1c;

public class Product {
    private String code;
    private String title;
    private String description;
    private double price;

    public Product(String code, String title, String description, double price) {
        this.code = code;
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
