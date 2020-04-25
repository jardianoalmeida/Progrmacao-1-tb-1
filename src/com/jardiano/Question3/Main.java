package com.jardiano.Question3;

import com.jardiano.Question3.model.Edificio;
import com.jardiano.Question3.model.Porta;
import com.jardiano.Question3.model.Casa;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Porta porta1, porta2, porta3, porta4, porta5, porta6;

            // Door class test

            System.out.println("\n");
            System.out.println("Door class test");

            System.out.print("Door color: ");
            String color = sc.nextLine();
            System.out.print("dimension x: ");
            Double x = sc.nextDouble();
            System.out.print("dimension y: ");
            Double y = sc.nextDouble();
            System.out.print("dimension z: ");
            Double z = sc.nextDouble();

            porta1 = new Porta(false, color, x, y, z);
            porta1.handleOpen();

            System.out.println("New colors: ");
            porta1.changeColor("green");
            System.out.println(porta1);
            porta1.changeColor("black");
            System.out.println(porta1);
            porta1.changeColor("gray");
            System.out.println(porta1);

            porta1.handleClose();

            System.out.println("New dimensios: ");
            System.out.print("dimension x: ");
            porta1.setDimensionX(sc.nextDouble());
            System.out.print("dimension y: ");
            porta1.setDimensionY(sc.nextDouble());
            System.out.print("dimension z: ");
            porta1.setDimensionZ(sc.nextDouble());
            System.out.println(porta1);

            System.out.println("Open door: " + porta1.isOpened());

            porta1 = null;

            // House class test
            sc.nextLine();
            System.out.println("\n");
            System.out.println("House class test");

            System.out.print("House color: ");
            String houseColor = sc.nextLine();

            System.out.print("Door1 color: ");
            color = sc.nextLine();
            System.out.print("dimension x: ");
            x = sc.nextDouble();
            System.out.print("dimension y: ");
            y = sc.nextDouble();
            System.out.print("dimension z: ");
            z = sc.nextDouble();

            porta1 = new Porta(false, color, x, y, z);
            porta1.handleOpen();
            sc.nextLine();
            System.out.print("Door2 color: ");
            color = sc.nextLine();
            System.out.print("dimension x: ");
            x = sc.nextDouble();
            System.out.print("dimension y: ");
            y = sc.nextDouble();
            System.out.print("dimension z: ");
            z = sc.nextDouble();

            porta2 = new Porta(false, color, x, y, z);
            porta2.handleClose();

            sc.nextLine();
            System.out.print("Door3 color: ");
            color = sc.nextLine();
            System.out.print("dimension x: ");
            x = sc.nextDouble();
            System.out.print("dimension y: ");
            y = sc.nextDouble();
            System.out.print("dimension z: ");
            z = sc.nextDouble();

            porta3 = new Porta(false, color, x, y, z);
            porta3.handleOpen();

            Casa casa = new Casa(houseColor, porta1, porta2, porta3);

            System.out.println("Number of open doors: " + casa.balanceDoorOpened());
            porta1 = null;
            porta2 = null;
            porta3 = null;

            // Building class test
            sc.nextLine();
            System.out.println("\n");
            System.out.println("Building class test");

            System.out.print("Buiding color: ");
            String buildingColor = sc.nextLine();

            Edificio edificio = new Edificio(buildingColor, 0, 0);

            System.out.print("Door1 color: ");
            color = sc.nextLine();
            System.out.print("dimension x: ");
            x = sc.nextDouble();
            System.out.print("dimension y: ");
            y = sc.nextDouble();
            System.out.print("dimension z: ");
            z = sc.nextDouble();

            porta1 = new Porta(false, color, x, y, z);
            porta1.handleOpen();

            sc.nextLine();
            System.out.print("Door2 color: ");
            color = sc.nextLine();
            System.out.print("dimension x: ");
            x = sc.nextDouble();
            System.out.print("dimension y: ");
            y = sc.nextDouble();
            System.out.print("dimension z: ");
            z = sc.nextDouble();

            porta2 = new Porta(false, color, x, y, z);
            porta2.handleClose();

            sc.nextLine();
            System.out.print("Door3 color: ");
            color = sc.nextLine();
            System.out.print("dimension x: ");
            x = sc.nextDouble();
            System.out.print("dimension y: ");
            y = sc.nextDouble();
            System.out.print("dimension z: ");
            z = sc.nextDouble();

            porta3 = new Porta(false, color, x, y, z);
            porta3.handleOpen();

            sc.nextLine();
            System.out.print("Door4 color: ");
            color = sc.nextLine();
            System.out.print("dimension x: ");
            x = sc.nextDouble();
            System.out.print("dimension y: ");
            y = sc.nextDouble();
            System.out.print("dimension z: ");
            z = sc.nextDouble();

            porta4 = new Porta(false, color, x, y, z);
            porta4.handleClose();

            sc.nextLine();
            System.out.print("Door5 color: ");
            color = sc.nextLine();
            System.out.print("dimension x: ");
            x = sc.nextDouble();
            System.out.print("dimension y: ");
            y = sc.nextDouble();
            System.out.print("dimension z: ");
            z = sc.nextDouble();

            porta5 = new Porta(false, color, x, y, z);
            porta5.handleOpen();

            sc.nextLine();
            System.out.print("Door6 color: ");
            color = sc.nextLine();
            System.out.print("dimension x: ");
            x = sc.nextDouble();
            System.out.print("dimension y: ");
            y = sc.nextDouble();
            System.out.print("dimension z: ");
            z = sc.nextDouble();

            porta6 = new Porta(false, color, x, y, z);
            porta6.handleClose();

            edificio.addDoor(porta1);
            edificio.addDoor(porta2);
            edificio.addDoor(porta3);
            edificio.addDoor(porta4);
            edificio.addDoor(porta5);
            edificio.addDoor(porta6);

            System.out.println("Number of open doors: " + edificio.balanceDoorOpened());
            System.out.println("Number of doors: " + edificio.balanceDoors());

            System.out.print("How many floors do you want to add? ");
            edificio.addFloor(sc.nextInt());

            System.out.println("Total floors: " + edificio.balanceFloors());

            sc.close();
        }
    }