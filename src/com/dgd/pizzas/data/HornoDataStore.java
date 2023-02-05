package com.dgd.pizzas.data;

import com.dgd.pizzas.domain.models.Pizza;

import java.util.Map;
import java.util.TreeMap;

public class HornoDataStore {
    private static PizzaDataStore instance;

    private Map<Integer, Pizza> dataStore = new TreeMap<>();

    public void guardar(Pizza pizza){
        dataStore.put(pizza.getId(), pizza);
    }
    public void eliminar(Integer id){
        dataStore.remove(id);
    }
    public Pizza obtener(Integer id){
        return dataStore.get(id);
    }
    public static PizzaDataStore getInstance(){
        if (instance == null){
            instance = new PizzaDataStore();
        }
        return instance;
    }
}
