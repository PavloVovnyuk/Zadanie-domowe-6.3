public class Calculate {
    double numbFrom = 0;
    double numbTo = 3;

    double calk() {
        while (numbFrom <= numbTo) {
            String formattedDouble = String.format ("%.1f", numbFrom);
            System.out.println (formattedDouble);
            numbFrom += 0.1;
        }
        return 0;
    }


    double calk2() {
        do {
            String formattedDouble = String.format ("%.1f", numbFrom);
            System.out.println (formattedDouble);
            numbFrom += 0.1;
        } while (numbFrom < numbTo);
        return 0;
    }
}