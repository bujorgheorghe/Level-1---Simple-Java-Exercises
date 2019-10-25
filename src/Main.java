public class Main {

    public static void main(String[] args) {
        // 1.Create a loop that will print numbers from 1 to 10, except number 7
        for (int n = 1; n <= 10; N++) {
            if (n == 7) continue;
            System.out.println(N);
        }
        //2.Create An Array of integers from 1 to 5, Call an integer on array using index and print it.
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(a [2]);

        //3.Call index outside of the bound. Handle this exception printing “Outside of bound message.”
        try{
            int[] g = {1,2,3,4,5,6,7};
            System.out.println(g [118]);
        }catch (Exception e) {
            System.out.println("Outside of bound message!");
        }

    }
}
