public class Geladeira {

    private boolean ligada;
    private int temperatura;       // em graus Celsius
    private boolean portaAberta;
    private boolean modoTurbo;

    public Geladeira() {
        this.ligada = false;
        this.temperatura = 5; // temperatura padrão
        this.portaAberta = false;
        this.modoTurbo = false;
    }

    public void ligar() {
        ligada = true;
        System.out.println("Geladeira ligada.");
    }

    public void desligar() {
        ligada = false;
        modoTurbo = false;
        System.out.println("Geladeira desligada.");
    }

    public void abrirPorta() {
        portaAberta = true;
        System.out.println("Porta da geladeira aberta.");
    }

    public void fecharPorta() {
        portaAberta = false;
        System.out.println("Porta da geladeira fechada.");
    }

    public void ajustarTemperatura(int graus) {
        if (ligada && graus >= -5 && graus <= 10) {
            temperatura = graus;
            System.out.println("Temperatura ajustada para " + graus + "ºC.");
        } else {
            System.out.println("Temperatura inválida ou geladeira desligada.");
        }
    }

    public void ativarModoTurbo() {
        if (ligada) {
            modoTurbo = true;
            System.out.println("Modo Turbo ativado.");
        } else {
            System.out.println("Ligue a geladeira antes de ativar o modo Turbo.");
        }
    }

    public void desativarModoTurbo() {
        modoTurbo = false;
        System.out.println("Modo Turbo desativado.");
    }

    public void exibirStatus() {
        System.out.println("\n--- Status da Geladeira ---");
        System.out.println("Ligada: " + (ligada ? "Sim" : "Não"));
        System.out.println("Temperatura: " + temperatura + "ºC");
        System.out.println("Porta Aberta: " + (portaAberta ? "Sim" : "Não"));
        System.out.println("Modo Turbo: " + (modoTurbo ? "Ativado" : "Desativado"));
        System.out.println("---------------------------\n");
    }

    public static void main(String[] args) {
        Geladeira minhaGeladeira = new Geladeira();

        minhaGeladeira.exibirStatus();
        minhaGeladeira.ligar();
        minhaGeladeira.abrirPorta();
        minhaGeladeira.ajustarTemperatura(3);
        minhaGeladeira.fecharPorta();
        minhaGeladeira.ativarModoTurbo();
        minhaGeladeira.exibirStatus();

        minhaGeladeira.desativarModoTurbo();
        minhaGeladeira.desligar();
        minhaGeladeira.exibirStatus();
    }
}
