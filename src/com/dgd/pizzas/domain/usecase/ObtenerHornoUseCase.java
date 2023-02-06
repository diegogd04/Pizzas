package com.dgd.pizzas.domain.usecase;

import com.dgd.pizzas.data.HornoDataStore;
import com.dgd.pizzas.domain.models.Horno;

import java.util.List;

public class ObtenerHornoUseCase {
    private HornoDataStore dataStore = HornoDataStore.getInstance();

    public List<Horno> execute(){
        return dataStore.obtenerTodosHornos();
    }
}
