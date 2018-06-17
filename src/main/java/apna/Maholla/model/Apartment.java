package apna.Maholla.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "Apartment")
public class Apartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ApartmentId;          //PK int

    @NotBlank
    private String ApartmentName;           //UNIQUE

    @NotBlank
    private String ApartmentUniqueId;          // string UNIQUE

    @NotBlank
    private String Address1;         // string

    @NotBlank
    private String Address2;             // string

    @ManyToOne
    private State stateId;

    @ManyToOne
    private City cityId;

    @ManyToOne
    private Country countryId;

    @NotBlank
    private long pinCode;

}
