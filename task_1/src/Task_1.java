import java.io.IOException;

public class Task_1 implements Task_1_base {
    @Override
    public int subtask_1_if(int first, int second, int third) {
        if(first < second) {
            if(first < third) {
                return first;
            }
        }
        if (second < first){
            if (second < third){
                return second;
            }
        }
        if (third < first){
            if (third < second){
                return third;
            }
        }
        return 0;
    }
    @Override
    public boolean subtask_2_if(int year) {
        if(year % 4 == 0){
            if (year % 400 == 0){
                return true;
            }
            else {
                return year % 100 != 0;
            }
        }


        return false; // Замените данный оператор кодом, решающим поставленную задачу.
    }
    @Override
    public int subtask_3_if(double x, double y, double left_up_x, double left_up_y, double width, double height) {

        if (width !=height )  {
            return 2;
        }
        else{
            if(Math.abs(x) - Math.abs(left_up_x ) <= 0.000001 ){
                if(Math.abs(x) - Math.abs(left_up_x + width) >= 0.000001 ){
                    if(Math.abs(y) - Math.abs(left_up_y) <= 0.000001 ) {
                        if (Math.abs(y) - Math.abs(left_up_y - height) >= 0.000001 ) {
                            return 1;
                        }
                    }
                }
            }
        }
        if (width==0)
            return 2;
        if (height==0)
            return 2;// Проверить, лежит ли точка с координатами (x, y) внутри невырожденного квадрата
            // со сторонами, параллельными осям координат, левый верхний угол которого имеет
            // координаты (left_up_x, left_up_y), ширина которого width, высота height.
            // Точка на границе считается не лежащей внутри.
            // В качестве результата вернуть:
            // 0 - не лежит
            // 1 - лежит
            // 2 - аргументы функции заданы некорректно
            // Допустимой погрешностью при сравнении переменных типа double считать 0.000001
            // ------------------------------------------------------------------------------------
            return 0; // Замените данный оператор кодом, решающим поставленную задачу.

    }
    @Override
    public int subtask_4_if(double x0, double y0, double k, double b) {
        if ((y0 > k * x0 + b) | (Math.abs(y0)- Math.abs(k * x0 + b)>0.000001)){
            return 0;
        }
        if ((y0 < k * x0 + b) | (Math.abs(y0)- Math.abs(k * x0 + b)>0.000001)){
            return 1;
        }
        if(Math.abs(y0)- Math.abs(k * x0 + b)<0.000001){
            return 2;
        }

        // Проверить, как расположена точка с координатами (x0, y0)
        // относительно прямой y = kx + b
        // В качестве результата вернуть:
        // 0 - лежит выше прямой
        // 1 - лежит ниже прямой
        // 2 - лежит на прямой
        // Допустимой погрешностью при сравнении переменных типа double считать 0.000001
        // ------------------------------------------------------------------------------------
        return 0; // Замените данный оператор кодом, решающим поставленную задачу.
    }
    @Override
    public String subtask_5_switch(int day_od_week) {
        if ((day_od_week < 1) | (day_od_week > 7)){
            return "Ошибка";
        }
        else{
            if(day_od_week==1){
                return "Понедельник";
            }
            if(day_od_week==2){
                return "Вторник";
            }
            if(day_od_week==3){
                return "Среда";
            }
            if(day_od_week==4){
                return "Четверг";
            }
            if(day_od_week==5){
                return "Пятница";
            }
            if(day_od_week==6){
                return "Суббота";
            }
            if(day_od_week==7){
                return "Воскресенье";
            }
        }
        // По номеру дня недели day_od_week вернуть его название на русском языке, записанное
        // с большой буквы. Дни едели отсчитываются с единицы. Если номер задан некорректно,
        // вернуть строку "Ошибка"
        // ------------------------------------------------------------------------------------
        return ""; // Замените данный оператор кодом, решающим поставленную задачу.
    }
    @Override
    public String subtask_6_switch(int direction) {
        if(direction==1){
            return "север";
        }
        if(direction==2){
            return "юг";
        }
        if(direction==3){
            return "запад";
        }
        if(direction==4){
            return "восток";
        }
        // По заданному направлению direction вернуть его название:
        // 1 - север
        // 2 - юг
        // 3 - запад
        // 4 - восток
        // Во всех остальных случаях вернуть пустую строку
        // ------------------------------------------------------------------------------------
        return ""; // Замените данный оператор кодом, решающим поставленную задачу.
    }
    @Override
    public int subtask_7_if(double vx, double vy, double vz, double speed, double time, double wall) {
        // Проверить, достигнет ли снаряд, летяший из точки (0, 0, 0)
        // в направлении (vx, vy, vz) со скоростью speed стены, параллельной плоскости OYZ,
        // имеющей координату x равной wall, за время time
        // 0 - не достигнет
        // 1 - достигнет
        // 2 - аргументы функции заданы некорректно
        // Допустимой погрешностью при сравнении переменных типа double считать 0.000001
        // ------------------------------------------------------------------------------------
        return 0; // Замените данный оператор кодом, решающим поставленную задачу.
    }
    @Override
    public int subtask_8_if(double k1, double b1, double k2, double b2) {
        // Проверить, как друг относительно друга располагаются прямые y = k1*x + b1 и
        // y = k2*x + b2. Вернуть
        // 1 - если параллельны
        // 2 - если пересекаются
        // 3 - если совпадают
        // Допустимой погрешностью при сравнении переменных типа double считать 0.000001
        // ------------------------------------------------------------------------------------
        return 0; // Замените данный оператор кодом, решающим поставленную задачу.
    }
}
