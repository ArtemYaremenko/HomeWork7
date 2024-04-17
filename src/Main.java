public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1");
        int amountOfSavings = 0;
        int dreamMoney = 2_459_000;
        int deposit = 15_000;
        float interestOnDeposit = 0.01f; // ставка 1% в месяц на остаток
        int monthNumber = 0;

        while (amountOfSavings <= dreamMoney) {
            amountOfSavings += deposit;
            amountOfSavings += (int)(amountOfSavings * interestOnDeposit);
            monthNumber++;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей.\n", monthNumber, amountOfSavings);
        }

        //Task 2
        System.out.println("\nTask 2");
        int number = 1;
        while (number <= 10) {
            System.out.printf("%d ", number);
            if (number < 10) {
                number++;
            }
            else {
                System.out.println();
                break;
            }
        }
        for (; number > 0; number--) {
            System.out.printf("%d ", number);
        }

        //Task 3
        System.out.println("\n\nTask 3");
        int populationOfCountry = 12_000_000;
        float birthRatePerThousand = 0.017f;
        float deathRatePerThousand = 0.008f;
        int year = 0;
        for (; year <= 10; year++) {
            populationOfCountry += (int) ((populationOfCountry * birthRatePerThousand) - (populationOfCountry * deathRatePerThousand));
            System.out.printf("Год %d, численность населения составляет %d.\n", year, populationOfCountry);
        }

        //Task 4
        System.out.println("\nTask 4");
        int vasyaDeposit = 15000;
        int vasyaDreamCash = 12_000_000;
        int numberMonth = 0;
        float interestOfVasyaDeposit = 0.07f;
        while (vasyaDeposit <= vasyaDreamCash) {
            vasyaDeposit += (int)(vasyaDeposit * interestOfVasyaDeposit);
            numberMonth++;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей.\n", numberMonth, vasyaDeposit);
        }

        //Task 5
        System.out.println("\nTask 5");
        int vasyaDepositNew = 15000;
        int vasyaDreamCashNew = 12_000_000;
        int numberMonthNew = 0;
        float interestOfVasyaDepositNew = 0.07f;
        while (vasyaDepositNew <= vasyaDreamCashNew) {
            vasyaDepositNew += (int)(vasyaDepositNew * interestOfVasyaDepositNew);
            numberMonthNew++;
            if (numberMonthNew % 6 == 0){
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей.\n", numberMonthNew, vasyaDepositNew);
            }
        }

        //Task 6
        System.out.println("\nTask 6");
        int vasyaDepositNine = 15000;
        int numberMonthNine = 1;
        float interestOfVasyaDepositNine = 0.07f;
        for (; numberMonthNine <= 12 * 9; numberMonthNine++) {
            vasyaDepositNine += (int)(vasyaDepositNine * interestOfVasyaDepositNine);
            if (numberMonthNine % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %d рублей.\n", numberMonthNine, vasyaDepositNine);
            }
        }

        //Task 7
        System.out.println("\nTask 7");
        int friday = 5;
        int month = 31;
        while (friday <= month) {
            System.out.printf("Сегодня пятница, %dе число. Необходимо подготовить отчет.\n", friday);
            friday += 7;
        }

        //Task 8
        System.out.println("\nTask 8");
        int ourYear = 2024;
        int startYear = ourYear - 200;
        int endYear = ourYear + 100;
        int cometReturnPeriod = 79;
        for (int i = startYear; i <= endYear; i++) {
            if (i % cometReturnPeriod == 0) {
                System.out.println(i);
            }
        }
    }
}
