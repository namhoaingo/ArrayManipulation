import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();


        List<Operation> operations = new ArrayList<Operation>() ;

        for (int a0 = 0; a0 < m; a0++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();
            System.out.println(a0);
            //operations.add(new Operation(a, b, k));

        }
        in.close();

        Calculate(n, operations);
    }

    public static void Calculate(int n, List<Operation> operations){
        double max = 0.0;
        int index = 1;
        while(n >= 1){
            double total = 0;
            for (Operation operation: operations){
                if(operation.ContainIndex(index)){
                    total = total + operation.get_addition();
                }
            }
            if(total > max){
                max = total;
            }
            n--;
        }

        System.out.printf("%.0f\n", max);
    }
}
    class Operation{
        private int _startIndex;
        private int _endIndex;
        private int _addition;
        public Operation(int startIndex, int endIndex, int addition){
            _startIndex = startIndex;
            _endIndex = endIndex;
            _addition = addition;
        }
        public int get_startIndex() {
            return _startIndex;
        }


        public int get_endIndex() {
            return _endIndex;
        }

        public int get_addition() {
            return _addition;
        }

        public Boolean ContainIndex(int index){
            if(index >= _startIndex && index <= _endIndex)
            {
                return true;
            }
            return false;
        }
    }
