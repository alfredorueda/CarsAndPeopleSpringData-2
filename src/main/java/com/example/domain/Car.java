package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Car {

    @Id
    @GeneratedValue
    private long id;
    private String brand;
    private String model;
    private Integer yearOfFab;
    private String plateNumber;
    private double price;
    @ManyToOne  //un coche sólo puede pertenecer a una persona
    private Person owner;


    public Car(String brand, String model, Integer yearOfFab, String plateNumber, double price) {
        this.brand = brand;
        this.model = model;
        this.yearOfFab = yearOfFab;
        this.plateNumber = plateNumber;
        this.price = price;
    }

    public Car() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYearOfFab() {
        return yearOfFab;
    }

    public void setYearOfFab(Integer yearOfFab) {
        this.yearOfFab = yearOfFab;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfFab=" + yearOfFab +
                ", plateNumber='" + plateNumber + '\'' +
                ", price=" + price +
                '}' + System.lineSeparator();
    }

    public int compareTo(Car anotherCar) {

        // System.out.println("Comparing the following two cars: ");
        // System.out.println(this);
        // System.out.println(anotherCar);
        return this.plateNumber.compareTo(anotherCar.plateNumber);
    }

}


