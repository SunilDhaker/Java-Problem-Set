

import java.io.BufferedReader;
import java.io.InputStreamReader;


class TestClass {
    public static void main(String args[]) throws Exception {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int m = Integer.parseInt(line);
        int n, k;
        String readLine ;
        String[] tokens;

        for (int i = 0; i < m; i++) {

           readLine = br.readLine();
           tokens = readLine.split(" ");

             n = Integer.parseInt(tokens[0]);
             k = Integer.parseInt(tokens[1]);

            System.out.println(findMaxSum(br.readLine(), n, k));
        }

    }

    private static int findMaxSum(String s , int n ,int k ) {

        String tokens[] = s.split(" ");
        int input[] = new int[n];
        for(int i = 0 ; i < n ; i++){

            input[i] = Integer.parseInt(tokens[i]);
        }

        int max = 0  , tempMax , temp = 0;
        for(int i = 0 ; i < k ; i++){
           temp = 0;
            tempMax = 0 ;
            while(temp < n){

              if(input[temp] > 0)
                  tempMax = tempMax + input[temp];
              temp = tempMax + k + 1;
            }
            if(i == 0)
                max = tempMax ;
            if(max < tempMax)
                max = tempMax;
        }
        return  max ;
    }
}
