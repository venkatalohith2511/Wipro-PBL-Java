import java.util.Scanner;
public class StudentMarks1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[30];
        for(int i=0;i<30;i++){
            marks[i]=sc.nextInt();
        }
        int zerocount=0;
        int nonzerocount=0;
        int hundredcount=0;
        for(int i=0;i<30;i++){
            if(marks[i]==0){
                zerocount++;
            }
            else if(marks[i]==100){
                hundredcount++;
            }
            else{
                nonzerocount++; 
            }
        }
    }
}
