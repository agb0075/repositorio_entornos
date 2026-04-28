/**
     * <p>Alejandro Gómez Bermudo - <a href="https://github.com/agb0075">GitHub</a></p>
     * <p>Fecha: 2026-04-28</p>
     * <p>Descripción: Clase que valida si una fecha es correcta o no.</p>
     * @author Alejandro
     * @version 1.0
     * @since 1.0
*/

public class ValidarFecha {
    /**
     * @param dia Numero del dia, debe ser entre 1 y 31.
     * @param mes Numero del mes, debe ser entre 1 y 12.
     * @param anio Numero del dia, debe ser entre 1900 y 2026.
     * @return true: si la fecha es válida; false: si la fecha es incorrecta.
     * @throws IllegalArgumentException si el codigo falla
     */
    
    public boolean fechaValida(int dia, int mes, int anio) {
        if (anio < 1900 || anio > 2026) {
            return false;
        }

        if (mes < 1 || mes > 12) {
            return false;
        }

        int diasMaximos = 31;

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            diasMaximos = 30;
        } else if (mes == 2) {
            if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                diasMaximos = 29;
            } else {
                diasMaximos = 28;
            }
        }

        if (dia < 1 || dia > diasMaximos) {
            return false;
        }

        if (anio == 2026) {
            if (mes > 4) {
                return false;
            }
            if (mes == 4 && dia > 20) {
                return false;
            }
        }
        return true;
    }
}