package com.nampat;

import com.nampat.model.Product;

public class Main {
    public static void main(String[] args) {
        System.out.println("Genius Hacks");

        Product product = new Product("Mickey");
        String productName = product.getName();

        System.out.println(productName);

        //Using getter method to get the name
        System.out.println(product.getName());

    }
}