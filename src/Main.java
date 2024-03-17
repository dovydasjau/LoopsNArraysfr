public class Main {
    public static void main(String[] args) {

        System.out.println("----------------1.------------------");

        for (int i = 0; i < 10; i++) {
            System.out.println("labas");
        }

        System.out.println("----------------2.------------------");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("----------------3.------------------");

        String[] plants = new String[10];

        plants[0] = "Šermukšnis";
        plants[1] = "Alyvmedis";
        plants[2] = "Žibutė";
        plants[3] = "Papartis";
        plants[4] = "Liepa";
        plants[5] = "Levanda";
        plants[6] = "Pienė";
        plants[7] = "Gluosnis";
        plants[8] = "Citrinmedis";
        plants[9] = "Našlaitė";

        System.out.println("----------------4.------------------");

        for (int i = 0; i < plants.length; i++) {
            System.out.println(plants[i]);
        }


        System.out.println("----------------5.------------------");

        for (int i = plants.length - 1; i >= 0; i--) {
            System.out.println(plants[i]);
        }

        System.out.println("----------------6.------------------");


        for (int i = 10; i <= 50; i += 2) {
            System.out.println(i);
        }

        System.out.println("----------------7.------------------");

        for (int i = 10; i <= 50; i += 2) {
            if ((i % 10) == 0) {
                continue;
            } else {
                System.out.println(i);
            }

        }

        System.out.println("----------------8.------------------");

        int counter = 0;

        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                counter++;
            }
        }
        System.out.println(counter);

        System.out.println("----------------9.------------------");

        int countwords = 0;
        for (String word : plants) {
            if (word.length() <= 5) {
                countwords++;
            }
        }

        System.out.println(countwords + " žodžiai trumpesni nei 5 simboliai");

        countwords = 0;
        for (String word : plants) {
            if (word.length() >= 7) {
                countwords++;
            }
        }

        System.out.println(countwords + " žodžiai ilgesni nei 7 simboliai");

        System.out.println("----------------10.------------------");

        countwords = 0;
        for (String word : plants) {
            if (word.length() >= 5 && word.length() <= 10) {
                countwords++;
            }
        }

        System.out.println(countwords + " žodžiai ilgesni nei 5 simboliai bet trumpesni nei 10");

        System.out.println("----------------11.------------------");

        int[] numberss = new int[300];
        counter = 0;

        for (int i = 0; i < numberss.length; i++) {
            numberss[i] = (int) (Math.random() * 300);
        }

        for (int i = 0; i < numberss.length; i++) {
            if (numberss[i] >= 275) {
                System.out.print("[" + numberss[i] + "], ");
            } else {
                System.out.print(numberss[i] + ", ");
            }
            if (numberss[i] > 150) {
                counter++;
            }
        }

        System.out.println("\nAmount of numbers >150: " + counter);

        System.out.println("----------------12.------------------");

        boolean first = true;

        for (int i = 0; i <= 3000; i++) {
            if (i % 77 == 0) {
                if (!first) {
                    System.out.print(", ");
                } else {
                    first = false;
                }
                System.out.print(i);
            }
        }

        System.out.println("----------------13.------------------");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("----------------14.------------------");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j || i == 5 - 1 - j) {
                    System.out.print('X' + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        System.out.println("----------------15.------------------");

        int HcountInRow = 0;
        int Hcount = 0;
        int Counter = 0;

        while (true) {
            int moneta = (int) (Math.random() * 2);

            if (moneta == 1) {
                System.out.println("S");
                Counter++;
                HcountInRow = 0;
            } else {
                System.out.println("H");
                Counter++;
                HcountInRow++;
                Hcount++;
            }

            if (moneta == 0) {
//                System.out.println("Iškrito herbas");
//                break;
            }
            if (HcountInRow == 3) {
                System.out.println("Iškrito 3 herbai iš eilės");
                System.out.println("Metimų kiekis: " + Counter);
                break;
            }
            if (Hcount == 3) {
//                System.out.println("Iškrito 3 herbai")
//                break;
            }

        }

        System.out.println("----------------16.------------------");

        int tKazys = 0;
        int tPetras = 0;
        String winner = "";

        while (true) {
            int Kazys = (int) (5 + Math.random() * 21);
            int Petras = (int) (10 + (Math.random()) * 11);

            tKazys += Kazys;
            tPetras += Petras;

            if (tKazys >= 222 && tKazys > tPetras) {
                winner = "Kazys";
                break;
            } else if (tPetras >= 222 && tPetras > tKazys) {
                winner = "Petras";
                break;
            } else if (tKazys >= 222 && tPetras >= 222 && tKazys == tPetras) {
                winner = "Lygiasios";
                break;
            }
        }

        System.out.println("Kazys: " + tKazys + ". Petras: " + tPetras + ". Partiją laimėjo: " + winner);

        System.out.println("----------------17.------------------");

//        int height = 21;
//
//        for (int i = 0; i < height; i++) {
//            for (int j = height - i; j > 0; j--) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < height; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        System.out.println("----------------18.------------------");

        System.out.println("Small Blows Simulation:");
        for (int i = 0; i < 5; i++) {
            int nailLength = 85;
            int hits = 0;
            int depth = 0;
            while (depth < nailLength) {
                int blow = (int) (Math.random() * 16) + 5; // 5-20 mm
                depth += blow;
                hits++;
            }
            System.out.println("Nail " + (i + 1) + ": " + hits + " hits");
        }

        System.out.println("\nBig Hits Simulation:");
        for (int i = 0; i < 5; i++) {
            int nailLength = 85;
            int hits = 0;
            int depth = 0;
            while (depth < nailLength) {
                int hit = (int) (Math.random() * 11) + 20; // 20-30 mm
                if (Math.random() < 0.5) { // 50% chance of missing
                    hits++;
                    continue;
                }
                depth += hit;
                hits++;
            }
            System.out.println("Nail " + (i + 1) + ": " + hits + " hits");
        }

        System.out.println("----------------19.------------------");

        // Generating a string consisting of 50 unique random numbers between 1 and 200
        StringBuilder randomNumbers = new StringBuilder();
        int[] numbers = new int[200];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 1;
        }

        for (int i = 0; i < 50; i++) {
            int num;
            do {
                num = (int) (Math.random() * 200) + 1;
            } while (numbers[num - 1] == 0); // Check if the number already exists
            numbers[num - 1] = 0; // Marking the number as used (cant repeat)
            randomNumbers.append(num).append(" ");
        }
        String randomNumbersString = randomNumbers.toString().trim();
        System.out.println("Random numbers: " + randomNumbersString);

        // Generating a second string containing only prime numbers from the first string
        StringBuilder primeNumbers = new StringBuilder();
        String[] numArray = randomNumbersString.split(" ");
        for (String num : numArray) {
            int n = Integer.parseInt(num);
            if (isPrime(n)) {
                primeNumbers.append(n).append(" ");
            }
        }

        // Sort the prime numbers in ascending order
        String[] primeArray = primeNumbers.toString().trim().split(" ");
        for (int i = 0; i < primeArray.length - 1; i++) {
            for (int j = i + 1; j < primeArray.length; j++) {
                if (Integer.parseInt(primeArray[i]) > Integer.parseInt(primeArray[j])) {
                    String temp = primeArray[i];
                    primeArray[i] = primeArray[j];
                    primeArray[j] = temp;
                }
            }
        }

        String primeNumbersString = String.join(" ", primeArray);
        System.out.println("Prime numbers: " + primeNumbersString);
    }

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    //checked with chatgpt (10 times) to make sure the output is correct.
}
