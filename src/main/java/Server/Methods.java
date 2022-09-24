package Server;

import java.util.Random;

public class Methods {


    public static  String generar (String Nombre, String PrimerApellido, String SegundoApellido, String Ano, String Mes, String Dia, String Sexo, String Ciudades){

        char p_0 = PrimerApellido.charAt(0); char p_1 = PrimerApellido.charAt(1);
        char p_2 = SegundoApellido.charAt(0); char p_3 = Nombre.charAt(0);
        char p_4 = Ano.charAt(2);char p_5 = Ano.charAt(3);
        char p_6 = Mes.charAt(0);char p_7 = Mes.charAt(1);
        char p_8 = Dia.charAt(0);char p_9 = Dia.charAt(1);
        char p_10 = Sexo.charAt(0);char p_11 = Ciudades.charAt(0);
        char p_12 = Ciudades.charAt(1);char p_13 = ' ';char p_14 = ' ';
        char p_15 = ' ';

        char [] apellido_1 = PrimerApellido.toCharArray();

        for (int i = 1; i < apellido_1.length; i++) {
            String b = apellido_1[i] + "";
            if (!b.equals("a") && !b.equals("e") && !b.equals("i") && !b.equals("o") && !b.equals("u")) {
                p_13 = b.charAt(0);
                break;
            }
        }
            char[] apellido_2 = SegundoApellido.toCharArray();
            for ( int i = 1; i < apellido_2.length; i++) {
                String a = apellido_2[i] + "";
                if (!a.equals("a") && !a.equals("e") && !a.equals("i") && !a.equals("o") && !a.equals("u")){
                    p_14 = a.charAt(0);
                    break;
                }
            }
            char[] Nom = Nombre.toCharArray();
            for (int i = 1; i < Nom.length; i++) {
                String aux = Nom[i] + "";
                if (!aux.equals("a") && !aux.equals("e") && !aux.equals("i") && !aux.equals("o") && !aux.equals("u")) {
                    p_15 = aux.charAt(0);
                    break;
                }
            }


        Random random = new Random();
        String diferente = "";
        String random1 = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String random2 = "0123456789";
        diferente = random1.charAt(
                random.nextInt(random1.length())
        )
                + "" +
                random2.charAt(
                        random.nextInt(random2.length())
                );

        String CURP = ""+
        Character.toUpperCase(p_0) + Character.toUpperCase(p_1) + Character.toUpperCase(p_2) +
        Character.toUpperCase(p_3) + Character.toUpperCase(p_4) + Character.toUpperCase(p_5) +
        Character.toUpperCase(p_6) + Character.toUpperCase(p_7) + Character.toUpperCase(p_8) +
        Character.toUpperCase(p_9) + Character.toUpperCase(p_10) + Character.toUpperCase(p_11)+
        Character.toUpperCase(p_12) + Character.toUpperCase(p_13) + Character.toUpperCase(p_14) +
        Character.toUpperCase(p_15) + diferente;


        return CURP;
    }
}