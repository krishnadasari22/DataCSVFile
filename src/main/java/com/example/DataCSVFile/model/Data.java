package com.example.DataCSVFile.model;

import jakarta.persistence.*;



@Entity
@Table(name = "data")
public class Data {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int intensity;
    private int likelihood;
    private int relevance;
    private int year;
    private String country;
    private String topics;
    private String region;
    private String city;

    public Long id() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int intensity() {
        return intensity;
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }

    public int likelihood() {
        return likelihood;
    }

    public void setLikelihood(int likelihood) {
        this.likelihood = likelihood;
    }

    public int relevance() {
        return relevance;
    }

    public void setRelevance(int relevance) {
        this.relevance = relevance;
    }

    public int year() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String country() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String topics() {
        return topics;
    }

    public void setTopics(String topics) {
        this.topics = topics;
    }

    public String region() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String city() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
