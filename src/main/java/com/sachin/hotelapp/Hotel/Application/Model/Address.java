package com.sachin.hotelapp.Hotel.Application.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author SachinDadhwal
 */
@Entity
@AllArgsConstructor
@Setter
@Getter
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "addressLine", length = 90)
    private String addressLine;
    @Column(name = "city", length = 20)
    private String city;
    @Column(name = "state", length = 20)
    private String state;
    @Column(name ="country", length=20)
    private String country;
    @Column(name ="pinCode")
    private Long pinCode;
    @Column(name = "createdAt")
    private LocalDateTime createdAt;
    @Column(name = "modifiedAt")
    private LocalDateTime modifiedAt;



}
