
public class CrearCheque {

    //caracter[0] = unidades, caracter[1] = decenas + unidades
    //caracter[2] = decenas , /caracter[3]= centenas
    public String generarLetraExp(int centenas,int millares, int millones) {
        String letra = "";
        int conteo = 2;
        int[] valores = new int[3];
        String[] diezEsp = {"once", "doce", "trece", "catorce", "quince"};
        String[][] caracter = {
            {"un", "dos", "tres", "cuatro", "cinco",
                "seis", "siete", "ocho", "nueve"},
            {"dieci", "veinti", "treinta y ", "cuarenta y ", "cincuenta y ",
                "sesenta y ", "setenta y ", "ochenta y ", "noventa y "},
            {"diez", "veinte", "treinta", "cuarenta",
                "cincuenta", "sesenta", "setenta", "ochenta", "noventa"},
            {"ciento", "doscientos", "trescientos",
                "cuatrocientos", "quinientos", "seiscientos", "setecientos",
                "ochocientos", "novecientos"}
        };
        while (conteo != -1) {
            if (conteo == 2) {
                valores[2] = (millones % 1000) / 100;
                valores[1] = (millones % 100) / 10;
                valores[0] = millones % 10;
            }
            if (conteo == 1) {
                valores[2] = (millares % 1000) / 100;
                valores[1] = (millares % 100) / 10;
                valores[0] = millares % 10;
            }
            if (conteo == 0) {
                valores[2] = (centenas % 1000) / 100;
                valores[1] = (centenas % 100) / 10;
                valores[0] = centenas % 10;
            }
            if (valores[2] > 0) {
                if (valores[2] == 1 && valores[1] == 0 && valores[0] == 0) {
                    letra += "cien" + " ";
                } else if (valores[1] == 0 && valores[0] > 0) {
                    letra += caracter[3][valores[2] - 1] + " " + caracter[0][valores[0] - 1] + " ";
                } else {
                    letra += caracter[3][valores[2] - 1] + " ";
                }
            }
            if (valores[1] > 0) {
                if (valores[0] == 0) {
                    letra += caracter[2][valores[1] - 1] + " ";
                } else if (valores[1] == 1 && (valores[0] > 0 && valores[0] < 6)) {
                    letra += diezEsp[valores[0] - 1] + " ";
                } else {
                    letra += caracter[1][valores[1] - 1] + caracter[0][valores[0] - 1] + " ";
                }
            }
            if (valores[0] > 0) {
                if (valores[0] == 1 && valores[1] == 0 && valores[2] == 0) {
                    if (millones == 1 && conteo == 2) {
                        letra += caracter[0][valores[0] - 1] + " millon";
                    }
                    if (millares == 1 && conteo == 1) {
                        letra += "mil";
                    }
                    if (centenas == 1 && conteo == 0) {
                        letra += caracter[0][valores[0] - 1];
                    }
                } else if (valores[1] == 0 && valores[2] == 0) {
                    letra += caracter[0][valores[0] - 1] + " ";
                }
            }
            if (conteo == 2 && millones > 1) {
                letra += "millones";
            }
            if (conteo == 1 && millares > 1) {
                letra += "mil";
            }
            if (!letra.isEmpty()) {
                letra += "\n";
            }
            conteo--;
        }
        return letra.trim();
    }

}
