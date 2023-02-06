package com.dgd.pizzas.domain.usecase;

import com.dgd.pizzas.data.HornoDataStore;
import com.dgd.pizzas.domain.models.Horno;

public class GuardarHornoUseCase {
    private HornoDataStore dataStore = HornoDataStore.getInstance();

    public void execute(Horno horno){
        dataStore.guardar(horno);
    }
}
