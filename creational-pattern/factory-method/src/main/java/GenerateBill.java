import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {
    public static void main(String[] args) throws IOException {
        GetPlanFactory planFactory = new GetPlanFactory();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the name of plan for which the bill will be generated: ");
        String planName = bufferedReader.readLine();

        System.out.println("Enter the number of units for bill will be calculated:");
        int unites = Integer.parseInt(bufferedReader.readLine());

        Plan plan = planFactory.getPlan(planName);
        System.out.print("Bill amount for " + planName + " of " + unites + " units: ");
        plan.getRate();
        plan.calculateBill(unites);
    }
}
