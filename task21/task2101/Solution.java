package com.javarush.task.task21.task2101;

/* 
Определяем адрес сети
*/

public class Solution {
    public static void main(String[] args) {
        byte[] ip = new byte[]{(byte) 192, (byte) 168, 1, 2};
        byte[] mask = new byte[]{(byte) 255, (byte) 255, (byte) 254, 0};
        byte[] netAddress = getNetAddress(ip, mask);
        print(ip);          //11000000 10101000 00000001 00000010
        print(mask);        //11111111 11111111 11111110 00000000
        print(netAddress);  //11000000 10101000 00000000 00000000
        //System.out.println((~(byte)255 == 0));
        //System.out.println((byte)(256 + (byte)112));
        //System.out.println((byte)131);
    }

    public static byte[] getNetAddress(byte[] ip, byte[] mask) {
        int i = 0;
        byte[] result = new byte[4];
        for (i = 0; i < mask.length; i++) {
            result[i] = (byte) (ip[i] & mask[i]);
        }

        return result;
    }

    public static void print(byte[] bytes) {
        /*for (int i = 0; i < bytes.length; i++) {
            int t = 256 + bytes[i];
            int w = (t >= 256 ? (byte)(t) : t);
            if(i < (bytes.length-1))
                System.out.print(w + ".");
            else
                System.out.println(w);
        }*/
        String bits = "";
        for (int i = 0; i < bytes.length; i++) {
            bits = "";
            byte b = bytes[i];
            for (int j = 0; j < 8; j++) {
                bits += b%2;
                b /= 2;
                System.out.print(bits);
            }
            System.out.print(" ");
        }
        System.out.println("");
    }
}
