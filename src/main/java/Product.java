import java.io.Serializable;

// This is our Bean
public class Product implements Serializable {

    private long id;
    private String title;
    private long priceInCents;
    private String description;

    // Create our zero-argument constructor
    // * We're doing this so that the JVM can reserve space for this in memory
    public Product() {}

    // Getters and setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getPriceInCents() {
        return priceInCents;
    }

    public void setPriceInCents(long priceInCents) {
        this.priceInCents = priceInCents;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
