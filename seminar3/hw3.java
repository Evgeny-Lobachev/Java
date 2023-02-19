package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class hw3 {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<String>();

        colors.add("White");
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Purple");

        System.out.println("#1: " + colors);


        for (int i = 0; i < colors.size(); i++) {
            colors.set(i, colors.get(i) + "!");
        }
        System.out.println("#2: " + colors);


        colors.add(0, "Black");
        System.out.println("#3: " + colors);

        System.out.println("#4: " + colors.get(3));


        colors.set(3, "Pink");
        System.out.println("#5: " + colors);

        colors.remove(3);
        System.out.println("#6: " + colors);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название цвета на английском: ");
        String findColor = new String(scanner.nextLine());

        List<String> resElem = colors.stream()
                .filter(color -> color.contains(findColor))
                .collect(Collectors.toList());
        if (resElem.size() > 0) {
            System.out.println("#7: " + "Element: " + resElem);
        } else System.out.println("#7: " + "Такого элемента нет");

        List<String> newList = new ArrayList<>();
        newList.add("Black");
        newList.add("Purple!");
        newList.add("Grey");
        System.out.println("#8: " + newList);

        colors.removeAll(newList);
        System.out.println("#9: " + colors);


        Collections.sort(colors);
        System.out.println("#10: " + colors);

        int qtyRepeat = 10000;
        timer(qtyRepeat);

    }

    public static void timer(int qtyRepeat) {

        List<String> flowers1 = new ArrayList<>();
        flowers1.add("Aster");
        flowers1.add("Gerber");
        flowers1.add("Peony");

        long startTimer = System.currentTimeMillis();
        for (int i = 0; i <= qtyRepeat; i++) {
            flowers1.add(0, "Rose");
        }
        long stopTimer = System.currentTimeMillis();
        long time1 = stopTimer - startTimer;
        System.out.println("Время работы ArrayList: " + time1);


        List<String> flowers2 = new LinkedList<>();
        flowers2.add("Aster");
        flowers2.add("Gerber");
        flowers2.add("Peony");

        long startTimer2 = System.currentTimeMillis();
        for (int i = 0; i <= qtyRepeat; i++) {
            flowers1.add(0, "Rose");
        }
        long stopTimer2 = System.currentTimeMillis();
        long time2 = stopTimer2 - startTimer2;
        System.out.println("Время работы LinkedList: " + time2);

    }

}
