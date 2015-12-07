package com.mf.bourne;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Entrance {
    public static void main(String[] args) throws Exception {
//        System.out.println("111");
//
//        try {
//            fun();
//        } catch (CustomException e) {
//            e.printStackTrace();
//            System.out.println("333");
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("444");
//        }
//        System.out.println("222");

//        a:
//        for (int i = 0; i < 5; ++i) {
//            System.out.println("i=" + i);
//            for (int j = 0; j < 4; ++j) {
//                if (j == 2)
//                    continue a;
//                System.out.println("j=" + j);
//            }
//        }

//        int a = 1 << 10;
//        System.out.println("a:" + a);

//        System.out.println("b:" + 1452 / (1 << 8));
//        System.out.println("b:" + 1452 % (1 << 8));
//
//        int a = 3;
//
//        int b_size = 3 + a-- <= 0 ? 0 : 1;
//
//        System.out.println("b_size:" + b_size);
//
//        //序列化对象
//        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\objectFile.obj"));
//        Ser customer = new Ser();
//        customer.name = "mklop";
//        customer.age = 121;
//        out.writeObject("mnb");    //写入字面值常量
//        out.writeObject(new Date());    //写入匿名Date对象
//        out.writeObject(customer);    //写入customer对象
//        out.close();
//
//        //反序列化对象
//        ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\objectFile.obj"));
//        System.out.println("obj1 " + (String) in.readObject());    //读取字面值常量
//        System.out.println("obj2 " + (Date) in.readObject());    //读取匿名Date对象
//        Ser obj3 = (Ser) in.readObject();    //读取customer对象
//        System.out.println("obj3 " + obj3);
//        in.close();


        long a = 67887, b = 4567;

        float c = 456, d = 45;
        System.out.println(String.format("==%.2f", (b + 0.0f) / a));


//        try {
//            System.out.println("222");
////            throw new Exception("nn");
//        }catch (Exception e){
//            System.out.println("eee");
//        }finally {
//            System.out.println("ff");
//        }
//        System.out.println("11111");

//        System.out.println("ex=" + ex());
//
//        long current = 46;
//        long total = 67;
//        int r = (int) ((current + 0.0f) / total * 100);
//
//
//        System.out.println("r="+r);
//        En e1 = new En();
//        e1.a = 3;
//
//        En e2 = new En();
//        System.out.println("e2.a="+e2.a);

        KK k1 = new KK();
        k1.a = 4;
        KK k2 = new KK();
        k2.a = 7;
        KK k3 = new KK();
        k3.a = 3;
        KK k4 = new KK();
        k4.a = 8;

        List<KK> list = new ArrayList<>();
        list.add(k1);
        list.add(k2);
        list.add(k3);
        list.add(k4);

        for (KK k : list) {
            System.out.println("==" + k.a);
        }

        Collections.sort(list, new Comparator<KK>() {
            @Override
            public int compare(KK o1, KK o2) {
                if (o1.a > o2.a) return 1;
                else if (o1.a < o2.a) return -1;
                else return 0;
            }
        });
        System.out.println("===");
        for (KK k : list) {
            System.out.println("==" + k.a);
        }
    }

    public static class KK {
        int a;
    }

    public static class En {
        static int a = 0;
    }

    public static int ex() {
        try {
            System.out.println("222");
//            throw new Exception("nn");

//            return -1;
        } catch (Exception e) {
            System.out.println("eee");
        } finally {
            System.out.println("ff");
        }
        System.out.println("11111");
        return 0;
    }

    static class Ser implements Serializable {
        String name;
        int age;

        @Override
        public String toString() {
//            return super.toString();
            return name + age;
        }
    }

    public static void fun() throws CustomException {
        System.out.println("fun");
        throw new RuntimeException();
    }

    public static class CustomException extends Exception {
        public CustomException() {
            super("CustomException");
        }
    }
}
