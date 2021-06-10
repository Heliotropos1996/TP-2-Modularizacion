import java.util.Scanner;



public class Tp2Modularizacion {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		
		String Domicilio, nombre, descripcionProd = null, fecha, respuesta;
		int cantidProd = 0;
		double precioProd = 0, total, subtotSinIva, precioTotal, iva, precioTot;
		
	
		
		fecha = ingresarFecha(scan);
		
		nombre = obtenernNombre(scan);
		
		Domicilio = obtenerDomicilio(scan);
		
		while (true)
		{
		   System.out.println("¿Agregar producto? S/N");
		   respuesta = scan.nextLine();    
		   if (!respuesta.equalsIgnoreCase("s"))
		      break;

		   System.out.println("Descripcion Prod");
		   descripcionProd = scan.nextLine(); 
		   System.out.println("Cantidad Prod");
		   cantidProd = scan.nextInt();
		    
		   System.out.println("Precio unitario Prod");
		   precioProd = scan.nextInt();
		   scan.nextLine();
		   
		}
		
	
		precioTotal = precioProd * cantidProd;

		subtotSinIva = precioTotal + precioTotal;
		iva = subtotSinIva * 0.21;
		total = subtotSinIva + iva;
		
		
		imprimirTicket(Domicilio, nombre, descripcionProd, fecha, cantidProd, precioProd, total, subtotSinIva,
				precioTotal, iva);
	}

	private static void imprimirTicket(String Domicilio, String nombre, String descripcionProd, String fecha,
			int cantidProd, double precioProd, double total, double subtotSinIva, double precioTotal, double iva) {
		System.out.println("*************************************************************************************");
		System.out.println("Fecha: " + fecha);
		System.out.println("Nombre: " + nombre);
		System.out.println("Domicilio: " + Domicilio);
		System.out.println("*************************************************************************************");
		System.out.println("\nCant.\t\t|\t\tDescripcion\t|\t\tP. unit\t\t|\tP. total\n"
				+ "----------------------------------------------------------------------------------------------------\n"
				+ cantidProd + "\t\t|\t\t" + descripcionProd + "\t\t|\t\t" + precioProd + "\t\t|\t" + precioTotal 
				+ "\n----------------------------------------------------------------------------------------------------\n"
				+ "\n----------------------------------------------------------------------------------------------------\n"
				+ "IVA = " + iva + "\n"
				+ "Subtotal (sin IVA) = " + subtotSinIva + "\n"
				+ "Total = " + total);
	}

	private static String ingresarFecha(Scanner scan) {
		String fecha;
		System.out.println("Fecha: ");
		fecha = scan.nextLine();
		return fecha;
	}

	private static String obtenerDomicilio(Scanner scan) {
		String Domicilio;
		System.out.println("Domicilio");
		Domicilio = scan.nextLine();
		return Domicilio;
	}

	private static String obtenernNombre(Scanner scan) {
		String nombre;
		System.out.println("Nombre");
		nombre = scan.nextLine();
		return nombre;
	}

}
