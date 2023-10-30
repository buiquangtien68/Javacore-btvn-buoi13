import entities.Staff;
import service.StaffService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Staff> staffs=new ArrayList<>();
        StaffService staffService=new StaffService();
        staffService.inputStaff(scanner,staffs);
        staffService.inputManager(scanner,staffs);
        staffService.inputMarketingStaff(scanner,staffs);
        staffService.deleteStaff(scanner,staffs);
        staffService.findBySalary(scanner,staffs);
        staffService.calculateTax(staffs);
        System.out.println(staffs);

    }
}
