package service;

import entities.Manager;
import entities.MarketingStaff;
import entities.Staff;
import utils.Utils;

import java.util.ArrayList;
import java.util.Scanner;

public class StaffService {
    Utils utils=new Utils();
    public void inputStaff(Scanner scanner,ArrayList<Staff> staffs) {
        System.out.println("Mời bạn nhập số nhân viên hành chính muốn thêm:");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++) {
            System.out.println("Mời bạn nhập họ tên:");
            String name = scanner.nextLine();
            System.out.println("Mời bạn nhập lương tháng (triệu):");
            double salary = utils.inputDouble(scanner);
            staffs.add(new Staff(name,salary));
        }
    }

    public void inputManager(Scanner scanner,ArrayList<Staff> staffs ){
        System.out.println("Mời bạn nhập số trưởng phòng muốn thêm:");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++) {
            System.out.println("Mời bạn nhập họ tên:");
            String name = scanner.nextLine();
            System.out.println("Mời bạn nhập lương tháng (triệu):");
            double salary = utils.inputDouble(scanner);
            System.out.println("Mời bạn nhập lương trách nhiệm (triệu):");
            double reponsibilitySalary = utils.inputDouble(scanner);
            salary+=reponsibilitySalary;
            staffs.add(new Manager(name,salary,reponsibilitySalary));
        }
    }
    public void inputMarketingStaff(Scanner scanner,ArrayList<Staff> staffs ){
        System.out.println("Mời bạn nhập số nhân viên tiếp thị muốn thêm:");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++) {
            System.out.println("Mời bạn nhập họ tên:");
            String name = scanner.nextLine();
            System.out.println("Mời bạn nhập lương tháng (triệu):");
            double salary = utils.inputDouble(scanner);
            System.out.println("Mời bạn nhập doanh số bán hàng (triệu):");
            double sales = utils.inputDouble(scanner);
            System.out.println("Mời bạn nhập tỉ lệ hoa hồng:");
            double commissionRate = utils.inputDouble(scanner);
            salary+=sales*commissionRate;
            staffs.add(new MarketingStaff(name,salary,sales,commissionRate));
        }
    }
    public void deleteStaff(Scanner scanner,ArrayList<Staff> staffs){
        System.out.println("Mời bạn nhập id:");
        int id=utils.inputInt(scanner);
        for (Staff staff:staffs) {
            if (id==staff.getId()){
                staffs.remove(staff);
            }
        }
    }
    public void findBySalary(Scanner scanner,ArrayList<Staff> staffs){
        System.out.println("Mời bạn nhập lương:");
        double salary=utils.inputDouble(scanner);
        for (Staff staff:staffs){
            if (salary==staff.getSalary()){
                System.out.println(staff);
            }
        }
    }
    public void calculateTax(ArrayList<Staff> staffs ){
        for (Staff staff:staffs){
            if (staff.getSalary()>=11){
                System.out.println("Nhân viên có id là "+staff.getId()+" phải đóng thuế là "+(staff.getSalary()*0.1));
            }else {
                System.out.println("Nhân viên có id là "+staff.getId()+" không phải đóng thuế");
            }
        }
    }

}
