public class grading {
    public static void main(String[] args){
        int marks=120;
        if(marks>90 && marks<=100){
            System.out.print("Excellent");
        }
        else if(marks<=90 && marks>80){
            System.out.print("Good");
        }
        else if(marks<=80 && marks>70){
            System.out.println("Fair");
        }
        else if (marks <= 70 && marks > 60) {
            System.out.println("More Expectations");
        }
        else if(marks<60){
            System.out.println("Below par");
        }
        else{
            System.out.print("Invalid marks");
        }

    }
}
