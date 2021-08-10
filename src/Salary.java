import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] daily_hours = new int[7];
        int total_hours = 0;
        double salary = 0;
        for(int i=0;i<daily_hours.length;i++){
            daily_hours[i] = sc.nextInt();
            total_hours += daily_hours[i];
        }
        for(int i=0;i<daily_hours.length;i++){
            salary = salary+daily_hours[i]*100;
            if(daily_hours[i]-8>0) salary = salary+(daily_hours[i]-8)*15;
            if(i==0) salary = salary+(daily_hours[i]*100*0.5);
            if(i==6) salary = salary+(daily_hours[i]*100*0.25);
        }
        if(total_hours>40) salary=salary+(total_hours-40)*25;
        System.out.println(salary);
    }
}
