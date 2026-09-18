// OperatorPenugasan

import java.util.Scanner;

public class Day17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah parfum Portals yang dimiliki: ");
        int parfumPortals = input.nextInt();

        parfumPortals += 2;
        System.out.println("Setelah membeli 2 parfum: " + parfumPortals);

        parfumPortals -= 1;
        System.out.println("Setelah dijual 1 parfum: " + parfumPortals);

        parfumPortals *= 2;
        System.out.println("Setelah koleksi digandakan: " + parfumPortals);

        parfumPortals /= 3;
        System.out.println("Setelah dibagi ke 3 rak: " + parfumPortals);

        parfumPortals %= 2;
        System.out.println("Sisa parfum setelah dibagi 2: " + parfumPortals);

        input.close();
    }
}
