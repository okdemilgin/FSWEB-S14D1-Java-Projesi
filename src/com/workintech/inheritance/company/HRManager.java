package com.workintech.inheritance.company;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniors;
    private MidDeveloper[] mids;
    private SeniorDeveloper[] seniors;

    public HRManager(long id, String name, JuniorDeveloper[] juniors,
                     MidDeveloper[] mids, SeniorDeveloper[] seniors) {
        super(id, name);
        this.juniors = juniors;
        this.mids = mids;
        this.seniors = seniors;
    }

    public void addEmployee(int index, JuniorDeveloper developer) {
        try {
            //junior developerın id si varsa eklemesin yaz!
            if (juniors[index] == null) {
                juniors[index] = developer;
            } else {
                System.out.println("Index is full");
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index not found" + ex.getMessage());
        }
    }

    public void addEmployee(int index, MidDeveloper developer) {
        try {
            //junior developerın id si varsa eklemesin yaz!
            if (mids[index] == null) {
                mids[index] = developer;
            } else {
                System.out.println("Index is full");
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index not found" + ex.getMessage());
        }
    }

    public void addEmployee(int index, SeniorDeveloper developer) {
        try {
            //junior developerın id si varsa eklemesin yaz!
            if (seniors[index] == null) {
                seniors[index] = developer;
            } else {
                System.out.println("Index is full");
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index not found" + ex.getMessage());
        }
    }

    public JuniorDeveloper[] getJuniors() {
        return juniors;
    }

    public MidDeveloper[] getMids() {
        return mids;
    }

    public SeniorDeveloper[] getSeniors() {
        return seniors;
    }

    @Override
    public void work() {
        setSalary(60000);
        System.out.println(getName() + "HR Manager begins to work");
    }
}