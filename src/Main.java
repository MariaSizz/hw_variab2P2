public class Main {
    public static void main(String[] args) {
        int a = 32768;
        System.out.println("Значение переменной ¨a¨ с типом int равно "+ a +".");
        byte b = -128 ;
        System.out.println("Значение переменной ¨b¨ с типом byte равно "+ b +".");
        short c = 32767;
        System.out.println("Значение переменной ¨c¨ с типом short равно "+ c +".");
        long d = 21474836496799L;
        System.out.println("Значение переменной ¨d¨ с типом long равно "+ d +".");
        float e = 1.24f;
        System.out.println("Значение переменной ¨e¨ с типом float равно "+ e +".");
        double f = 0.13456789;
        System.out.println("Значение переменной ¨f¨ с типом double равно "+ f +".");
        System.out.println();

        float var1 = 27.12f;
        long var2 = 987678965549L;
        double var3 = 2.786;
        short var4 = 569;
        int var5 = -159;
        char var6 = 27897;
        byte var7 = 67;

        byte countStud_LP = 23;
        byte countStud_AS = 27;
        byte countStud_EA = 30;
        int totPaper = 480;
        int sheetEverySt = totPaper/(countStud_LP + countStud_AS + countStud_EA);
        System.out.println("На каждого ученика рассчитано "+ sheetEverySt +" листов бумаги.");
        System.out.println();

        byte perfMachPer2Min = 16;
        byte durOfWorkInMin = 20;
        int perfMachPerDur = (durOfWorkInMin / 2) * perfMachPer2Min;
        System.out.println("За " + durOfWorkInMin +" минут машина произвела "+ perfMachPerDur + " штук бутылок.");
        short durOfWorkInMin2 = 60 * 24;
        int perfMachPerDur2 = (durOfWorkInMin2 / 2) * perfMachPer2Min;
        System.out.println("За " + durOfWorkInMin2 +" минут машина произвела "+ perfMachPerDur2 + " штук бутылок.");
        short durOfWorkInMin3 = 60 * 24 * 3;
        int perfMachPerDur3 = (durOfWorkInMin3 / 2) * perfMachPer2Min;
        System.out.println("За " + durOfWorkInMin3 +" минут машина произвела "+ perfMachPerDur3 + " штук бутылок.");
        int durOfWorkInMin4 = 60 * 24 * 3 * 30;
        int perfMachPerDur4 = (durOfWorkInMin4 / 2) * perfMachPer2Min;
        System.out.println("За " + durOfWorkInMin4 +" минут машина произвела "+ perfMachPerDur4 + " штук бутылок.");
        System.out.println();

        byte cansOfPaints = 120;
        byte cansOfPaintsPerClassWh = 2;
        byte cansOfPaintsPerClassBr = 4;
        int countOfClasses = cansOfPaints / (cansOfPaintsPerClassWh + cansOfPaintsPerClassBr);
        int cansOfPaintsWh = countOfClasses * cansOfPaintsPerClassWh;
        int cansOfPaintsBr = countOfClasses * cansOfPaintsPerClassBr;
        System.out.println("В школе, где " + countOfClasses +" классов, нужно "+ cansOfPaintsWh + " банок белой краски и " + cansOfPaintsBr + " банок коричневой краски.");
        System.out.println();

        byte bananaWeightIn1 = 80;
        byte milkWeightIn100ml = 105;
        byte iceCreamSundaeWeightIn1 = 100;
        byte rawEggsWeightIn1 = 70;
        int breakfWeightInGr = bananaWeightIn1*5 + milkWeightIn100ml*2 + iceCreamSundaeWeightIn1*2 + rawEggsWeightIn1*4;
        float breakfWeightInKg = breakfWeightInGr / 1000f;
        System.out.println("Вес спортзавтрака " + breakfWeightInGr +" гр.. ");
        System.out.println("Вес спортзавтрака " + breakfWeightInKg +" кг.. ");
        System.out.println();

        short weightLoss1Per1DayInGr = 250;
        short weightLoss2Per1DayInGr = 500;
        short totalWeightLossInKg = 7;
        float daysOfWeightLoss1 = totalWeightLossInKg / (weightLoss1Per1DayInGr / 1000f);
        float daysOfWeightLoss2 = totalWeightLossInKg / (weightLoss2Per1DayInGr / 1000f);
        float daysOfWeightLossAvg = (daysOfWeightLoss1 + daysOfWeightLoss2) / 2f;
        System.out.println( daysOfWeightLoss1 + " дней уйдет на похудение, если спортсмен будет терять каждый день по " + weightLoss1Per1DayInGr + " грамм.");
        System.out.println( daysOfWeightLoss2 + " дней уйдет на похудение, если спортсмен будет терять каждый день по " + weightLoss2Per1DayInGr + " грамм.");
        System.out.println( "В среднем, " + daysOfWeightLossAvg + " дней уйдет на похудение, если спортсмен будет терять каждый день по " + weightLoss1Per1DayInGr + " или по " + weightLoss2Per1DayInGr + " грамм.");
        System.out.println();

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int newSalaryMasha = salaryMasha * 110 / 100;
        int annualGrowthSalaryM = (newSalaryMasha * 12) - salaryMasha * 12;
        int newSalaryDenis = salaryDenis * 110 / 100;
        int annualGrowthSalaryD = (newSalaryDenis * 12) - salaryDenis * 12;
        int newSalaryKristina = salaryKristina * 110 / 100;
        int annualGrowthSalaryK = (newSalaryKristina * 12) - salaryKristina * 12;
        System.out.println( newSalaryMasha + " будет получать Маша после повышения зарплаты на 10%. Годовой доход вырос на " + annualGrowthSalaryM + " рублей.");
        System.out.println( newSalaryDenis + " будет получать Денис после повышения зарплаты на 10%. Годовой доход вырос на " + annualGrowthSalaryD + " рублей.");
        System.out.println( newSalaryKristina + " будет получать Кристина после повышения зарплаты на 10%. Годовой доход вырос на " + annualGrowthSalaryK + " рублей.");










    }
}