package com.sachin.hotelapp.Hotel.Application.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author SachinDadhwal
 */
@Getter
@Setter
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "customerName", length = 20)
    private String customerName;
    @Column(name = "customerEmail", unique = true, length = 50)
    private String customerEmail;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;
    @Column(name = "createdAt")
    private LocalDateTime createdAt;
    @Column(name = "modifiedAt")
    private LocalDateTime modifiedAt;

}
