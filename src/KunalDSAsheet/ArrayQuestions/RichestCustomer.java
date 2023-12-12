package KunalDSAsheet.ArrayQuestions;

public class RichestCustomer {
    public int maximumWealth(int[][] accounts) {
        int wealth =0;
        for(int i=0 ; i<accounts.length ; i++){
            int maxwealth=0;
            for(int j=0 ; j<accounts[0].length ; j++){
                maxwealth+=accounts[i][j];
            }
            if(wealth < maxwealth){
                wealth=maxwealth;
            }
        }
        return wealth;
    }
}
