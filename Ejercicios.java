
public class Ejercicios
{
	//devuelve la suma de x y y
	static int sumar(int x=2, int y=1, int z=x+y)
	{
		return z;
	}
	
	//devuelve la resta de x y y
	static int restar(int x=4, int y=2, int z=x-y)
	{
		return z;
	}
	//devuelve la multiplicacion de x y y
	static int multiplicar(int x=2, int y=2, int z=x*y)
	{
		return z;
	}
	
	//devuelve el residuo de x y y
	static int residuo(int x=5, int y=2, int z=x%y)
	{
		return z;
	}
	
	//devuelve true si x es par, de lo cotrario devuelve false
	static boolean esPar(int x=2)
	{
		if(x%2 == 0){
			System.out.println("Es Par");
		}
	}
	
	//devuelve true si x es multiplo de 3, de lo cotrario devuelve false
	static boolean esMultiploDe3(int x=9)
	{
		if(x%3 == 0){
			System.out.println("Es multiplo de 3");
		}
	}
	
	//devuelve el numero mayor (x o y)
	static int getMayor(int x=10,int y=11)
	{
		if(x>y){
			System.out.print(x);
		}else{
			System.out.print(y);
		}
	}
	
	//devuelve true si la edad es mayor o igual a 18
	static boolean esMayorDeEdad(int edad=19)
	{
		if(edad >= 18){
			System.out.println("Es mayor de edad");
		}else{
			System.out.println("Es menor");
		}
	}
	
	//devuelve true si x, y y z son pares
	static boolean sonPares(int x=2, int y=4, int z=5)
	{
		if(x%2 == 0 || y%1 == 0 || z%2 == 0){
			System.out.println("Son pares");
		}else{ System.out.println("no son pares")}
	}
	
	//devuelve el numero mayor entre x, y y z
	static int getMayorDe3(int x=3, int y=12, int z=3)
	{
		 if ( x > y && x > z ){
         System.out.println("x es mayor");
     }{else if ( y > x && y > z ){
         System.out.println("y es mayor");
     }
      else if ( z > x && z > y ){
         System.out.println("z es mayor");
      }
      else   {
         System.out.println("todos son iguales");
      }
	}
	
	public static void main(String[] args)
	{
		
	}

}
