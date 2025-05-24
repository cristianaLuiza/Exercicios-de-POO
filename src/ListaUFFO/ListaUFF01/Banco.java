package ListaUFFO.ListaUFF01;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    List<Conta> contas = new ArrayList<>();


    public Conta criarConta(int numero, double saldo, double renda) {
        Boolean contaEspecial = false;
        if (renda > 1000) {
            contaEspecial = true;
        } else {
            contaEspecial = false;
        }
        double limite = 0;
        if (renda > 500) {
            limite = 2 * renda;
        } else if (renda > 5000) {
            limite = 3 * renda;
        } else if (renda > 100000) {
            limite = 10 * renda;
        }
        Conta conta1 = new Conta(numero, saldo, renda, limite, contaEspecial);
        this.contas.add(conta1);

        return conta1;
    }

    public void excluirConta(int numero) {
        Conta contaSelecionada = null;
        for (int i = 0; i < contas.size(); i++) {
            Conta excluirConta = contas.get(i);
            if (excluirConta.getNumeroConta() == numero) {
                contaSelecionada = excluirConta;
            }
        }
        if (contaSelecionada != null) {
            this.contas.remove(contaSelecionada);

        } else {
            System.out.println("ERRO: conta não existe para ser removida");
        }

    }

    public double sacarDinheiro(Conta conta, double saque) {
        for (int i = 0; i < contas.size(); i++) {
            Conta pegarConta = contas.get(i);
            if (pegarConta.getNumeroConta() == conta.getNumeroConta()) {
                if (saque > conta.getSaldo()) {
                    System.out.println("Erro saldo insuficiente");
                } else {
                    saque = conta.getSaldo() - saque;
                    conta.setSaldo(saque);
                }
            }else {
                System.out.println("ERRO: essa conta não pertence a esse banco");
            }
        }

        return saque;

    }

    public double depositarDinheiro(Conta conta, double deposito) {
        deposito = conta.getSaldo() + deposito;
        conta.setSaldo(deposito);
        return deposito;
    }

    public String verificarSaldo(Conta conta) {
        if (conta.getSaldo() < 0) {
            return "Saldo infuficiênte";
        } else {
            return "Saldo suficiente";
        }
    }

    public boolean verificarContaEspecial(Conta conta) {
        if (conta.getEspecial() == true) {
            return true;
        } else {
            return false;
        }
    }


}
