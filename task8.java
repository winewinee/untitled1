package lesson5;
//Для заданных функций найдите их максимальное значение и
//x, при котором оно достигается, на указанных интервалах с
//шагом 0.01 с использованием цикла/циклов for:


//8) e^x на интервале [-10, 10] Math.exp(x-2)
public class task8 {
    public static void main(String[] args) {
        double max = 0;
        double e = Math.E;
        double function = Math.pow(e, max);

        for (double x = 0; x <= 10 ; x += 0.01) {
            function = Math.pow(e, x);

            if (function > Math.pow(e, max)) {
                max = x;
                function = Math.pow(e, x);

            }
        }
        System.out.println(max);
        System.out.println(function);
    }
}
