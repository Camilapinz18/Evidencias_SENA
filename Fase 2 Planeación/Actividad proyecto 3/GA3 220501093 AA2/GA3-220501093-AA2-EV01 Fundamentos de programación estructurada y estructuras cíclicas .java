import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        /*
         * 1.Un corredor de maratón (distancia 42,195 Km) ha recorrido la carrera en 2
         * horas 25 minutos. Se desea un algoritmo que calcule el tiempo medio en
         * minutos por kilómetro.
         */
/*
        int tiempoMin;
        float maraton = 42.195f;
        float resultado;
        tiempoMin = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiempo en minutos que gastó el atleta en terminar la maratón"));
        resultado = tiempoMin / maraton;
        JOptionPane.showMessageDialog(null, "El atleta gastó " + resultado + " minutos por kilometro recorrido");
*/
        /*
         * 2. Realizar la conversión de una temperatura dada en grados Centígrados a
         * grados Fahrenheit (Fórmula: F = (9/5) C + 32).
         */
/*
        float celsius;
        float fahrenheit;
        celsius = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la temperatura en grados Celsius"));
        fahrenheit = celsius * 1.8f + 32;
        JOptionPane.showMessageDialog(null, celsius + " grados C° equivalen a " +fahrenheit + " grados F°");
*/
        /*
         * 3. Escribir el algoritmo que permite calcular la nota correspondiente al
         * primer parcial de “análisis” para un estudiante cualquiera. Se debe
         * considerar que hay dos talleres y un quiz, que en conjunto valen un 30% de la
         * nota y el resto (70%) corresponde a la nota del examen parcial.
         */
/*
        float taller1;
        float taller2;
        float quiz;
        float examen;
        float resultado;

        taller1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota del Taller 1"));
        taller2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota del Taller 2"));
        quiz = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota del Quiz"));
        examen = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota del Examen"));

        resultado = ((10 * taller1) / 100) + ((10 * taller2) / 100) + ((10 * quiz) / 100) + ((70 * examen) / 100);
        JOptionPane.showMessageDialog(null, "La nota final del primer parcial de análisis es de: " + resultado);
*/
        /*
         * 4. Un capital C está situado a un tipo de interés R anual ¿al término de
         * cuántos años se doblará?
         * //Formula= t= I/ci
         */
/*
        float capital;
        float interesEsperado;
        int tasa;
        float tiempo;

        capital = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el capital a invertir"));
        interesEsperado = capital * 2;
        tasa = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la tasa de interés anual"));

        tiempo = capital / ((capital * tasa) / 100);

        JOptionPane.showMessageDialog(null,"Se deben eserar " + tiempo + " años, para conseguir el mismo valor de capital en intereses");
*/
        /*
         * 5. Elaborar un algoritmo que permita ingresar 20 números y muestre todos los
         * números menores e iguales a 25.
         */
/*
        int[] numeros = new int[20];
        int[] menores = new int[20];
        int n;

        for (n = 0; n < numeros.length; n++) {
            numeros[n] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero mayor a cero (0). # " + n));

            if (numeros[n] <= 25) {
                menores[n] = numeros[n];
            } else {
            }

        }

        for (n = 0; n < menores.length; n++) {
            if (menores[n] != 0) {
                JOptionPane.showMessageDialog(null, "El numero " + menores[n] + " es menor o igual a 25");
            } else {
            }
        }
*/
        /*
         * 6. Hacer un programa que sume 5 precios de camisas (en dólares) y que luego
         * muestre el total de la venta en pesos.
         */
/*
        float camisas[] = new float[5];
        int m = 0;
        float dolar;
        float sumador = 0;
        float pesos;

        for (int n = 0; n < 5; n++) {
            m++;
            camisas[n] = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el costo en dolares de la camisa " + m));

            sumador = sumador + camisas[n];
            JOptionPane.showMessageDialog(null, n);

        }

        dolar = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio actual de dolar"));
        pesos = sumador * dolar;
        JOptionPane.showMessageDialog(null, "Costo total de las " + m +"camisas es pesos es de: " + pesos);
*/
        /*
         * 7. Hacer un programa que registre el consumo realizado por los clientes de un
         * restaurante, si el consumo de cada cliente excede 50000 se hará un descuento
         * del 20%. Se debe mostrar el pago de cada cliente y el total de todos los
         * pagos.
         */
/*
        int n;
        float consumo;
        float totalParcial;
        float totalFinal = 0;

        n = Integer.parseInt(JOptionPane.showInputDialog("1. Iniciar programa Restaurante"));

        while (n != 0) {

            consumo = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el costo del consumo del cliente:"));
            if (consumo > 50000) {
                totalParcial = (consumo * 80) / 100;
                JOptionPane.showMessageDialog(null, "Consumo con descuento! Valor a pagar: " + totalParcial);

            } else {
                totalParcial = consumo;
                JOptionPane.showMessageDialog(null, "Valor a pagar: " + totalParcial);
            }

            totalFinal = totalFinal + totalParcial;
            n = Integer.parseInt(JOptionPane.showInputDialog("1. Añadir pedido, 0. Cerrar programa"));

        }

        JOptionPane.showMessageDialog(null, "Consumo total del dia: " + totalFinal);
*/
        /*
         * 
         * 8. Diseñar un algoritmo que permita ingresar la hora, minutos y segundos, yy
         * que calcule la hora en el siguiente segundo ("0<= H <=23", "0<= M <=59"
         * "0<= S<=59").
         */
 /*       
        int horas;
        int minutos;
        int segundos;

        horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la hora actual"));
        minutos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los minutos actuales"));
        segundos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los segundos actuales"));

        if (segundos == 59) {
            if (minutos == 59) {
                minutos = 00;
                segundos = 00;

                if (horas == 23) {
                    horas = 00;
                } else {
                    horas = horas + 1;
                }
            } else {
                minutos = minutos + 1;
                segundos = 00;
            }

        } else {
            segundos = segundos + 1;
        }

        JOptionPane.showMessageDialog(null,
                "La hora en el siguiente segundo es: " + horas + ":" + minutos + ":" + segundos);
*/

        /*
         * 9. Dado N, escribir el producto desde 1 hasta N.
         */
/*
        int numero;
        int n;
        int producto;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero positivo"));

        for (n = 1; n <= numero; n++) {
            producto = n * numero;
            JOptionPane.showMessageDialog(null, n + "*" + numero + " = " + producto);
            producto = 0;
        }
*/
        /*
         * 10. Realizar un algoritmo
         * que muestre por pantalla la tabla de multiplicar decreciente de cualquier
         * número, ingresado entre el 1 y el 10.
         */
/*
        int numero;
        int n;
        int producto;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero entre el 1 y el 10"));

        for (n = 10; n >= 0; n--) {
            producto = numero * n;
            JOptionPane.showMessageDialog(null, numero + "*" + n + " = " + producto);
        }
*/
    }
}
