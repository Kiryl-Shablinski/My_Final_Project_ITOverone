package com.example.my_final_project.models;

import jakarta.persistence.*;
import lombok.Data;
//база данных для товаров
@Entity
@Table(name = "advert_shop_model")
@Data
public class AdvertModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Column(name = "name")
    String name;

    @Column(name = "price")
    String price;

    @Column(name = "weight")
    String weight;

    @Column(name = "disc")
    String disc;

    @Column(name = "length")
    String length;

    @Column(name = "width")
    String width;

    @Column(name = "height")
    String height;


}
