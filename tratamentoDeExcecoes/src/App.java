import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args){
        int[] numerador = {4,5,8,10};
        int[] denominador = {2,4,0,2,8};

        for(int i = 0; i < denominador.length; i++){
            try{
            if(numerador[i] % 2 != 0)
                throw new ExceptionCustom("Divisao nao exata", numerador[i], denominador[i]);
            }catch(ExceptionCustom e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            int resultado = numerador[i] / denominador[i];
            System.out.println(resultado);
        }

        System.out.println("Continua...");
    }
}