public class Task_3 implements Task_3_base {
    @Override
    public int subtask_1_for(int n1, int n2, int a, int b) {
        int k =0;
        int h = n2;
        if(n2<n1){
            n2=n1;
            n1=h;
        }
        for(int i = n1; i<=n2 ;i++) {
            if((i%a==0)&(i%b!=0)){
                k++;
            }
        }


        // подсчитать, сколько чисел, кратных a, но не кратных b,
        // находится между числами n1 и n2 включительно
        return k;
    }

    @Override
    public int subtask_2_for(int num) {

        int n = 0;
        int i = 0;
        while(n<num){
            i++;
            n=n+i;
        }
        return i;


        // Последовательность чисел строится следующим образом:
        // сначала идет одна единица,
        // потом две двойки,
        // потом три тройки,
        // ...
        // потом n раз число n
        // ...
        // Найти, какое число будет находиться в этой последовательности
        // на позиции num

    }

    @Override
    public int subtask_3_for(int num, int d, int cnt) {
        /*int k = 0;  //сумма
        int n=num;  // n-ный член
        */
        int k=0 ;
        if (cnt == 0) {
            k=num;
            return num;
        }
        else {
            return  k + subtask_3_for(num, d, (cnt-1)) * d + 1;
        }
        int s = (num+b)*cnt/2;




        // Дана последовательность
        // a(0) = num
        // a(n) = a(n - 1) * d + 1
        // Найти сумму первых cnt элементов последовательности

    }

    @Override
    public int subtask_4_for(int n) {
        int res =1;
        int s =0;
        for(int i =1; i<=n; i++){
            res = res * i;
            s=s+res;
        }

        /*int s=0;
        if(n<=1){
            return 1;
        }
        else{
            return s + n * subtask_4_for(n-1);
        }

         */
        // Вычислить сумму
        // S(n) = 1 + 1 * 2 + 1 * 2 * 3 + ... + n!
        // для заданного n
        // (n! - это n-факториал. Кто не знает - гуглите)
        return s;
    }
}
