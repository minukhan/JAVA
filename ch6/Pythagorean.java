package chapter06;

public class Pythagorean {

    public static void main(String[] args) {

        int a=1,b=1,c=1;

        int squarea=0;
        int squareb=0;
        int squarec=0;
        int count = 0;

        while(a<100){
            b=1;
            c=1;
            while(b<100){
                c = 1;

                while(c<100){

                    squarea = a*a;
                    squareb = b*b;
                    squarec = c*c;

                    if(squarea+squareb==squarec){
                        System.out.println("a = " + a + " b = " + b + " c = " + c);
                        count++;
                    }

                    c++;
                }

                b++;
            }

            a++;
        }
        System.out.println(count);
        System.out.println("2019250059 한민욱");
    }

}
