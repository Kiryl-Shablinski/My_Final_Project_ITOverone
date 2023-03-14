package com.example.my_final_project.models;

import jakarta.persistence.*;
import lombok.Data;
//база данных для обработки запросов
@Entity
@Table(name = "recive")
@Data
public class RecieveModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name = "name")
    String name;
    @Column(name = "type")
    String type;
    @Column(name = "contact")
    String contact;
    @Column(name="item_id")
    String itemId;
    @Column(name = "item_name")
    String itemName;
}
