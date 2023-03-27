package com.mobileshop;

import java.util.Scanner;

public class MobileTest {
	static Scanner sc = new Scanner(System.in);
	static int mcount = 0;

	public static void addMobile(Mobile m) {
		System.out.println("enter a mobile type");
		m.setMtype(sc.next());
		System.out.println("enter a mobile price");
		m.setPrice(sc.nextFloat());
		System.out.println("enter a mobile brandname");
		m.setBrandname(sc.next());
	}

	public static void deleteMobile(Mobile m[], String mobiletype) {
		boolean flag = false;
		for (int i = 0; i < mcount; i++) {
			if (m[i].getMtype().equals(mobiletype)) {
				flag = true;
				System.out.println(m[i].getBrandname());
				for (int j = i; j < mcount - 1; j++) {
					m[j] = m[j + 1];
				}
				m[mcount - 1] = null;
				mcount = mcount - 1;
				System.out.println("mobile deleted Succesfully");
				break;
			}
		}
		if (!flag) {
			System.out.println("mobile not found");
		}
	}

	public static void updatePrice(Mobile m[], String bname) {
		boolean flag = false;
		for (int i = 0; i < mcount; i++) {
			if (m[i].getBrandname().equals(bname)) {
				flag = true;
				System.out.println(" mobile detail are");
				System.out.println(m[i]);
				System.out.println("enter a price");
				m[i].setPrice(sc.nextFloat());

				System.out.println("mobile price updated succesfully");

				break;

			}
		}
		if (!flag) {
			System.out.println("mobile not found");
		}
	}

	public static void viewMobileByBrand(Mobile m[], String bname) {

		boolean flag = false;
		for (int i = 0; i < mcount; i++) {

			if (m[i].getBrandname().equals(bname)) {
				flag = true;
				System.out.println("mobile details are");
				System.out.println(m[i]);
				break;
			}
		}
		if (!flag) {
			System.out.println("mobile not found");
		}

	}

	public static void allMobile(Mobile m[]) {
		System.out.println("----------------------------------------------------");
		System.out.println("mobile list");
		System.out.println("----------------------------------------------------");
		for (int i = 0; i < mcount; i++) {
			System.out.println(m[i]);
		}
	}

	public static void main(String[] args) {

		Mobile m1[] = new Mobile[3];
		int choice;
		String ch;

		do {
			System.out.println("           Welcome TO MobileShopee         ");
			System.out.println("1.Add a Mobile");
			System.out.println("2.Delete a mobile");
			System.out.println("3.Update price of mobile");
			System.out.println("4.View mobile by brand");
			System.out.println("5.View all Mobile");

			choice = sc.nextInt();

			switch (choice) {

			case 1:
				if (mcount < m1.length) {
					m1[mcount] = new Mobile();
					addMobile(m1[mcount]);
					mcount++;
				} else {
					System.out.println("no more moblie can be add");
				}
				break;

			case 2:
				System.out.println("enter a type of mobile to be deleted");
				String brandname = sc.next();
				deleteMobile(m1, brandname);
				break;

			case 3:
				System.out.println("eenter a brand name to update a price");
				String st = sc.next();
				updatePrice(m1, st);
				break;

			case 4:
				System.out.println("view Mobile by brandname");

				String bn = sc.next();
				viewMobileByBrand(m1, bn);
				break;

			case 5:
				allMobile(m1);
				break;

			}
			System.out.println("do you want to perform more operation(yes/no)");
			ch = sc.next();

		} while (ch.equalsIgnoreCase("yes"));
	}

}