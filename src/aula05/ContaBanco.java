package aula05;

import java.util.Random;

public class ContaBanco {
    public int numConta;
    protected String tipoConta;
    private String titularConta;
    private boolean statusConta;
    private double saldoConta;
    private int digitoAgencia;

    public ContaBanco() {
        this.statusConta = false;
        this.saldoConta = 0;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    public boolean isStatusConta() {
        return statusConta;
    }

    public void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public int getDigitoAgencia() {
        return digitoAgencia;
    }

    public void setDigitoAgencia(int digitoAgencia) {
        this.digitoAgencia = digitoAgencia;
    }

    public void abrirConta(String titularConta, String tipoConta) {
        if (isStatusConta()) {
            System.out.println(getTipoConta() + " você já tem uma conta aberta!!" );
        } else {
            setTitularConta(titularConta);
            setTipoConta(tipoConta.toUpperCase());
            setStatusConta(true);
            setDigitoAgencia(sorteiaDigitoConta());
            setNumConta(sorteiaNumeroConta());
            if (getTipoConta().equals("CP")) {
                setSaldoConta(150);
            } else if (getTipoConta().equals("CC")) {
                setSaldoConta(50);
            } else {
                System.out.println("Tipo de conta inválido");
            }
        }
    }

    public void fecharConta() {
        if (isStatusConta()) {
            if (getSaldoConta() > 0) {
                System.out.println("Primeiro saque seu saldo de: " + getSaldoConta());
                System.out.println("Para fechar a conta!!");
            } else if (getSaldoConta() < 0) {
                System.out.println("HAHA Achamos um caloteiro!!");
                System.out.println("Você está devendo: " + getSaldoConta());
                System.out.println("Pague a gente para fechar a sua conta SAFADO!");
            } else {
                System.out.println("Que pena que você vai embora =(");
                setStatusConta(false);
            }
        } else {
            System.out.println("Sua conta já está fechada!");
        }
    }

    public void depositar(double valorDeposito) {
        if (isStatusConta()) {
            if (valorDeposito > 0) {
                setSaldoConta(getSaldoConta() + valorDeposito);
                System.out.println(valorDeposito + " Depositado!");
            } else {
                System.out.println("Não é possível depositar um valor negativo!!");
            }
        } else {
            System.out.println("Primeiro abra uma conta!! Para depositar.");
        }

    }

    public void sacar(double valorASacar) {
        boolean ehPossivelSacar = getSaldoConta() >= valorASacar ;
        if (isStatusConta()) {
            if (ehPossivelSacar) {
                setSaldoConta(getSaldoConta() - valorASacar);
                System.out.println("Você sacou: " + valorASacar + "\nAgora seu saldo é: " + getSaldoConta());
            } else {
                System.out.println("O valor do saque de: " + valorASacar + "\nÉ maior que seu saldo: " + getSaldoConta());
            }
        } else {
            System.out.println("Primeiro abra uma conta!! Para realizar o saque.");
        }
    }

    public void pagarMensal() {
        double valorAPagar = 0;
        if (isStatusConta()) {
            if (getTipoConta().equals("CP")) {
                valorAPagar += 20;
            } else if (getTipoConta().equals("CC")) {
                valorAPagar += 12;
            } else {
                System.out.println("Tipo de Conta inválido!!");
            }
            if (saldoConta > valorAPagar) {
                setSaldoConta(getSaldoConta() - valorAPagar);
                System.out.println("Mensalidade paga!\nAgora seu saldo é: " + getSaldoConta());
            } else {
                System.out.println("Seu saldo na conta é menor que o valor de mensalidade!!");
            }

        } else {
            System.out.println("Primeiro abra uma conta!!!");
        }
    }

    public void statusConta() {
        System.out.println("----------------------------------");
        System.out.println("|Número Conta:  " + getNumConta());
        System.out.println("|Dígito Conta:  " + getDigitoAgencia());
        System.out.println("|Tipo Conta:    " + getTipoConta());
        System.out.println("|Status Conta:  " + isStatusConta());
        System.out.println("|Titular Conta: " + getTitularConta());
        System.out.println("|Saldo Conta:   " + getSaldoConta());
        System.out.println("----------------------------------");

    }


    private int sorteiaDigitoConta() {
        Random random = new Random();
        int numTresDigitAleatorios = random.nextInt(899) + 100;
        return numTresDigitAleatorios;
    }

    private int sorteiaNumeroConta() {
        Random random = new Random();
        int numCincoDigitAleatorios = random.nextInt(89999 + 10000);
        return numCincoDigitAleatorios;
    }
}
