package homework6.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "PRODUCT2")
@NamedQueries({
        @NamedQuery(name = "Product2.findTitleById",
                query = "select p.title from Product2 p where p.id = :id"),
        @NamedQuery(name = "Product2.findById",
                query = "select p from Product2 p where p.id = :id")
})
public class Product2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "cost")
    private BigDecimal cost;


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", cost=" + cost;
    }
}
