package Chapter5;

public class AutoPolicyMain {
    public static void main(String[] args) {

        AutoPolicy policy1 = new AutoPolicy(5463528, "Toyota Camry","CT");
        AutoPolicy policy2 = new AutoPolicy(56453,"Benz",  "NY");
        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);
    }

    public static void policyInNoFaultState(AutoPolicy policy){
        System.out.println("THE AUTO POLICY: ");
        System.out.printf(
                "Account #: %d; Car: %s;%nState %s %s a no-fault state%n%n",
                policy.getAccountNumber(), policy.getMakeAndModel(),
                policy.getState(),
                (policy.IsNoFaultState() ? "is" : "is not"));
    }
}
