public class condicionales {
    public static void main(String[] args) throws Exception {

        int edad = 18;
        String marca= "Peugeout";
        float potencia=12.4f;
        
        if (edad >= 18 && potencia < 140){
            System.out.println("Es mayor de edad, puede conducir un " +marca);
        }
        else
            System.out.println("No tienes permiso para conducir");


        System.out.println("Hello, World!");
    }
}
