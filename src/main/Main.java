package main;

import operaciones.MenuOperaciones;
import registrarPersona.MenuRegistro;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenuMain menuMain = new MenuMain(new ArrayList<>(),new ArrayList<>(),new ArrayList<>(), new MenuRegistro(),new MenuOperaciones());
        menuMain.menu(scanner);
    }
}
