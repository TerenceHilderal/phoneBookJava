package com.phoneBookJava.phonebook;

import java.util.Scanner;

public class PhoneBook {

	public static Scanner sc = null;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		String userLastName = getUserInput("Entrez un nom de famille: ");
		String userFirstName = getUserInput("Entrez un prénom: ");
		String userPhoneNumber = getUserInput("Entrez un numéro de téléphone: ");

		Contact newContact = new Contact(userLastName, userFirstName, userPhoneNumber);

		System.out.println(newContact.toString());

		sc.close();

	}

	public static String getUserInput(String userRequest) {

		System.out.println(userRequest);
		return sc.nextLine();
	}
}
