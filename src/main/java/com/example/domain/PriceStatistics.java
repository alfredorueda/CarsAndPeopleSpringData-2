package com.example.domain;

public class PriceStatistics {
    private String marca;
    private double average;
    private double min;
    private double max;

    public PriceStatistics(String marca, double average, double min, double max) {
        this.marca = marca;
        this.average = average;
        this.min = min;
        this.max = max;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    @Override
    public String toString() {
        return "PriceStatistics{" +
                "marca='" + marca + '\'' +
                ", average=" + average +
                ", min=" + min +
                ", max=" + max +
                '}' + System.lineSeparator();
    }
}
