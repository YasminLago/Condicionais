package condicional1;
//Yasmin
public class Condicional1 {
   public static void main(String[] args) {
      int num1,num2;
      Compara obx=new Compara();
      num1=obx.pedirNumEnteiro();
      num2=obx.pedirNumEnteiro();
      obx.comparar(num1, num2);
  
      }
    }
    /*String resultado=JOptionPane.showInputDialog("Num1");
      num1=Integer.parseInt(resultado);
      String resultado1=JOptionPane.showInputDialog("Num2");
      num2=Integer.parseInt(resultado1);
      
        if (num1>num2){
            System.out.println("O maior é "+num1);
        }
        
        else if (num1<num2){
            System.out.println("O maior é "+num2);    
        }
        
            else if(num1==num2){
            System.out.println("Son iguais");*/