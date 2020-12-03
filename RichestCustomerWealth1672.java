package leetcode;

public class RichestCustomerWealth1672 {

    public void RichestCustomerWealth1672() {
        int iMayor = 0;
        int accounts[][] = {{1, 2, 3}, {3, 2, 1}};
        for (int i = 0; i < accounts.length; i++) {
            int iSum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                iSum += accounts[i][j];
            }
            if (iSum > iMayor) {
                iMayor = iSum;
            }
        }
        System.out.println(iMayor);
    }
}
