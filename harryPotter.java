public class sort {
    public static void main(String[] args)

    {

       

       

     final int ASCII_SIZE = 256;



        int count[] = new int[ASCII_SIZE];

        String str = "harry potter in a magical island";

        int len = str.length();



        for (int i=0; i<len; i++)

            count[str.charAt(i)]++;

       

        int max = -1;  

        char result = ' ';  

        for (int j = 0; j < len; j++) {

            if (max < count[str.charAt(j)]) {

                max = count[str.charAt(j)];

                result = str.charAt(j);

            }

        }

        System.out.println("Max occurring character is " + result);

}
}
