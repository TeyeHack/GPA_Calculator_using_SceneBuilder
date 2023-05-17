/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpacalculatorapplication;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;


/**
 * FXML Controller class
 *
 * @author teyee
 */
public class GPAUIDesignFXMLController implements Initializable {

    /**
     * Initializes the controller class.
     *
     */
    //Initialiazation of choice box
    //Left
    @FXML private ChoiceBox choicebox1;
    @FXML private ChoiceBox choicebox2;
    @FXML private ChoiceBox choicebox3;
    @FXML private ChoiceBox choicebox4;
    @FXML private ChoiceBox choicebox5;
    @FXML private ChoiceBox choicebox6;
    @FXML private ChoiceBox choicebox7;
    @FXML private ChoiceBox choicebox8;
    //Center
    @FXML private ChoiceBox choicebox9;
    @FXML private ChoiceBox choicebox10;
    @FXML private ChoiceBox choicebox11;
    @FXML private ChoiceBox choicebox12;
    @FXML private ChoiceBox choicebox13;
    @FXML private ChoiceBox choicebox14;
    @FXML private ChoiceBox choicebox15;
    @FXML private ChoiceBox choicebox16;
    //Ending
    @FXML private ChoiceBox choicebox17;
    @FXML private ChoiceBox choicebox18;
    @FXML private ChoiceBox choicebox19;
    @FXML private ChoiceBox choicebox20;
    @FXML private ChoiceBox choicebox21;
    @FXML private ChoiceBox choicebox22;
    @FXML private ChoiceBox choicebox23;
    @FXML private ChoiceBox choicebox24;
    
    @FXML private Button GPABtn;
    @FXML private Label choiceboxLabel;
    @FXML private Label choiceboxLabel2;
    
    public void GPABtnpushed(){
       double LetterGrade [] = new double[8];
        double Credits_Hrs [] = new double[8];
            //Getting Values from choicebox when selected
           String Lchoicebox9 =choicebox9.getValue().toString();
           String Lchoicebox10 =choicebox10.getValue().toString();
           String Lchoicebox11 =choicebox11.getValue().toString();
           String Lchoicebox12 =choicebox12.getValue().toString();
           String Lchoicebox13 =choicebox13.getValue().toString();
           String Lchoicebox14 =choicebox14.getValue().toString();
           String Lchoicebox15 =choicebox15.getValue().toString();
           String Lchoicebox16 =choicebox16.getValue().toString();
           
            //Getting Values from choicebox when selected
           String Cchoicebox17 =choicebox17.getValue().toString();
           String Cchoicebox18 =choicebox18.getValue().toString();
           String Cchoicebox19 =choicebox19.getValue().toString();
           String Cchoicebox20 =choicebox20.getValue().toString();
           String Cchoicebox21 =choicebox21.getValue().toString();
           String Cchoicebox22 =choicebox22.getValue().toString();
           String Cchoicebox23 =choicebox23.getValue().toString();
           String Cchoicebox24 =choicebox24.getValue().toString();
           //Converting Strings to double
           //Credits_Hrs [0]=Double.parseDouble(Lchoicebox17);
          
             
             switch(Lchoicebox9){
               case "A+":
                  LetterGrade[0]=4.0;
                  break;
                  case "B+":
                  LetterGrade[0]=3.5;
                  break;
                  case "B":
                  LetterGrade[0]=3.0;
                  break;
                  case "C+":
                  LetterGrade[0]=2.5;
                  break;
                  case "C":
                  LetterGrade[0]=2.0;
                  break;
                  case "D":
                  LetterGrade[0]=1.5;
                  break;
                  case "E":
                  LetterGrade[0]=1.0;
                  break;
                  case "F":
                  LetterGrade[0]=0.5;
                  break;
                  case "Select":
                  LetterGrade[0]=0.0;
                  break;
                  default:
                      System.out.println("Something went wrong");
                      break;
           }
         switch(Lchoicebox10){
               case "A+":
                  LetterGrade[1]=4.0;
                  break;
                  case "B+":
                  LetterGrade[1]=3.5;
                  break;
                  case "B":
                  LetterGrade[1]=3.0;
                  break;
                  case "C+":
                  LetterGrade[1]=2.5;
                  break;
                  case "C":
                  LetterGrade[1]=2.0;
                  break;
                  case "D":
                  LetterGrade[1]=1.5;
                  break;
                  case "E":
                  LetterGrade[1]=1.0;
                  break;
                  case "F":
                  LetterGrade[1]=0.5;
                  break;
                  case "Select":
                  LetterGrade[1]=0.0;
                  break;
                  default:
                      System.out.println("Something went wrong");
                      break;
           }
         
           switch(Lchoicebox11){
               case "A+":
                  LetterGrade[2]=4.0;
                  break;
                  case "B+":
                  LetterGrade[2]=3.5;
                  break;
                  case "B":
                  LetterGrade[2]=3.0;
                  break;
                  case "C+":
                  LetterGrade[2]=2.5;
                  break;
                  case "C":
                  LetterGrade[2]=2.0;
                  break;
                  case "D":
                  LetterGrade[2]=1.5;
                  break;
                  case "E":
                  LetterGrade[2]=1.0;
                  break;
                  case "F":
                  LetterGrade[2]=0.5;
                  break;
                  case "Select":
                  LetterGrade[2]=0.0;
                  break;
                  default:
                      System.out.println("Something went wrong");
                      break;
           }
         switch(Lchoicebox12){
               case "A+":
                  LetterGrade[3]=4.0;
                  break;
                  case "B+":
                  LetterGrade[3]=3.5;
                  break;
                  case "B":
                  LetterGrade[3]=3.0;
                  break;
                  case "C+":
                  LetterGrade[3]=2.5;
                  break;
                  case "C":
                  LetterGrade[3]=2.0;
                  break;
                  case "D":
                  LetterGrade[3]=1.5;
                  break;
                  case "E":
                  LetterGrade[3]=1.0;
                  break;
                  case "F":
                  LetterGrade[3]=0.5;
                  break;
                  case "Select":
                  LetterGrade[3]=0.0;
                  break;
                  default:
                      System.out.println("Something went wrong");
                      break;
           }
         
           switch(Lchoicebox13){
               case "A+":
                  LetterGrade[4]=4.0;
                  break;
                  case "B+":
                  LetterGrade[4]=3.5;
                  break;
                  case "B":
                  LetterGrade[4]=3.0;
                  break;
                  case "C+":
                  LetterGrade[4]=2.5;
                  break;
                  case "C":
                  LetterGrade[4]=2.0;
                  break;
                  case "D":
                  LetterGrade[4]=1.5;
                  break;
                  case "E":
                  LetterGrade[4]=1.0;
                  break;
                  case "F":
                  LetterGrade[4]=0.5;
                  break;
                  case "Select":
                  LetterGrade[4]=0.0;
                  break;
                  default:
                      System.out.println("Something went wrong");
                      break;
           }
         
           switch(Lchoicebox14){
               case "A+":
                  LetterGrade[5]=4.0;
                  break;
                  case "B+":
                  LetterGrade[5]=3.5;
                  break;
                  case "B":
                  LetterGrade[5]=3.0;
                  break;
                  case "C+":
                  LetterGrade[5]=2.5;
                  break;
                  case "C":
                  LetterGrade[5]=2.0;
                  break;
                  case "D":
                  LetterGrade[5]=1.5;
                  break;
                  case "E":
                  LetterGrade[5]=1.0;
                  break;
                  case "F":
                  LetterGrade[5]=0.5;
                  break;
                  case "Select":
                  LetterGrade[5]=0.0;
                  break;
                  default:
                      System.out.println("Something went wrong");
                      break;
           }
           switch(Lchoicebox15){
               case "A+":
                  LetterGrade[6]=4.0;
                  break;
                  case "B+":
                  LetterGrade[6]=3.5;
                  break;
                  case "B":
                  LetterGrade[6]=3.0;
                  break;
                  case "C+":
                  LetterGrade[6]=2.5;
                  break;
                  case "C":
                  LetterGrade[6]=2.0;
                  break;
                  case "D":
                  LetterGrade[6]=1.5;
                  break;
                  case "E":
                  LetterGrade[6]=1.0;
                  break;
                  case "F":
                  LetterGrade[6]=0.5;
                  break;
                  case "Select":
                  LetterGrade[6]=0.0;
                  break;
                  default:
                      System.out.println("Something went wrong");
                      break;
           }
         
           switch(Lchoicebox16){
               case "A+":
                  LetterGrade[7]=4.0;
                  break;
                  case "B+":
                  LetterGrade[7]=3.5;
                  break;
                  case "B":
                  LetterGrade[7]=3.0;
                  break;
                  case "C+":
                  LetterGrade[7]=2.5;
                  break;
                  case "C":
                  LetterGrade[7]=2.0;
                  break;
                  case "D":
                  LetterGrade[7]=1.5;
                  break;
                  case "E":
                  LetterGrade[7]=1.0;
                  break;
                  case "F":
                  LetterGrade[7]=0.5;
                  break;
                  case "Select":
                  LetterGrade[7]=0;
                  break;
                  default:
                      System.out.println("Something went wrong");
                      break;
           }
            //Credit Hrs 
         switch(Cchoicebox17){
                     case "1":
                     Credits_Hrs[0]=1.0;
                     break;
                     case "2":
                     Credits_Hrs[0]=2.0;
                     break;
                     case "3":
                     Credits_Hrs[0]=3.0;
                     break;
                     case "4":
                     Credits_Hrs[0]=4.0;
                     break;
                     case "5":
                     Credits_Hrs[0]=5.0;
                     break;
                     case "Select":
                     Credits_Hrs[0]=0.0;
                     break;
                     default:
                         System.out.print("working");
                         break;
             }
                  switch(Cchoicebox18){
                     case "1":
                     Credits_Hrs[1]=1.0;
                     break;
                     case "2":
                     Credits_Hrs[1]=2.0;
                     break;
                     case "3":
                     Credits_Hrs[1]=3.0;
                     break;
                     case "4":
                     Credits_Hrs[1]=4.0;
                     break;
                     case "5":
                     Credits_Hrs[1]=5.0;
                     break;
                     case "Select":
                     Credits_Hrs[1]=0.0;
                     break;
                     default:
                         System.out.print("working");
                         break;
             }
                  switch(Cchoicebox19){
                     case "1":
                     Credits_Hrs[2]=1.0;
                     break;
                     case "2":
                     Credits_Hrs[2]=2.0;
                     break;
                     case "3":
                     Credits_Hrs[2]=3.0;
                     break;
                     case "4":
                     Credits_Hrs[2]=4.0;
                     break;
                     case "5":
                     Credits_Hrs[2]=5.0;
                     break;
                     case "Select":
                     Credits_Hrs[2]=0.0;
                     break;
                     default:
                         System.out.print("working");
                         break;
             }
                  switch(Cchoicebox20){
                     case "1":
                     Credits_Hrs[3]=1.0;
                     break;
                     case "2":
                     Credits_Hrs[3]=2.0;
                     break;
                     case "3":
                     Credits_Hrs[3]=3.0;
                     break;
                     case "4":
                     Credits_Hrs[3]=4.0;
                     break;
                     case "5":
                     Credits_Hrs[3]=5.0;
                     break;
                     case "Select":
                     Credits_Hrs[3]=0.0;
                     break;
                     default:
                         System.out.print("working");
                         break;
             }
                    switch(Cchoicebox21){
                     case "1":
                     Credits_Hrs[4]=1.0;
                     break;
                     case "2":
                     Credits_Hrs[4]=2.0;
                     break;
                     case "3":
                     Credits_Hrs[4]=3.0;
                     break;
                     case "4":
                     Credits_Hrs[4]=4.0;
                     break;
                     case "5":
                     Credits_Hrs[4]=5.0;
                     break;
                     case "Select":
                     Credits_Hrs[4]=0.0;
                     break;
                     default:
                         System.out.print("working");
                         break;
             }
                    switch(Cchoicebox22){
                     case "1":
                     Credits_Hrs[5]=1.0;
                     break;
                     case "2":
                     Credits_Hrs[5]=2.0;
                     break;
                     case "3":
                     Credits_Hrs[5]=3.0;
                     break;
                     case "4":
                     Credits_Hrs[5]=4.0;
                     break;
                     case "5":
                     Credits_Hrs[5]=5.0;
                     break;
                     case "Select":
                     Credits_Hrs[5]=0.0;
                     break;
                     default:
                         System.out.print("working");
                         break;
             }
                    switch(Cchoicebox23){
                     case "1":
                     Credits_Hrs[6]=1.0;
                     break;
                     case "2":
                     Credits_Hrs[6]=2.0;
                     break;
                     case "3":
                     Credits_Hrs[6]=3.0;
                     break;
                     case "4":
                     Credits_Hrs[6]=4.0;
                     break;
                     case "5":
                     Credits_Hrs[6]=5.0;
                     break;
                     case "Select":
                     Credits_Hrs[6]=0.0;
                     break;
                     default:
                         System.out.print("working");
                         break;
             }
                  
                     switch(Cchoicebox24){
                     case "1":
                     Credits_Hrs[7]=1.0;
                     break;
                     case "2":
                     Credits_Hrs[7]=2.0;
                     break;
                     case "3":
                     Credits_Hrs[7]=3.0;
                     break;
                     case "4":
                     Credits_Hrs[7]=4.0;
                     break;
                     case "5":
                     Credits_Hrs[7]=5.0;
                     break;
                     case "Select":
                     Credits_Hrs[7]=0.0;
                     break;
                     default:
                         System.out.print("working");
                         break;
             }
            
          
                          //Credits_Hrs [0]=Double.parseDouble(Lchoicebox17);
           double total_Cross_Grade=0;
             for(int i=0; i<8;i++){
             total_Cross_Grade+=Credits_Hrs[i]*LetterGrade[i];
             }
         double total_Credit_Hrs =0;
       
            for(int j=0; j<8;j++){
             total_Credit_Hrs +=Credits_Hrs[j];
             }
         
           double GPA=(total_Cross_Grade/total_Credit_Hrs);
                
           choiceboxLabel.setText("Total GPA = "+  GPA);
           if(GPA>=3.5){
           choiceboxLabel2.setText("First Class ");
           }
           else if (GPA>=3.0&&GPA<3.5){
               choiceboxLabel2.setText("Second Class Upper ");
           }
                      else if (GPA>=2.5&&GPA<3.0){
               choiceboxLabel2.setText("Second Class Lower");
           }
                      else if (GPA>=2.0 && GPA<2.5){
               choiceboxLabel2.setText("Third Class ");
           }
                      else{
                      choiceboxLabel2.setText("Fail");
                      }
    }
    
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
        //Left
        choicebox1.getItems().addAll("1","2","3","4","5","6","7","8");
        choicebox2.getItems().addAll("1","2","3","4","5","6","7","8");
        choicebox3.getItems().addAll("1","2","3","4","5","6","7","8");
        choicebox4.getItems().addAll("1","2","3","4","5","6","7","8");
        choicebox5.getItems().addAll("1","2","3","4","5","6","7","8");
        choicebox6.getItems().addAll("1","2","3","4","5","6","7","8");
        choicebox7.getItems().addAll("1","2","3","4","5","6","7","8");
        choicebox8.getItems().addAll("1","2","3","4","5","6","7","8");
        //Initialisation of values
        choicebox1.setValue("1");
        choicebox2.setValue("2");
        choicebox3.setValue("3");
        choicebox4.setValue("4");
        choicebox5.setValue("5");
        choicebox6.setValue("6");
        choicebox7.setValue("7");
        choicebox8.setValue("8");
        //Center
        choicebox9.getItems().addAll("Select","A+","B+","B","C+","C","D","E","F");
        choicebox10.getItems().addAll("Select","A+","B+","B","C+","C","D","E","F");
        choicebox11.getItems().addAll("Select","A+","B+","B","C+","C","D","E","F");
        choicebox12.getItems().addAll("Select","A+","B+","B","C+","C","D","E","F");
        choicebox13.getItems().addAll("Select","A+","B+","B","C+","C","D","E","F");
        choicebox14.getItems().addAll("Select","A+","B+","B","C+","C","D","E","F");
        choicebox15.getItems().addAll("Select","A+","B+","B","C+","C","D","E","F");
        choicebox16.getItems().addAll("Select","A+","B+","B","C+","C","D","E","F");
        //Initialisation of values
        choicebox9.setValue("Select");
        choicebox10.setValue("Select");
        choicebox11.setValue("Select");
        choicebox12.setValue("Select");
        choicebox13.setValue("Select");
        choicebox14.setValue("Select");
        choicebox15.setValue("Select");
        choicebox16.setValue("Select");
         //Right
        choicebox17.getItems().addAll("1","2","3","4","5","Select");
        choicebox18.getItems().addAll("1","2","3","4","5","Select");
        choicebox19.getItems().addAll("1","2","3","4","5","Select");
        choicebox20.getItems().addAll("1","2","3","4","5","Select");
        choicebox21.getItems().addAll("1","2","3","4","5","Select");
        choicebox22.getItems().addAll("1","2","3","4","5","Select");
        choicebox23.getItems().addAll("1","2","3","4","5","Select");
        choicebox24.getItems().addAll("1","2","3","4","5","Select");
        //Initialisation of values
        choicebox17.setValue("Select");
        choicebox18.setValue("Select");
        choicebox19.setValue("Select");
        choicebox20.setValue("Select");
        choicebox21.setValue("Select");
        choicebox22.setValue("Select");
        choicebox23.setValue("Select");
        choicebox24.setValue("Select");
        
        
        
    }    
    
}
