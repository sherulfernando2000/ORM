package org.example.embed;

import jakarta.persistence.Embeddable;

@Embeddable
public class FullType {
    String firstType;
    String secondType;

    public FullType() {
    }

    public FullType(String firstType, String secondType) {
        this.firstType = firstType;
        this.secondType = secondType;
    }


    public String getFirstType() {
        return firstType;
    }

    public void setFirstType(String firstType) {
        this.firstType = firstType;
    }

    public String getSecondType() {
        return secondType;
    }

    public void setSecondType(String secondType) {
        this.secondType = secondType;
    }
}
