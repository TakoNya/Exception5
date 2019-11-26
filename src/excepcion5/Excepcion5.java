package excepcion5;

public class Excepcion5 {

        public static void main(String[] args) {
        try{
            muestraArray();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Ha intentado acceder a una posición fuera del array.");
        }
    }
        public static void muestraArray(){
        int[] array = {4,2,6};
        for(int i = 0; i<=3; i++)
            System.out.println(array[i]);
        }
                
    
}
