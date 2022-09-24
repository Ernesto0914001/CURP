package Client;

import Server.Methods;
import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Client {


    public  static  void main (String[] args) throws MalformedURLException, XmlRpcException {
    XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
    config.setServerURL(new URL("http://localhost:1200"));
    XmlRpcClient client = new XmlRpcClient();
        int opt;
    Scanner teclado = new Scanner(System.in);
        System.out.println("***************************************");
        System.out.println("Bienvenido al Sistema Nacional de CURP");
        System.out.println("***************************************");
        System.out.println(" \n     Eliga Una Opción    ");
        System.out.println("1- Generar CURP");
        System.out.println("2- Consultar Persona");

        opt = teclado.nextInt();
        switch (opt){
            case 1:
                System.out.println(" \n Ingrese los siguientes datos");
                System.out.println("Nombre");
                String Nombre = teclado.next();
                System.out.println("Primer Apellido");
                String PrimerApellido = teclado.next();
                System.out.println("Segundo Apellido");
                String SegundoApellido = teclado.next();
                System.out.println("Año de Nacimiento");
                String Ano = teclado.next();
                System.out.println("Mes");
                String Mes = teclado.next();
                System.out.println("Día");
                String Dia = teclado.next();
                System.out.println("Sexo");
                String Sexo = teclado.next();
                System.out.println("Ingrese la CLAVE de su estado:" +
                                "AGUASCALIENTES (AS)"+
                                "BAJA CALIFORNIA NORTE (BC)" +
                                "BAJA CALIFORNIA SUR (BS)"+
                                "CAMPECHE (CC)"+
                                "COAHUILA (CL)" +
                                "COLIMA (CM)"+
                                "CHIAPAS (CS)"+
                                "CHIHUAHUA (CH)" +
                                "DISTRITO FEDERAL (DF)"+
                                "DURANGO (DG)"+
                                "GUANAJUATO (GT)"+
                                "GUERRERO (GR)" +
                                "HIDALGO (HG)" +"JALISCO (JC)"+
                                "ESTADO DE MEXICO (MC)"+
                                "MICHOACAN (MN) " +"MORELOS (MS)"+
                                "NAYARIT (NT)" +"NUEVO LEON(NL)"+
                                "OAXACA (OC)" +"PUEBLA (PL)" +
                                "QUERETARO (QT)"+
                                "QUINTANA ROO (QR)" +
                                "SAN LUIS POTOSI (SP)"+"SINALOA (SL)"+
                                "SONORA (SR)" +"TABASCO (TC)"+
                                "TAMAULIPAS (TS)" +
                                "TLAXCALA (TL) "+
                                "VERACRUZ (VZ)"+
                                "YUCATAN (YN)" +
                                "ZACATECAS (ZS)"
                        );
                String Ciudades = teclado.next();

        }
    }


}
