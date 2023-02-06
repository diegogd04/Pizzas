package com.dgd.pizzas.presentation;

import com.dgd.pizzas.domain.models.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String extras = "", picante = "", queso_azul = "", queso_cabra = "", carne = "", opcion = "";
        boolean pagar = false;

        do {
            Barbacoa barbacoa = new Barbacoa();
            barbacoa.setId(1);
            barbacoa.setNombre("Barbacoa");
            barbacoa.setSalsa("Barbacoa");
            barbacoa.setExtras(null);
            barbacoa.setPicante(null);

            Carbonara carbonara = new Carbonara();
            carbonara.setId(2);
            carbonara.setNombre("Carbonara");
            carbonara.setSalsa("Carbonara");
            carbonara.setExtras(extras);
            carbonara.setQueso_azul(null);
            carbonara.setQueso_cabra(null);

            Campera campera = new Campera();
            campera.setId(3);
            campera.setNombre("Campera");
            campera.setSalsa("Campera");
            campera.setExtras(null);
            campera.setCarne(null);

            Horno hornoA = new Horno();
            hornoA.setId(1);
            hornoA.setNombre("Horno A");
            hornoA.setMarca("Electrolux");
            hornoA.setTemperatura(180);

            Horno hornoB = new Horno();
            hornoB.setId(2);
            hornoB.setNombre("Horno B");
            hornoB.setMarca("Hisense");
            hornoB.setTemperatura(200);

            System.out.println("Pizzas");
            System.out.println("------");
            System.out.println("BARBACOA");
            System.out.println("CARBONARA");
            System.out.println("CAMPERA");
            System.out.println("Introduce la pizza que quieres:");
            System.out.println("Si quieres pagar: Introduce PAGAR");
            opcion = sc.nextLine();

            switch (opcion){
                case "BARBACOA":
                    System.out.println("Pizza: " + barbacoa.getNombre());
                    System.out.println("Salsa: " + barbacoa.getSalsa());
                    System.out.println("¿Algún extra? Introducelo:");
                    barbacoa.setExtras(extras = sc.nextLine());
                    System.out.println("¿Quieres picante? (si o no)");
                    picante = sc.nextLine();
                    if (picante == "si"){
                        barbacoa.setPicante(true);
                    } else if (picante == "no") {
                        barbacoa.setPicante(false);
                    }
                    System.out.println("La pizza se hará en el " + hornoA.getNombre());
                    break;
                case "CARBONARA":
                    System.out.println("Pizza: " + carbonara.getNombre());
                    System.out.println("Salsa: " + carbonara.getSalsa());
                    System.out.println("¿Algún extra? Introducelo:");
                    carbonara.setExtras(extras = sc.nextLine());
                    System.out.println("¿Quieres queso azul? (si o no)");
                    if (queso_azul == "si"){
                        carbonara.setQueso_azul(true);
                    } else if (queso_azul == "no"){
                        carbonara.setQueso_azul(false);
                    }
                    System.out.println("¿Quieres queso de cabra? (si o no)");
                    if (queso_cabra == "si"){
                        carbonara.setQueso_cabra(true);
                    } else if (queso_cabra == "no"){
                        carbonara.setQueso_cabra(false);
                    }
                    System.out.println("La pizza se hará en el " + hornoA.getNombre());
                    break;
                case "CAMPERA":
                    System.out.println("Pizza: " + campera.getNombre());
                    System.out.println("Salsa: " + campera.getSalsa());
                    System.out.println("¿Algún extra? Introducelo:");
                    campera.setExtras(extras = sc.nextLine());
                    System.out.println("¿Quieres carne? (si o no)");
                    if (carne == "si"){
                        campera.setCarne(true);
                    } else if (carne == "no"){
                        campera.setCarne(false);
                    }
                    break;
                case "PAGAR":
                    pagar = true;
                    break;
            }
        } while (!pagar);
    }
}