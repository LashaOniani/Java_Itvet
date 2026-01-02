package Week4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class jw4 {
    public jw4(){}
    public jw4(String task){
        if(task.equals("T1")){
            task1();
        }else if(task.equals("T2")){
            try {
                task2();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void task1(){
        GradeChecker gr = new GradeChecker();
        for(int i = 0; i < 110; i += 10){
            char grade = gr.getGrade(i+1);
            System.out.println("Your grade is: " + (i+1) + " final grade is: " + grade);
        }
    }

    private void task2() throws Exception {
        try(BufferedReader br = new BufferedReader(new FileReader("src/doctors.txt"))){
            String line;
            int lineCounter = 0;

            Surgeon sur = new Surgeon();
            Therapist the = new Therapist();
            Dentist den = new Dentist();

            int tempId = 0;
            String tempName = "";
            double tempSalary = 0;

            while((line = br.readLine()) != null){

                if(lineCounter > 0 && lineCounter < 4){
                    switch (lineCounter){
                        case 1 :
                            tempId = Integer.parseInt(line);
                            break;
                        case 2 :
                            tempName = line;
                            break;
                        case 3 :
                            tempSalary = Double.parseDouble(line);
                            break;
                    }
                    sur = new Surgeon(tempId, tempName, tempSalary);

                }
                if(lineCounter > 4 && lineCounter < 8){
                    switch (lineCounter){
                        case 5 :
                            tempId = Integer.parseInt(line);
                            break;
                        case 6 :
                            tempName = line;
                            break;
                        case 7 :
                            tempSalary = Double.parseDouble(line);
                            break;
                    }
                    den = new Dentist(tempId, tempName, tempSalary);
                }
                if(lineCounter > 8 && lineCounter < 12){
                    switch (lineCounter){
                        case 9 :
                            tempId = Integer.parseInt(line);
                            break;
                        case 10 :
                            tempName = line;
                            break;
                        case 11 :
                            tempSalary = Double.parseDouble(line);
                            break;
                    }
                    the = new Therapist(tempId, tempName, tempSalary);
                }
                lineCounter++;
            }
            System.out.println(sur.getInfo());
            System.out.println(the.getInfo());
            System.out.println(den.getInfo());
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
