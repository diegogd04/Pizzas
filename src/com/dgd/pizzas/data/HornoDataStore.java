package com.dgd.pizzas.data;

import com.dgd.pizzas.domain.models.Horno;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HornoDataStore {
    private static HornoDataStore instance;

    private Map<Integer, Horno> dataStore = new TreeMap<>();

    public void guardar(Horno horno) {
        dataStore.put(horno.getId(), horno);
    }

    public void eliminar(Horno horno) {
        dataStore.remove(horno.getId(), horno);
    }

    public List<Horno> obtenerTodosHornos() {
        return dataStore.values().stream().toList();
    }
    public static HornoDataStore getInstance() {
        if (instance == null) {
            instance = new HornoDataStore();
        }
        return instance;
    }
}