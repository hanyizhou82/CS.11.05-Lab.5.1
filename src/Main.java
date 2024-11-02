public class Main {

    /**
     * Mean Methods
     */

    public static int meanHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        int total = 0;
        for(int i = 0; i<householdEstimatesTonnesPerYear.length;i++){
            total += householdEstimatesTonnesPerYear[i];
        }
        return total/householdEstimatesTonnesPerYear.length + 1;
    }

    /**
     * Misc Methods
     */

    public static int getCountryTotalWastePerYear(String country, String[] countries, int[] totalWasteKgPerCapitaPerYear)
    {
        int indexOfCountry = 0;
        for(int i = 0; i < countries.length; i++){
            if(countries[i].equals(country)){
                indexOfCountry = i;
                break;
            }
        }
        return totalWasteKgPerCapitaPerYear[indexOfCountry];
    }

    public static String getCountryWithMostWastePerCapita(String[] countries, int[] totalWasteKgPerCapitaPerYear)
    {
        int max = 0;
        int index = 0;
        for(int i = 0; i<totalWasteKgPerCapitaPerYear.length; i++){
            if (totalWasteKgPerCapitaPerYear[i] > max){
                index = i;
                max = totalWasteKgPerCapitaPerYear[i];
            }
        }
        return countries[index];
    }

    public static String[] getCountriesWithHighestPovertyPercentage(String[] countries, double[] percentagesShareInPoverty)
    {
        double highestPoverty = 0;
        int count = 0;

        for (double percentage : percentagesShareInPoverty) {
            if (percentage > highestPoverty) {
                highestPoverty = percentage;
            }
        }

        for (double percentage : percentagesShareInPoverty) {
            if (percentage == highestPoverty) {
                count++;
            }
        }

        String[] result = new String[count];
        int indexOf = 0;

        for (int i = 0; i < percentagesShareInPoverty.length; i++) {
            if (percentagesShareInPoverty[i] == highestPoverty) {
                result[indexOf] = countries[i];
                indexOf++;
            }

        }
        return result;
    }

    public static String[] getCountriesWithHighConfidence(String[] countries, String[] confidences)
    {
        int count = 0;

        for (int i = 0; i < confidences.length; i++){
            if (confidences[i].equals("High Confidence")){
                count++;
            }
        }

        String[] highConCountries = new String[count];
        int indexOf = 0;
        for (int i = 0; i< confidences.length; i++){
            if(confidences[i].equals("High Confidence")){
                highConCountries[indexOf]=countries[i];
                indexOf++;
            }
        }

        return highConCountries;
    }
}