package homework2;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
    private int id;
    private String title;
    private int cost;

    public String getData() {
        return ("id: " + id + " title: " + title + " cost: " + cost);
    }

}
