package com.sachin.hotelapp.Hotel.Application.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author SachinDadhwal
 */
@Getter
@Setter
@Entity
@Table(name = "restaurant")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "restaurant_name",length = 30,unique = true)
    private String restaurantName;
    @Column(name = "restaurant_status",length = 30)
    private String restaurantStatus;
    @Column(name = "serving_hours",length = 30)
    private String servingHours;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;
    @OneToMany
    private List<Customer> customerList;
    @Column(name = "createdAt")
    private LocalDateTime createdAt;
    @Column(name = "modifiedAt")
    private LocalDateTime modifiedAt;
}
