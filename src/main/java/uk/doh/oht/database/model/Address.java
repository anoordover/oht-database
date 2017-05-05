package uk.doh.oht.database.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by peterwhitehead on 05/05/2017.
 */
@Data
@AllArgsConstructor
public class Address {
    private String type;
    private String lineOne;
    private String lineTwo;
    private String lineThree;
    private String lineFour;
    private String lineFive;
    private String lineSix;
    private String country;
    private String postcode;
}
