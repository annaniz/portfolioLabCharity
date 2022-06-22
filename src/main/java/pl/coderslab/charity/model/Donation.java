package pl.coderslab.charity.model;


import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table
public class Donation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer quantity;

    @ManyToMany(cascade =  CascadeType.ALL)
    private List<Category> categories;

    @OneToOne
    private Institution institution;
    private String street;
    private String zipCode;
    private String city;
    private LocalDate pickUpDate;
    private LocalTime pickUpTime;
    private String pickUpComment;

}
