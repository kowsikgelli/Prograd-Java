import java.util.Scanner;

public class Labs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] capacities = new int[3];
        for(int i=0;i<3;i++){
            capacities[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        boolean islabavailable = false;
        int min_difference = Integer.MAX_VALUE;
        int ans = 0;
        for(int i=0;i<3;i++){
            if(capacities[i] - n <min_difference && capacities[i]>=n){
                min_difference = capacities[i] - n;
                ans = i+1;
                islabavailable = true;
            }
        }
        if(islabavailable) System.out.println("Lab "+ans+" with capacity "+capacities[ans-1]+" is available");
        else System.out.println("Labs are not available");
    }
}
