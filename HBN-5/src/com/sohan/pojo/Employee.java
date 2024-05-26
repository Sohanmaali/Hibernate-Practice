package com.sohan.pojo;

/*
 * @author Sohan_Maali
 */
public class Employee {

    private int id;
    private String name;
    private String father;

    public Employee( String name, String father) {

        this.name = name;
        this.father = father;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    @Override
    public String toString() {
        return "Employee{" + " id = " + id + ", name = " + name + ", father = " + father + '}';
    }
    
}
