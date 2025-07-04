// This code checks if teams can finish `N` tasks in `D` days, where each team works at different speeds.
// For example, if there’s 1 task and each team can do it alone in 5, 7, or 3 days, the total is 15 days.
// Since that’s less than 20 days, it prints “Yes 15”; otherwise, it shows how many extra days are needed.
class UserMainCode
{
    public static String developmentSprint(int input1, int input2, int input3, int input4, int input5, int input6) {
        int N = input1;
        int n1 = input2;
        int n2 = input3;
        int n3 = input4;
        int d1 = input5;
        int D = input6;
        int t1 = d1;
        int t2 = d1 + 2;
        int t3 = d1 - 2;
        int days1 = N / n1 * t1;
        int days2 = N / n2 * t2;
        int days3 = N / n3 * t3;
        int totalDays = days1 + days2 + days3;
        if (totalDays < D) {
            return "Yes " + totalDays;
        } else {
            return "No " + (totalDays - D);
        }
    }
    public static void main(String[] args) {
        System.out.println(developmentSprint(1, 1, 1, 1, 5, 20));
    }
}