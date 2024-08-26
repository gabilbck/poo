package e_3;

public class Principal {
    public static void main(String[] args) {
        Calculo calculo = new Calculo();
        Mes mes1 = new Mes();
        mes1.setNomeMes("Janeiro");
        mes1.setGastoMes(13500);

        Mes mes2 = new Mes();
        mes2.setNomeMes("Fevereiro");
        mes2.setGastoMes(23400);

        Mes mes3 = new Mes();
        mes3.setNomeMes("Março");
        mes3.setGastoMes(19000);
    
        calculo.setCalcTotal(mes1.getGastoMes() + mes2.getGastoMes() + mes3.getGastoMes());
        calculo.setCalcMedia(calculo.getCalcTotal() / 3);

        System.out.println("Total: " + calculo.getCalcTotal() + " Média: " + calculo.getCalcMedia());
    }
}
