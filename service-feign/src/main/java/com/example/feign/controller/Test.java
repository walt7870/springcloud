package com.example.feign.controller;

import java.io.*;
import java.util.Arrays;

public class Test implements Serializable {

    private static final long serialVersionUID = 1L;

    public static int staticVar = 5;

    public static void main(String[] args) {

        int[] a = {44,55,662,12,412,55,1,2,3,4,5};
        for (int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j]=tmp;
                }
            }
        }
        System.out.println(Arrays.toString(a));


//        try {
//            //初始时staticVar为5
//            ObjectOutputStream out = new ObjectOutputStream(
//                    new FileOutputStream("result.obj"));
//            out.writeObject(new Test());
//            out.close();
//
//            //序列化后修改为10
//            Test.staticVar = 10;
//
//            ObjectInputStream oin = new ObjectInputStream(new FileInputStream(
//                    "result.obj"));
//            Test t = (Test) oin.readObject();
//            oin.close();
//
//            //再读取，通过t.staticVar打印新的值
//            System.out.println(t.staticVar);
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
    }
}