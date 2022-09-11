package com.sachin.hotelapp.Hotel.Application.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * @author SachinDadhwal
 */
@Getter
@Setter
@Entity
@Table(name = "items")
public class Items {


    @Column(name = "createdAt")
    private LocalDateTime createdAt;
    @Column(name = "modifiedAt")
    private LocalDateTime modifiedAt;
}
