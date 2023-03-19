package com.isa;

public class Main {
    public static void main(String[] args) {
        // tipe data di java:
        // integer ,byte ,short ,long ,float ,double ,char ,boolean

        // integer (satuan)
        int i = 10;
        System.out.println("====INTEGER====");
        System.out.println("Nilai integer i = " + i);
        System.out.println("Nilai max integer = " + Integer.MAX_VALUE);
        System.out.println("Nilai max integer = " + Integer.MIN_VALUE);
        System.out.println("besar integer = " + Integer.BYTES +("byte"));
        System.out.println("besar integer = " + Integer.SIZE + ("bit"));

        // byte (satuan)
        byte b = 10;
        System.out.println("====byte====");
        System.out.println("Nilai byte b = " + b);
        System.out.println("Nilai max byte = " + Byte.MAX_VALUE);
        System.out.println("Nilai max byte = " + Byte.MIN_VALUE);
        System.out.println("besar byte = " + Byte.BYTES + ("byte"));
        System.out.println("besar byte = " + Byte.SIZE + ("bit"));

        // short (satuan)
        short s = 10;
        System.out.println("====SHORT====");
        System.out.println("Nilai short s = " + s);
        System.out.println("Nilai max short = " + Short.MAX_VALUE);
        System.out.println("Nilai max short = " + Short.MIN_VALUE);
        System.out.println("besar short = " + Short.BYTES + ("byte"));
        System.out.println("besar short = " + Short.SIZE + ("bit"));

        // long (satuan)
        long l = 10l;
        System.out.println("====LONG====");
        System.out.println("Nilai long l = " + l);
        System.out.println("Nilai max long = " + Long.MAX_VALUE);
        System.out.println("Nilai max long = " + Long.MIN_VALUE);
        System.out.println("besar long = " + Long.BYTES + ("byte"));
        System.out.println("besar long = " + Long.SIZE + ("bit"));


        //double (koma, bilangan ril)
        double d = 10.5d;
        System.out.println("====DOUBLE====");
        System.out.println("Nilai double d = " + d);
        System.out.println("Nilai max double = " + Double.MAX_VALUE);
        System.out.println("Nilai max double = " + Double.MIN_VALUE);
        System.out.println("besar double = " + Double.BYTES + (" byte"));
        System.out.println("besar double = " + Double.SIZE + (" bit"));


        //char (berdasarkan ASCII)
        char c = 'c';
        System.out.println("====CHAR====");
        System.out.println("Nilai char c = " + c);
        System.out.println("Nilai max char= " + Character.MAX_VALUE);
        System.out.println("Nilai max char = " + Character.MIN_VALUE);
        System.out.println("besar char = " + Character.BYTES + (" byte"));
        System.out.println("besar char = " + Character.SIZE + (" bit"));


        //char (nilai true atau false)
        boolean val = false;
        System.out.println("===BOOLEAN====");
        System.out.println("Nilai boolean val= " + val);
        System.out.println("Nilai max = " + Boolean.TRUE);
        System.out.println("Nilai min = " + Boolean.FALSE);


    };
};
