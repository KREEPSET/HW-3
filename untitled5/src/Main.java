public class Main {

    public static void main(String[] args) {

        System.out.println("Задание 1");
        int i = 1;
        System.out.println("Значение переменной i с типом int равно " + i);
        byte b = 2;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short s = 3;
        System.out.println("Значение переменной s с типом short равно " + s);
        long l = 4;
        System.out.println("Значение переменной l с типом long равно " + l);
        float f = 0.1f;
        System.out.println("Значение переменной f с типом float равно " + f);
        double d = 2.2;
        System.out.println("Значение переменной d с типом double равно " + d);
        System.out.println();


        byte byteOne = 67;
        short shortOne = -159;
        int intOne = 569;
        long longOne = 987878965549L;
        double doubleOne = 2.786;
        double doubleTwo = 27.12;
        short shortTwo = 27897;
        System.out.println();

        System.out.println("Задание 3");
        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short totalPaper = 480;
        int overClass = ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        int paperEach = (totalPaper / overClass);
        System.out.println("На каждого ученика рассчитано " + paperEach + " листов бумаги ");
        System.out.println();

        System.out.println("Задание 4");
        byte speedMash = 16;
        byte timeOne = 20;
        short timeTwo = 1440;
        short timeThree = 4320;
        int timeFour = 43200;
        int speedMin = speedMash / 2;
        int end1 = timeOne * speedMin;
        System.out.println("За " + timeOne + " минут " + "машина произвела " + end1 + "штук бутылок ");
        int end2 = timeTwo * speedMin;
        System.out.println("За " + timeTwo + " минут " + "машина произвела " + end2 + "штук бутылок ");
        int end3 = timeThree * speedMin;
        System.out.println("За " + timeThree + " минут " + "машина произвела " + end3 + "штук бутылок ");
        int end4 = timeFour * speedMin;
        System.out.println("За " + timeFour + " минут " + "машина произвела " + end4 + "штук бутылок ");
        System.out.println();

        System.out.println("Задание 5");
        byte paints = 120;
        byte whiteColorsPerRoom = 2;
        byte brownColorPerRoom = 4;
        int allRooms = paints / (whiteColorsPerRoom + brownColorPerRoom);
        int whiteColors = allRooms * whiteColorsPerRoom;
        int brownColors = allRooms * brownColorPerRoom;
        System.out.println("В школе, где " + allRooms + " классов, нужно " + whiteColors + " банок белой краски и " + brownColors + " банок коричневой краски ");
        System.out.println();

        System.out.println("Задание 6");
        short banana = 5 * 80;
        float milk = 200 * 105;
        short iceCream = 2 * 100;
        short eggs = 4 * 70;
        float mixed = banana + milk + iceCream + eggs;
        double kgWeight = mixed / 1000.0;
        System.out.println("Вес такого спортзавтрака в кг - " + kgWeight);
        System.out.println();

        System.out.println("Задание 7");
        byte targetKg = 7;
        short min = 250;
        short max = 500;
        int targetGramm = targetKg * 1000;
        int ifMin = targetGramm / min;
        int ifMax = targetGramm / max;
        int daysAverage = (ifMin + ifMax) / 2;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм - " + ifMin);
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм - " + ifMax);
        System.out.println();

        System.out.println("Задание 8");
        int Masha = 67760;
        int Denis = 83690;
        int Kristina = 76230;
        int MashaUp = Masha / 100 * 10;
        int DenisUp = Denis / 100 * 10;
        int KristinaUp = Kristina / 100 * 10;
        int MashaNew = Masha + MashaUp;
        int DenisNew = Denis + DenisUp;
        int KristinaNew = Kristina + KristinaUp;
        int MashaYearUp = MashaUp * 12;
        int DenisYearUp = DenisUp * 12;
        int KristinaYearUp = KristinaUp * 12;
        System.out.println("Маша теперь получает " + MashaNew + " рублей. Годовой доход вырос на " + MashaYearUp + " рублей ");
        System.out.println("Денис теперь получает " + DenisNew + " рублей. Годовой доход вырос на " + DenisYearUp + " рублей ");
        System.out.println("Кристина теперь получает " + KristinaNew + " рублей. Годовой доход вырос на " + KristinaYearUp + " рублей ");


    }
}