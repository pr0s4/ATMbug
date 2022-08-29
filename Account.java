package JavATM;
public class Account {
    private double balance;

    // construtor
    public Account(double inicialBalance)
    {
        //Valida que inicialBalance é maior que 0.0;
        //se não, o saldo é inicializado como 0.0;
        if (inicialBalance > 0.0)
        {
            balance = inicialBalance;
        }
    }

    //crediat (adciona) uma quantia à conta
    public void credit(double amount)
    {
        balance = balance + amount;
    }

    //retorna o saldo
    public double getBalance()
    {
        return balance;//fornece o valor de saldo para o método que o chamar
    }
}
