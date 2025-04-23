public class CajeroAutomatico {
    private double saldo = 0;

    public CajeroAutomatico(double saldo){
        this.saldo = saldo;
    }

    public void depositarDinero (double cantidad){
      saldo += cantidad;
    }

    public void retirarDinero(double cantidad){
        if(saldo >= cantidad) {
            saldo -= cantidad;
        }else{
            System.out.println("No puedes retirar más dinero del que tienes :");
        }
    }
    public double consultarSaldo (){
        return saldo;
    }

    public void mostrarMenu(){
        System.out.println("Bienvenido al cajero automatico \n 1. Consultar saldo\t 2. Depositar dinero\t 3. Retirar dinero\t 4.Salir");
    }
}
