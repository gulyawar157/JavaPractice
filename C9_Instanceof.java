 class Animal{

}

class Dogfamily extends Animal {
}



public class C9_Instanceof {
    public static void main(String[] args) {
        Animal Elephant = new Animal();

      
 // 3. Parent object is not an instance of Child
         System.out.println(Elephant instanceof Animal);
          System.out.println(Elephant instanceof Dogfamily);

            Dogfamily Germanshep = new Dogfamily();
   System.out.println(Germanshep instanceof Animal);
          System.out.println(Germanshep instanceof Dogfamily);


           // Note : Object is ancestor of all classes in Java
        System.out.println(Germanshep instanceof Object);


        // 2. instanceof returning false for null 
        Animal testAnimal = null;
           System.out.println(testAnimal instanceof Animal);


        //* 4. Parent reference referring to a Child is an instance of a Child */
          Animal Cheetah = new Dogfamily();
            System.out.println(Cheetah instanceof Dogfamily);



        
    }
}
