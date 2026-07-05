public class A7 {
    public static void main(String[] args) {
        String gender=args[0];
        int age=Integer.parseInt(args[1]);
        double interest=0.0;
        if(gender.equals("Female")){
            if(age>=1 && age<=58){
                interest=8.2;
            }
            else if(age>=59 && age<=100){
                interest=9.2;
            }
        }
        else if(gender.equals("Male")){
            if(age>=1 && age<=58){
                interest=8.4;
            }
            else if(age>=59 && age<=100){
                interest=10.5;
            }
        }
        else{
            System.out.println("Invalid gender");
            return;
        }
        System.out.println("Interest Rate: " + interest);
    }
}
