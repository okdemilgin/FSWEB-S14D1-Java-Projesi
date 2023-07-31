package com.workintech.inheritance.main;

import com.workintech.inheritance.company.*;

import java.util.Arrays;

public class CompanyMain {

    public static void main(String[] args) {
        Employee asci = new Employee(6,"Rıza", 11500);
        asci.work();

        JuniorDeveloper juniorDeveloper1 = new JuniorDeveloper(2,"Aslı");
        juniorDeveloper1.work();
        JuniorDeveloper juniorDeveloper2 = new JuniorDeveloper(3,"Suzan");
        juniorDeveloper2.work();

        MidDeveloper midDeveloper1 = new MidDeveloper(3,"Ahmet");
        MidDeveloper midDeveloper2 = new MidDeveloper(4,"Sezgi");
        midDeveloper2.work();

        SeniorDeveloper seniorDeveloper = new SeniorDeveloper(5,"Arzu");
        seniorDeveloper.work();

        HRManager hrManager = new HRManager(1,"Ilgın",
            new JuniorDeveloper[3], new MidDeveloper[2], new SeniorDeveloper[1]);
        hrManager.work();
        System.out.println("Senior salary" + seniorDeveloper.getSalary());
        System.out.println("HR Manager salary" + hrManager.getSalary());

        System.out.println("Juniors" + Arrays.toString(hrManager.getJuniors()));
        System.out.println("Juniors" + Arrays.toString(hrManager.getMids()));
        System.out.println("Juniors" + Arrays.toString(hrManager.getSeniors()));

        hrManager.addEmployee(0,juniorDeveloper1);
        hrManager.addEmployee(0,midDeveloper1);
        hrManager.addEmployee(0,seniorDeveloper);
    }
}
