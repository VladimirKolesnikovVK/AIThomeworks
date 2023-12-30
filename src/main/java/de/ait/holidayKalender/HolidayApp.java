package de.ait.holidayKalender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class HolidayApp {
    private static final Logger LOGGER = LoggerFactory.getLogger(HolidayApp.class);

    public static void main(String[] args) {
        HolidayCalendar holidayCalendar = new HolidayCalendar();
        HolidayUpdater holidayUpdater = new HolidayUpdater(holidayCalendar);
        HolidayNotifier holidayNotifier = new HolidayNotifier(holidayCalendar);

        holidayUpdater.start();
        holidayNotifier.start();

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1. Add Holiday");
            System.out.println("2. Remove Holiday");
            System.out.println("3. Display Holidays");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    //добавления праздника
                    break;
                case 2:
                    //удаления праздника
                    break;
                case 3:
                    holidayCalendar.displayHolidays();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                  LOGGER.error("Invalid choice");
            }
        }
    }
}
