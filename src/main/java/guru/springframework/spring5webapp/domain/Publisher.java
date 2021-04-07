package guru.springframework.spring5webapp.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String publisher;

/*    @ManyToMany(mappedBy = "authors")
    @OneToMany(mappedBy = "book")*/

    public Publisher() {
    }

    public Publisher(Long id, String publisher) {
        this.id = id;
        this.publisher = publisher;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publisher publisher1 = (Publisher) o;
        return Objects.equals(id, publisher1.id) && Objects.equals(publisher, publisher1.publisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
