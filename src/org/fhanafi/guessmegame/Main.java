package org.fhanafi.guessmegame;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Tebak-tebakan!");
        System.out.println("Siapa Nama Anda?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello "+ name);

        System.out.println("Kita Mulai?");
        System.out.println("\t1. Ya");
        System.out.println("\t2. Tidak");

        int beginAnswer = scanner.nextInt();

        while (beginAnswer !=1) {
            System.out.println("Kita Mulai?");
            System.out.println("\t1. Ya");
            System.out.println("\t2. Tidak");

            beginAnswer = scanner.nextInt();
        }

        Random random = new Random();
        int x = random.nextInt(20)+1;
        System.out.println("Coba tebak nomor apa: ");
        int userInput = scanner.nextInt();

        int timesTried = 0;
        boolean hasWon = false;
        boolean shouldFinish = false;

        while (!shouldFinish){
            timesTried++;

            if(timesTried < 5){
                if (userInput == x){
                    hasWon = true;
                    shouldFinish = true;
                }else if(userInput > x){
                    System.out.println("Ketinggian");
                    userInput = scanner.nextInt();
                }else {
                    System.out.println("Kerendahan");
                    userInput = scanner.nextInt();
                }
            }else {
                shouldFinish = true;
            }
        }

        if(hasWon){
            System.out.println("Selamat! kamu sudah menebak "+ timesTried+ " kali");
        }else {
            System.out.println("Coba Lagi!");
            System.out.println("Nomornya: " + x);
        }
    }
}
