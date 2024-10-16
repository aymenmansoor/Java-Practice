package com.mycompany.mavenproject2;
import java.util.Scanner;

class Computer {
    private String name;
    private String type;
    private String processor;
    private int ram; // in GB
    private int hardDisk; // in GB
    private String motherboard;
    private String opticalDrive;

    // Constructor
    public Computer(String name, String type, String processor, int ram, int hardDisk, String motherboard, String opticalDrive) {
        this.name = name;
        this.type = type;
        this.processor = processor;
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.motherboard = motherboard;
        this.opticalDrive = opticalDrive;
    }

    // Method to display computer detai/*ls
    public void displayDetails() {
        System.out.println("Computer Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Hard Disk: " + hardDisk + " GB");
        System.out.println("Motherboard: " + motherboard);
        System.out.println("Optical Drive: " + opticalDrive);
    }

    // Methods to update details
    public void updateName(String name) {
        this.name = name;
    }

    public void updateType(String type) {
        this.type = type;
    }

    public void updateProcessor(String processor) {
        this.processor = processor;
    }

    public void updateRam(int ram) {
        this.ram = ram;
    }

    public void updateHardDisk(int hardDisk) {
        this.hardDisk = hardDisk;
    }

    public void updateMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public void updateOpticalDrive(String opticalDrive) {
        this.opticalDrive = opticalDrive;
    }
}

public class Mavenproject2 {

    public static void main(String[] args) {
           try (Scanner scanner = new Scanner(System.in)) {
            // Collecting initial details
            System.out.println("Enter computer name: ");
            String name = scanner.nextLine();
            System.out.println("Enter computer type (e.g., Desktop, Laptop): ");
            String type = scanner.nextLine();
            System.out.println("Enter processor specification: ");
            String processor = scanner.nextLine();
            System.out.println("Enter RAM (in GB): ");
            int ram = scanner.nextInt();
            System.out.println("Enter Hard Disk size (in GB): ");
            int hardDisk = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.println("Enter motherboard details: ");
            String motherboard = scanner.nextLine();
            System.out.println("Enter optical drive type: ");
            String opticalDrive = scanner.nextLine();
            
            // Create Computer object
            Computer computer = new Computer(name, type, processor, ram, hardDisk, motherboard, opticalDrive);
            
            // Display initial details
            System.out.println("\nInitial Computer Details:");
            computer.displayDetails();
            
            // Option to update details
            String choice;
            do {
                System.out.println("\nDo you want to update any details? (yes/no): ");
                choice = scanner.nextLine().toLowerCase();
                
                if (choice.equals("yes")) {
                    System.out.println("What do you want to update?");
                    System.out.println("1. Name");
                    System.out.println("2. Type");
                    System.out.println("3. Processor");
                    System.out.println("4. RAM");
                    System.out.println("5. Hard Disk");
                    System.out.println("6. Motherboard");
                    System.out.println("7. Optical Drive");
                    System.out.print("Enter your choice (1-7): ");
                    int updateChoice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    
                    switch (updateChoice) {
                        case 1:
                            System.out.print("Enter new name: ");
                            computer.updateName(scanner.nextLine());
                            break;
                        case 2:
                            System.out.print("Enter new type: ");
                            computer.updateType(scanner.nextLine());
                            break;
                        case 3:
                            System.out.print("Enter new processor: ");
                            computer.updateProcessor(scanner.nextLine());
                            break;
                        case 4:
                            System.out.print("Enter new RAM (in GB): ");
                            computer.updateRam(scanner.nextInt());
                            break;
                        case 5:
                            System.out.print("Enter new Hard Disk size (in GB): ");
                            computer.updateHardDisk(scanner.nextInt());
                            break;
                        case 6:
                            System.out.print("Enter new motherboard details: ");
                            scanner.nextLine(); // Consume newline
                            computer.updateMotherboard(scanner.nextLine());
                            break;
                        case 7:
                            System.out.print("Enter new optical drive type: ");
                            computer.updateOpticalDrive(scanner.nextLine());
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                    
                    // Display updated details
                    System.out.println("\nUpdated Computer Details:");
                    computer.displayDetails();
                }
            } while (choice.equals("yes"));
        }
    }
}