package com.dgd.pizzas.domain.usecase;

import com.dgd.pizzas.data.PizzaDataStore;
import com.dgd.pizzas.domain.models.Pizza;

public class EliminarPizzaUseCase {
    private PizzaDataStore dataStore = PizzaDataStore.getInstance();

    public EliminarPizzaUseCase(Pizza pizza){
        dataStore.eliminar(pizza);
    }
}
