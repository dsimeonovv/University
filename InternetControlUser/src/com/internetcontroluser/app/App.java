package com.internetcontroluser.app;

import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

import com.internetcontroluser.db.InternetControlDao;


public class App {
	public static void main(String[] args) throws SQLException {
		System.out.println("Hello user.. what would you like to see about users?");
		System.out.println("1. Change user plan.");
		System.out.println("2. See Monthly Traffic over limit 200.");
		System.out.println("3. Change user date to pay.");
		System.out.println("4. See users with plan you want..");
		System.out.println("Waiting for your choice...");
		for (int i = 0; i < 10; i++) {
			Scanner input = new Scanner(System.in);
			int n = input.nextInt();
			switch (n) {
				case 1:
					System.out.println("Plan:");
					String plan = input.next();
					System.out.println("Name: ");
					String name = input.next();
					InternetControlDao.updatePlan(plan, name);
					break;
				case 2:
					InternetControlDao.selectMonthlyTrafficOverLimit();
					break;
				case 3:
					System.out.println("New Date: ");
					String dateToPay = input.next();
					System.out.println("Name: ");
					String nameOther = input.next();
					InternetControlDao.updateDateToPay(dateToPay, nameOther);
					break;
				case 4:
					System.out.println("Plan:");
					String planOther = input.next();
					InternetControlDao.selectUsersWithPlan(planOther);
					break;
				default :
					System.out.println("Wrong choice try again..");
					break;
			}
		}
	}
}
