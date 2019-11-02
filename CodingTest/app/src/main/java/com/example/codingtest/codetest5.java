package com.example.codingtest;

public class codetest5 {

    public class Armstrong_Number {
        int power(int x, long y) {
            if (y == 0)
                return 1;
            if (y % 2 == 0)
                return power(x, y / 2) * power(x, y / 2);
            return x * power(x, y / 2) * power(x, y / 2);
        }

        int order(int x) {
            int n = 0;
            while (x != 0) {
                n++;
                x = x / 10;
            }
            return n;
        }

        boolean Is_Armstrong(int x) {
            int n = order(x);
            int temp = x, sum = 0;
            while (temp != 0) {
                int r = temp % 10;
                sum = sum + power(r, n);
                temp = temp / 10;
            }
            return (sum == x);
        }

        public void main(String[] args) {
            Armstrong_Number ob = new Armstrong_Number();
            int x = 370;
            System.out.println(ob.Is_Armstrong(x));
            x = 9312;
            System.out.println(ob.Is_Armstrong(x));
        }
    }
}
