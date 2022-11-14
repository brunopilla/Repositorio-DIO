public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
        mostrarStatus();
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        if (ligada) {
            volume++;
            if (volume == 101) {
                volume = 100;
            }
            mostrarStatus();
        }
    }

    public void diminuirVolume() {
        if (ligada) {
            volume--;
            if (volume == -1) {
                volume = 0;
            }
            mostrarStatus();
        }
    }

    public void avancarCanal() {
        if (ligada) {
            canal++;
            if (canal == 101) {
                canal = 1;
            }
            mostrarStatus();
        }
    }

    public void voltarCanal() {
        if (ligada) {
            canal--;
            if (canal == 0) {
                canal = 100;
            }
            mostrarStatus();
        }
    }

    public void mudarCanal(int novoCanal) {
        if (ligada) {
            if (novoCanal > 0 && novoCanal < 101) {
                canal = novoCanal;
                mostrarStatus();
            } else {
                System.out.println("Canal inválido");
            }
        }
    }

    public void mostrarStatus() {
        System.out.println("Samsung\nCanal: " + canal + "\nVolume: " + volume);
    }

}