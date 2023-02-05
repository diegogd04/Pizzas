package com.dgd.pizzas.domain.usecase;

import com.dgd.pizzas.data.PizzaDataStore;
import com.dgd.pizzas.domain.models.Pizza;

public class GuardarPizzaUseCase {
    private PizzaDataStore dataStore = PizzaDataStore.getInstance();

    public void execute(Pizza pizza){
        dataStore.guardar(pizza);
    }
}
