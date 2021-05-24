package trying;

public class HashFunction {

    private String name, city;
    private int zip;

    public HashFunction(String name, String city, int zip) {

        this.name = name;
        this.city = city;
        this.zip = zip;

    }

    public int hash(String str){

        int result = 1;
        String tempString = str;
        int sum = 0;
        char[] tempArr = tempString.toCharArray();
        int count = 1;
        if (tempString.length() % 2 == 0){
            for (int i = 0; i < tempArr.length/2; i++)
            {
                int tempSum = (int) tempArr[i] * (int) tempArr[tempArr.length - count];
                count++;
                sum += tempSum;
            }
        }
        else {
            for (int i = 0; i < tempArr.length; i++) {
                if (i == (tempArr.length) - 1) {
                    int tempSum = tempArr[i];
                }
                int tempSum = (int) tempArr[i] * (int) tempArr[tempArr.length - count];
                count++;
                sum += tempSum;
            }
        }
        result = 61 * sum;
        return result;

    }

    @Override
    public int hashCode() {

        final int prime = 61;
        int result = 0;

        result += hash(name);
        result += hash(city);
        result += prime * zip;

        return result;

    }

}
