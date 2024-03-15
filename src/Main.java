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
            if ((i % 10) == 0)
            {
                continue;
            }else {
                System.out.println(i);
            }

        }

        System.out.println("----------------8.------------------");

        int counter = 0;

        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0){
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

        int[] numbers = new int[300];
        counter = 0;

        for (int i = 0; i < numbers.length; i++) {
             numbers[i] = (int) (Math.random() * 300);
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= 275){
                System.out.print("[" + numbers[i] + "], ");
            }else {
                System.out.print(numbers[i] + ", ");
            }
            if (numbers[i] > 150){
                counter++;
            }
        }

        System.out.println("\nAmount of numbers >150: " + counter);

        System.out.println("----------------12.------------------");

        boolean first = true;

        for (int i = 0; i <= 3000; i++) {
            if (i % 77 == 0){
                if (!first){
                    System.out.print(", ");
                } else {
                    first = false;
                }
                System.out.print(i);
            }
        }

        System.out.println("\n----------------13.------------------");

        for (int i = 0; i < 25; i++) {
            System.out.println("*");
            for (int j = 0; j < 25; j++) {
                System.out.print("*");
            }
        }


        
    }
}
