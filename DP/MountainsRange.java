package DP;

public class MountainsRange {
    

    public static int mountainRang(int n){
        int dp[] = new int[n+1];

        dp[0] =1;
        dp[1] = 1;

        for(int i=2 ; i<n+1; i++){
            // n Pairs -> mountains rangees => Ci
            for(int j=0; j<i; j++){

                int inside = dp[j];
                int outside = dp[i-j-1]; 
                dp[i] += inside * outside; //Ci = Ci-j-1

            }
        }
        // n Pairs 
        return dp[n];
    }
    

    public static void main(String[] args) {
        int n=4; //14

        System.out.println(mountainRang(n));

    }
}
