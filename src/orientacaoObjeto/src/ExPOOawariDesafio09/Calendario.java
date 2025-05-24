package orientacaoObjeto.src.ExPOOawariDesafio09;

import java.util.ArrayList;
import java.util.List;

public class Calendario {

    public List<Dias> listarDiasMes(int meses) {
        List<Dias> diasDoMes = new ArrayList<>();
        switch (meses) {
            case 1:
                for (int i = 1; i <= 31; i++) {
                    boolean feriado = false;
                    if (i == 1) {
                        feriado = true;
                    }
                    Dias dia = new Dias(i, feriado);
                    diasDoMes.add(dia);
                }
                break;

            case 2:
                for (int i = 1; i <= 28; i++) {
                    boolean feriado = false;
                    Dias dia = new Dias(i, feriado);
                    diasDoMes.add(dia);
                }
                break;
            case 3:
                for (int i = 1; i <= 31; i++) {
                    boolean feriado = false;
                    if (i == 4) {
                        feriado = true;
                    }
                    Dias dia = new Dias(i, feriado);
                    diasDoMes.add(dia);
                }
                break;
            case 4:
                for (int i = 1; i <= 30; i++) {
                    boolean feriado = false;
                    if (i == 18) {
                        feriado = true;
                    }
                    Dias dia = new Dias(i, feriado);
                    diasDoMes.add(dia);
                }
                break;
            case 5:
                for (int i = 1; i <= 31; i++) {
                    boolean feriado = false;
                    if (i == 1) {
                        feriado = true;
                    }
                    Dias dia = new Dias(i, feriado);
                    diasDoMes.add(dia);
                }
                break;
            case 6:
                for (int i = 1; i <= 30; i++) {
                    boolean feriado = false;
                    if (i == 19) {
                        feriado = true;
                    }
                    Dias dia = new Dias(i, feriado);
                    diasDoMes.add(dia);
                }
                break;
            case 7:
                for (int i = 1; i <= 31; i++) {
                    boolean feriado = false;
                    Dias dia = new Dias(i, feriado);
                    diasDoMes.add(dia);
                }
                break;
            case 8:
                for (int i = 1; i <= 30; i++) {
                    boolean feriado = false;
                    Dias dia = new Dias(i, feriado);
                    diasDoMes.add(dia);
                }
                break;
            case 9:
                for (int i = 1; i <= 30; i++) {
                    boolean feriado = false;
                    if (i == 7) {
                        feriado = true;
                    }
                    Dias dia = new Dias(i, feriado);
                    diasDoMes.add(dia);
                }
                break;
            case 10:
                for (int i = 1; i <= 31; i++) {
                    boolean feriado = false;
                    if (i == 12) {
                        feriado = true;
                    }
                    Dias dia = new Dias(i, feriado);
                    diasDoMes.add(dia);
                }
                break;
            case 11:
                for (int i = 1; i <= 30; i++) {
                    boolean feriado = false;
                    if (i == 20) {
                        feriado = true;
                    }
                    Dias dia = new Dias(i, feriado);
                    diasDoMes.add(dia);
                }
                break;
            case 12:
                for (int i = 1; i <= 31; i++) {
                    boolean feriado = false;
                    if (i == 25) {
                        feriado = true;
                    }
                    Dias dia = new Dias(i, feriado);
                    diasDoMes.add(dia);
                }
                break;
            default:
                return new ArrayList<>(); //LISTA VAZIA
        }
        return diasDoMes;
    }


    /*
        Receber o dia e o mes do usuário;
        Salvar em uma variavel, os dias existentes de um determinado mês;
        Verificar se o dia recebido como parametro é feriado ou não;
        Se for feriado,
            exibir uma mensagem de que é feriado;
        Senão,
            exibir uma mensagem de que é dia comum;
     */

    public String verificarFeriado(int mes, int dia) { // mes = fevereiro, dia = 100
        List<Dias> diasMes = listarDiasMes(mes);
        for (int i = 1; i < diasMes.size(); i++) {
            Dias diaMes = diasMes.get(i);
            int data = diaMes.getData();
            if (data == dia) {
                if (diaMes.getFeriado() == true) {
                    return "É feriado";
                } else {
                    return "Dia comum";
                }
            }
        }
        return "Data inválida";
    }

    //  se meses iguais,
    //      vou tratar o maior e fazer a sub dos dias;
    //  se não os meses são !=
    //      salvar a lista de dias de cada um deses meses em variáveis separadas
    //      depois vou precisar decobrir para cada mês a != de dias entre a data escolhida e o total de dias daquele mês
    //      por fim vou somar a diferença dos dois meses


    public int calcularDiferencaDatas(int dia1, int mes1, int dia2, int mes2) {
        int diferenca = 0;
        if (mes1 == mes2) {

            if (dia1 > dia2) {
                 diferenca = dia1 - dia2;
            } else {
                 diferenca = dia2 - dia1;
            }
        } else if (mes1 != mes2) {
            List<Dias> diasMes1 = listarDiasMes(mes1);
            List<Dias> diasMes2 = listarDiasMes(mes2);
            int diferenca1 = diasMes1.size() - dia1;
            int diferenca2 = diasMes2.size() - dia2;

            diferenca = diferenca1 + diferenca2;
        }
        return diferenca;
    }
}
// “Calendario” que represente um calendário anual.
// Essa classe deve ter métodos para exibir o calendário
// de um determinado mês, verificar se uma data é feriado
// e calcular a diferença de dias entre duas datas.
