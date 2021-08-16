package Lesson5.Task1;

public class Main {
//    -- Задача 1 --
//Написать свой класс описывающий птиц
//Обязательные поля у объектов птицы:
//	-- Вид птицы (Ястреб, воробей, пингвин)
//	-- Вес
//Обязательное поля у класса птица:
//	-- Сумма веса всех птиц
//Обязательный метод у объекта птицы:
//	-- получить вес
//	-- получить вид птицы (вид птицы должен быть неизменяемый, после создания)
//	-- установить вес
//Обязательный метод у класса птица:
//	-- Вывести вес всех птиц на экран

    //При создании объекта класса птица, должна быть возможность указать:
//	-- Вид и вес птицы
//	-- вид птицы (вес дожен быть при этом проинициализирован по умолчанию в 0)

    public static void main(String[] args) {
//    Test
//        Birds bird = new Birds("Eagle");
        Birds bird1 = new Birds("Eagle", 25.25);
        Birds bird2 = new Birds("Eagle", 25.25);
        Birds bird3 = new Birds("Eagle", 1000);
        bird3.setWeight(25.25);
        Birds bird4 = new Birds("Eagle", 25.25);
        Birds bird5 = new Birds("Eagle");


//        System.out.println(bird.getWeight());
        System.out.println(Birds.getSumOfBirds());
    }
}
