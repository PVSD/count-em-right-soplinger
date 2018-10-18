package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	Scanner kbInput = new Scanner(System.in);
	String twip, arra[];
	do {
        System.out.println("Type what you would like to be encrypted");
        twip = kbInput.nextLine();
        twip = twip + "X";
        twip = twip.toUpperCase();

        arra = twip.split("S\\s*A");
        if (twip.equals("EXITX"))
            break;

        System.out.println("There are " + (twip.length()-1 + " occurences."));
        System.out.println("");
    } while(1==1);

        System.out.println("Done");
    }


    }

