package com.codermadhav.designpatterns.factory.restaurant;

public class RestaurantClient {
    public static void main(String[] args) {
        Restaurant chickenBurgerRestaurant = new ChickenBurgerRestaurant();
        chickenBurgerRestaurant.orderBurger();

        Restaurant veggieBurgerRestaurant = new VeggieBurgerRestaurant();
        veggieBurgerRestaurant.orderBurger();
    }
}
