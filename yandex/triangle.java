import java.util.*;

/*

Author: stanislove777

Задача: B

Даны три натуральных числа. Возможно ли построить треугольник с такими сторонами. 
Если это возможно, выведите строку YES, иначе выведите строку NO.
Треугольник — это три точки, не лежащие на одной прямой.

Вводятся три натуральных числа. 

Выведите ответ на задачу. 

*/

class Triangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ((a + b) > c && (a + c) > b && (c + b) > a){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}