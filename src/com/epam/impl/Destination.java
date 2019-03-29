package com.epam.impl;

class Destination {

    private String destination;

    private int length;
    private int benefitCriterion;
    private int cost;

    Destination(final String destination, final String length, final String cost) {
        this.destination = destination;
        this.length = Integer.parseInt(length);
        this.cost = Integer.parseInt(cost);

        //Here you can select the shortest path search criteria.

        this.benefitCriterion = this.length * (this.length/this.cost);
        //this.benefitCriterion = this.length;
        //this.benefitCriterion = this.cost;
        //this.benefitCriterion = this.length*this.cost*this.cost;
    }

    String getDestination() {
        return destination;
    }

    int getLength() {
        return length;
    }

    int getBenefitCriterion() {
        return benefitCriterion;
    }

    int getCost() {
        return cost;
    }
}
