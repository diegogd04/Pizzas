package com.dgd.pizzas.domain.usecase;

import com.dgd.pizzas.data.PizzaDataStore;
import com.dgd.pizzas.domain.models.Pizza;

import java.util.List;

public class ObtenerPizzaUsecase {
    private PizzaDataStore dataStore = PizzaDataStore.getInstance();

    public List<Pizza> execute(){
        return dataStore.obtenerTodasPizzas();
    }
}
