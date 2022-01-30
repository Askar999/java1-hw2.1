package com.company;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(isItImpossibleToWolk(generateRandomAge(), 20));
        System.out.println(isItImpossibleToWolk(generateRandomAge(), 29));
        System.out.println(isItImpossibleToWolk(generateRandomAge(), 10));
        System.out.println(isItImpossibleToWolk(generateRandomAge(), 30));
        System.out.println(isItImpossibleToWolk(generateRandomAge(), 15));
//        System.out.println(generateRandomAge());
    }

    public static String isItImpossibleToWolk(int age, int temp) {
        if (20 < age && age < 45 && -20 < temp && temp < 30) {
            return "Можно идти гулять(1)";
        } else if (age < 20 && 0 < temp && temp < 28) {
            return "Можно идти гулять(2)";
        } else if (45 < age && -10 < temp && temp < 25) {
            return "Можно идти гулять(3)";
        } else {
            return "Оставайтесь дома";
        }
    }
    public static int generateRandomAge(){
        Random random = new Random();
        return random.nextInt(120);
//        return new Random().nextInt(120);
    }
}

/*
      Random rand = new Random(); //instance of random class
      int upperbound = 25;
        //generate random values from 0-24
      int int_random = rand.nextInt(upperbound);
      double double_random=rand.nextDouble();
      float float_random=rand.nextFloat();
ДЗ на сообразительность:
● Написать метод в котором генерируется случайный возраст public static int
generateRandomAge(){........}
● При вызове метода, который формирует результат “можно ли идти гулять”
использовать генерирование случайного возраста с помощью метода
“generateRandomAge” test(23, 10); test(generateRandomAge(), 23);
*/