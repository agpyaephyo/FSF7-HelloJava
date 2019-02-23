package com.padcmyanmar.xyz.array_and_arraylist;

import java.util.ArrayList;

public class ArrayAndArrayList {

    public static void main(String[] args) {
        int age;
        int myAge = 27;

        int[] roleNumbers = new int[6];
        roleNumbers[0] = 56;
        roleNumbers[1] = 112;
        roleNumbers[2] = 34;
        roleNumbers[4] = 21;

        System.out.println("roleNumbers[3] : " + roleNumbers[3]);
        for (int i = 0; i < roleNumbers.length; i++) {
            System.out.println("roleNumber[" + i + "] : " + roleNumbers[i]);
        }

        ArrayList<String> myTeacherNames = new ArrayList<>();
        myTeacherNames.add("U Aung Ko");
        myTeacherNames.add("U Kyi Nyunt");
        myTeacherNames.add("Daw Nyo Nyo Thein");

        System.out.println("myTeacherNames [1] : " + myTeacherNames.get(1));
        for (String teacherName : myTeacherNames) {
            System.out.println(teacherName);
        }

        ArrayList<Integer> myExamMarks = new ArrayList<>();
        myExamMarks.add(24);
        myExamMarks.add(32);
        myExamMarks.add(37);
        myExamMarks.add(45);
        myExamMarks.add(56);
        myExamMarks.add(61);

        System.out.println("\nmyExamMarks");
        for (Integer examMark : myExamMarks) {
            System.out.println(examMark);
        }

        myExamMarks.set(2, 42);

        System.out.println("\nmyExamMarks");
        for (Integer examMark : myExamMarks) {
            System.out.println(examMark);
        }
    }
}
