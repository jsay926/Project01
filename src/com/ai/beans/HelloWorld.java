package com.ai.beans;


import java.util.ArrayList;
import java.util.List;

public class HelloWorld {

    /**
     * 主程序
     *
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("HelloWorld！");
        System.out.println("HelloWorld！");
        System.out.println("HelloWorld！");


        System.out.println("HelloWorld！");

        ICustomer customer = new CustomerImpl();

        customer.save();



        List list = new ArrayList();


    }

    public String getData() {

        return null;


    }

}
