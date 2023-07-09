

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ConversorMonedas {
    public static void main(String[] args) {
        DecimalFormat formatearDivisa = new DecimalFormat("#.##");
        boolean continuarPrograma = true;
        while (continuarPrograma) {
            String[] opciones = {"Pesos a Euros", "Pesos a Dolar", "Pesos a Libra", "Pesos a Yen", "Pesos a Won", "Euros a Pesos", "Dolar a Pesos", "Libra a Pesos", "Yen a Pesos", "Won a Pesos"};
            String cambio = (String) JOptionPane.showInputDialog(null, "Elija una opcion:", "Conversor de Moneda", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            String input = JOptionPane.showInputDialog(null, "Ingrese la cantidad: ");
            double pesos;
            double euros;
            double dolar;
            double libra;
            double yen;
            double won;

            try {
                pesos = Double.parseDouble(input);
                euros = Double.parseDouble(input);
                dolar = Double.parseDouble(input);
                libra = Double.parseDouble(input);
                yen = Double.parseDouble(input);
                won = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor no Valido");
                continue;
            }
            double resultado = 0;
            switch (cambio) {
                case "Pesos a Euros":
                    resultado = pesos * 0.00022;
                    JOptionPane.showMessageDialog(null, formatearDivisa.format(pesos) + " Pesos COL son equivalentes a " + formatearDivisa.format(resultado) + " Euros " );
                    continuarPrograma = JOptionPane.showConfirmDialog(null, " ¿Desea continuar?", "", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
                    break;
                case "Pesos a Dolar":
                    resultado = pesos * 0.00026;
                    JOptionPane.showMessageDialog(null, formatearDivisa.format(pesos) + " Pesos COL son equivalentes a " + formatearDivisa.format(resultado) + " Dolares " );
                    continuarPrograma = JOptionPane.showConfirmDialog(null, " ¿Desea continuar?", "", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
                    break;
                case "Pesos a Libra":
                    resultado = pesos * 0.00019;
                    JOptionPane.showMessageDialog(null, formatearDivisa.format(pesos) + " Pesos COL son equivalentes a " + formatearDivisa.format(resultado) + " Libras " );
                    continuarPrograma = JOptionPane.showConfirmDialog(null, " ¿Desea continuar?", "", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
                    break;
                case "Pesos a Yen":
                    resultado = pesos * 0.028;
                    JOptionPane.showMessageDialog(null, formatearDivisa.format(pesos) + " Pesos COL son equivalentes a " + formatearDivisa.format(resultado) + " Yen " );
                    continuarPrograma = JOptionPane.showConfirmDialog(null, " ¿Desea continuar?", "", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
                    break;
                case "Pesos a Won":
                    resultado = pesos * 0.31;
                    JOptionPane.showMessageDialog(null, formatearDivisa.format(pesos) + " Pesos COL son equivalentes a " + formatearDivisa.format(resultado) + " Won " );
                    continuarPrograma = JOptionPane.showConfirmDialog(null, " ¿Desea continuar?", "", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
                    break;

                case "Euros a Pesos":
                    resultado = euros * 4603;
                    JOptionPane.showMessageDialog(null, formatearDivisa.format(euros) + " Euros son equivalentes a " + formatearDivisa.format(resultado) + " Pesos.");
                    continuarPrograma = JOptionPane.showConfirmDialog(null, " ¿Desea continuar? ", "", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
                    break;                    
                case "Dolar a Pesos":
                    resultado = dolar * 4196;
                    JOptionPane.showMessageDialog(null, formatearDivisa.format(dolar) + " Dolares son equivalentes a " + formatearDivisa.format(resultado) + " Pesos.");
                    continuarPrograma = JOptionPane.showConfirmDialog(null, " ¿Desea continuar? ", "", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
                    break;
                case "Libra a Pesos":
                    resultado = libra * 5387;
                    JOptionPane.showMessageDialog(null, formatearDivisa.format(libra) + " Libras son equivalentes a " + formatearDivisa.format(resultado) + " Pesos.");
                    continuarPrograma = JOptionPane.showConfirmDialog(null, " ¿Desea continuar? ", "", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
                    break;
                case "Yen a Pesos":
                    resultado = yen * 29.53;
                    JOptionPane.showMessageDialog(null, formatearDivisa.format(yen) + " Yen son equivalentes a " + formatearDivisa.format(resultado) + " Pesos.");
                    continuarPrograma = JOptionPane.showConfirmDialog(null, " ¿Desea continuar? ", "", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
                    break;
                case "Won a Pesos":
                    resultado = won * 3.23;
                    JOptionPane.showMessageDialog(null, formatearDivisa.format(won) + " Won son equivalentes a " + formatearDivisa.format(resultado) + " Pesos.");
                    continuarPrograma = JOptionPane.showConfirmDialog(null, " ¿Desea continuar? ", "", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
                    break;
            }

            //JOptionPane.showMessageDialog(null, formatearDivisa.format(pesos) + " Pesos COL son equivalentes a " + formatearDivisa.format(resultado) + " " + cambio);
            //continuarPrograma = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        }
    }
}
