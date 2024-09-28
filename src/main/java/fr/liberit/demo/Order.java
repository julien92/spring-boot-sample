package fr.liberit.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.TenantId;

@Entity
@Getter
@Setter
@Table(name = "orders")
public class Order {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;

    @TenantId
    private String tenant;

    // Constructors
    public Order() {}

    public Order(String name) {
        this.name = name;
    }
}
