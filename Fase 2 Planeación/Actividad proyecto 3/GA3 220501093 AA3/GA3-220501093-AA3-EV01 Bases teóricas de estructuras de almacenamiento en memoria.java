import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.JOptionPane;
import javax.xml.transform.Source;

import javafx.scene.paint.Stop;

/**
 * tarea_2
 */
public class tarea_2 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        //Desarrollar un programa que permita calcular el área o perímetro de algunas figuras planas : 
        /*
        int m;
        int figura = 0;
        float area;
        float perimetro;

        float base;
        float altura;
        float l1;
        float l2;
        float l3;
        float radio;

        m = Integer.parseInt(JOptionPane.showInputDialog("Presione 1 para iniciar el programa"));

        while (m != 0) {

            m = Integer.parseInt(JOptionPane
                    .showInputDialog("Presione 1 para calcular el área. Presione 2 para calcular el perímetro"));

            if (m == 1) //AREAS:
            {
                JOptionPane.showMessageDialog(null,"Seleccione la figura a calcular. (Escriba el número correspondiente)");
                figura = Integer.parseInt(JOptionPane.showInputDialog("1)Triángulo  2)Rectángulo  3)Cuadrado  4)Círculo"));

                switch (figura) 
                {
                    case 1:
                        // Área tringulo:
                        base = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la base del triangulo"));
                        altura = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la altura del triangulo"));
                        area = (base * altura) / 2;
                        JOptionPane.showMessageDialog(null, "El área del triangulo con base " + base + ", y altura " + altura + ", es de: " + area);
                        break;

                    case 2:
                        //area rectangulo:
                        base = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la base del rectángulo"));
                        altura = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la altura del rectángulo"));
                        area=base*altura;
                        JOptionPane.showMessageDialog(null, "El área del rectángulo con base " + base + ", y altura " + altura + ", es de: " + area);
                        break;

                    case 3:
                        // area cuadrado:
                        base = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la medida del lado del cuadrado"));
                        area=(float) Math.pow(base, 2);
                        JOptionPane.showMessageDialog(null, "El área del cuadrado con lado " + base + ", es de: " + area);
                        break;
                    
                    case 4:
                        //area circulo
                        radio = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la medida del radio del círculo"));
                        area=(float)Math.PI*(float)Math.pow(radio, 2);
                        JOptionPane.showMessageDialog(null, "El área del círculo con radio " + radio + ", es de: " + area);
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Seleccion no valida. Intente de nuevo");
                        break;

                }
            }
            
            if(m==2) //Perimetros
            {
                JOptionPane.showMessageDialog(null,"Seleccione la figura a calcular. (Escriba el número correspondiente)");
                figura = Integer.parseInt(JOptionPane.showInputDialog("1)Triángulo  2)Rectángulo  3)Cuadrado  4)Círculo"));

                switch(figura)
                {
                    case 1:
                        //perimetro triangulo:
                        l1=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la medida del lado 1 del triángulo"));
                        l2=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la medida del lado 2 del triángulo"));
                        l3=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la medida del lado 3 del triángulo"));

                        perimetro=l1+l2+l3;

                        JOptionPane.showMessageDialog(null, "El perímetro del triangulo con lado 1: " + l1 + ", lado 2: "+l2+" y lado 3: "+l3+ " es de: " + perimetro);
                        break;

                    case 2:
                        l1=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la medida del lado 1 del rectángulo"));
                        l2=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la medida del lado 2 del rectángulo"));

                        perimetro=2*(l1+l2);

                        JOptionPane.showMessageDialog(null, "El perímetro del rectángulo con lado 1: " + l1 + " y lado 2: "+l2+" es de: " + perimetro);
                        break;

                    case 3:
                        l1=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la medida del lado del cuadrado"));
                        perimetro=4*l1;

                        JOptionPane.showMessageDialog(null, "El perímetro del cuadrado con lado " + l1 + " es de: " + perimetro);
                        break;

                    case 4:
                        radio = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la medida del radio del círculo"));
                        perimetro=2*(float)(Math.PI*radio);
                        JOptionPane.showMessageDialog(null, "El perímetro del círculo con radio " + radio + " es de: " + perimetro);
                        break;



                    default:
                        JOptionPane.showMessageDialog(null, "Seleccion no valida. Intente de nuevo");
                        break;


                        
                }
            }
        }*/




















        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Desarrollar un programa que permita almacenar las edades de un grupo de 10 personas en un vector de enteros y luego determine la cantidad de personas que son menores de edad, mayores de edad, cuántos adultos mayores, la edad más baja, la edad más alta y el promedio de edades ingresadas. Para el ejercicio anterior suponga que un adulto mayor debe tener una edad igual o superior a 60. Debe validar para cada ingreso que los valores estén en un rango entre 1 y 120 años. En caso de error deberá notificar y solicitar un nuevo valor. 
        /*
        int[] edades= new int[10];
        int n; int m;
        int menores=0;
        int mayores=0;
        int adultos=0;
        float promedio=0;

        for(n=0; n<=9;n++)
        {
            m=n+1;
            edades[n]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad No. "+m));

            if(edades[n]<0 || edades[n]>=120)
            {
                JOptionPane.showMessageDialog(null,"Debe ingresar una edad entre 0 a 120 años. Intentelo de nuevo");
                n--;
                continue;
            }

            promedio=promedio+edades[n];
            //MENORES DE EDAD:
            if(edades[n]<18)
            {
                menores=menores+1;
            }

            //MAYORES DE EDAD:
            if(edades[n]>=18 && edades[n]<59)
            {
                mayores=mayores+1;
            }

            //ADULTOS MAYORES:
            if(edades[n]>=60)
            {
                adultos=adultos+1;
            }

        }
      
        Arrays.sort(edades);
        promedio=promedio/10;
        JOptionPane.showMessageDialog(null, menores+" personas son menores de edad");
        JOptionPane.showMessageDialog(null, mayores+" personas son mayores de edad");
        JOptionPane.showMessageDialog(null, adultos+" personas son adultos mayores de 60 años");
        JOptionPane.showMessageDialog(null, "El promedio de las edades ingresadas es de: "+promedio);
        JOptionPane.showMessageDialog(null, "La edad mas baja del grupo es de: "+edades[0]+" años");
        JOptionPane.showMessageDialog(null, "La edad mas alta del grupo es de: "+edades[9]+" años");
        */















        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Escriba  un  programa  que  lea  dos  vectores  de  números  enteros  ordenados  ascendentemente  y  luego produzca la lista ordenada de la mezcla de los dos, por ejemplo, si los dos arreglos tienen los números 1 3 6 9 17 y 2 4 10 17, respectivamente, la lista de números en la pantalla debe ser 1 2 3 4 6 9 10 17 17.  Limite los vectores a un tamaño de 5 y debe validar en cada ingreso que realmente se estén ingresando los datos de forma ascendente. 
        /* 
        int[] vector1= new int[5];
        int[] vector2=new int[5];
        int longitud=vector1.length+vector2.length;
        int[] combinacion = new int[longitud];
        int longComb=combinacion.length-1;
        int n;

        JOptionPane.showMessageDialog(null,"Ingrese 5 numeros enteros de menor a mayor");

        for(n=0;n<=4;n++)
        {
            
            if(n==0)
            {
                vector1[n]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número"));
            }
            else
            {
                vector1[n]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número"));
                if(vector1[n]<vector1[n-1])
                {
                    JOptionPane.showMessageDialog(null,"Error! Ingrese numeros en orden ascendente (de menor a mayor)");        
                    n--;           
                }                 
            }
        }

        JOptionPane.showMessageDialog(null, "Ha ingresado satisfactoriamente los 5 numeros" );
        JOptionPane.showMessageDialog(null, "Para el segundo vector, ingrese 5 numeros enteros de menor a mayor" );

        for(n=0;n<=4;n++)
        {
            if(n==0)
            {
                vector2[n]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número"));
            }
            else
            {
                vector2[n]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número"));
                if(vector2[n]<vector2[n-1])
                {
                    JOptionPane.showMessageDialog(null,"Error! Ingrese numeros en orden ascendente (de menor a mayor)");        
                    n--;           
                }                 
            }
        }

        System.arraycopy(vector1, 0, combinacion, 0, vector1.length);
        System.arraycopy(vector2, 0, combinacion, 5, vector2.length); //
        Arrays.sort(combinacion);

        for(n=0;n<=longComb;n++)
        {
            System.out.println(combinacion[n]);
        }
        */


        
        
        
        
        
        
        
        
        
        
        
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Una emisora con presencia en diferentes ciudades desea conocer el rating de canciones y cantantes más escuchados (sonados) en este semestre del año. Por lo tanto, se ha pedido a estudiantes del SENA del programa de tecnólogo en análisis y desarrollo de software desarrollar una solución que permita conocer la respuesta de 6 personas con relación a sus gustos musicales. Con fines administrativos y realizar una rifa entre las personas encuestadas, la emisora desea poder registrar  de las personas entrevistadas su nombre, número de identificación (cédula), fecha de nacimiento, correo electrónico, ciudad de residencia, ciudad de origen. Además, se deberá poder almacenar el artista y título de hasta 3 canciones favoritas en cada una de las personas que se ingrese, teniendo en cuenta lo anterior, se sugiere que la solución deberá mostrar un menú que permita las siguientes opciones: a. Agregar una persona con los datos que se listan anteriormente. b. Mostrar la información personal de una persona particular por medio de su posición en el vector. 

        /*
        Object tabla[][]= new Object[6][11];  //filas-cols
        int opcion=1;
        int n=0;
        int index;
        int x=0;

        opcion=Integer.parseInt(JOptionPane.showInputDialog("1. Agregar nueva persona     2. Mostrar información      3. Salir del programa"));

        while(opcion!=3)
        {
            if(opcion==1)
            {
                for(x=0; x<=5; x++)
                {
                    if(tabla[x][0]==null) // si esta vacio
                    {
                            //Se llena la infro
                            JOptionPane.showMessageDialog(null, "Registro de información # "+x);
                            tabla[x][0]=JOptionPane.showInputDialog("Nombre: "); //String
                            tabla[x][1]=Integer.parseInt(JOptionPane.showInputDialog("Cédula: ")); //Int
                            tabla[x][2]=JOptionPane.showInputDialog("Fecha de nacimiento: "); //String
                            tabla[x][3]=JOptionPane.showInputDialog("Email: "); //String
                            tabla[x][4]=JOptionPane.showInputDialog("Ciudad de residencia: "); //String
                            tabla[x][5]=JOptionPane.showInputDialog("Ciudad de origen: ");
                            tabla[x][6]=JOptionPane.showInputDialog("Artista favorito: ");
                            tabla[x][7]=JOptionPane.showInputDialog("Canción más escuchada #1: ");
                            tabla[x][8]=JOptionPane.showInputDialog("Canción más escuchada #2: ");
                            tabla[x][9]=JOptionPane.showInputDialog("Canción más escuchada #3: ");
                            break;
                    }
                    else //si no.. no se llena
                    {
                        
                    }
                    if(x==5)
                    {
                        JOptionPane.showMessageDialog(null, "Ya no tienes almacenamiento disponible");
                        break;
                    }    
                }      
            }

            if(opcion==2)
            {
                
                index=Integer.parseInt(JOptionPane.showInputDialog("Seleccione una posición de la tabla para ver su información (del 0 al 5)"));
                if(index<0 || index>5)
                {
                    JOptionPane.showMessageDialog(null, "Ha ingresado un dato incorrecto. Intentelo de nuevo");
                }

                JOptionPane.showMessageDialog(null, "Nombre: "+tabla[index][0]+", Cédula: "+tabla[index][1]+", Fecha de nacimiento: "+tabla[index][2]+", E-mail: "+tabla[index][3]+", Ciudad de residencia: "+tabla[index][4]+", Ciudad de origen: "+tabla[index][5]+", Artista favorito: "+tabla[index][6]+", Canción mas escuchada #1: "+tabla[index][7]+", Cancion mas escuchada #2: "+tabla[index][8]+", Canción mas escuchada #3: "+tabla[index][9]);
            }

            opcion=Integer.parseInt(JOptionPane.showInputDialog("1. Agregar nueva persona     2. Mostrar información      3. Salir del programa"));


        }  */




    
    }
}
