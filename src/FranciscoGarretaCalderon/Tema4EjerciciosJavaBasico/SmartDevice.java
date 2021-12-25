package FranciscoGarretaCalderon.Tema4EjerciciosJavaBasico;

public class SmartDevice {

    public static void main(String[] args) {

        SmartDevice device = new SmartDevice("Samsung", "S4", "Android 8.0", "Litio, integrada");
        System.out.println(device);
        SmartPhone phone = new SmartPhone("Alcatel", "Vintage", "Android 7.0", "Litio, extraíble", "Tipo C", "Orange");
        System.out.println(phone);
        SmartWatch watch = new SmartWatch("Casio", "Calculadora", "Wear OS", "Litio, integrada", true, false);
        System.out.println(watch);

    }

    String marca;
    String modelo;
    String sistemaOperativo;
    String tipoDeBateria;

    public SmartDevice(){}

    public SmartDevice(String marca, String modelo, String sistemaOperativo, String tipoDeBateria) {

        this.marca = marca;
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
        this.tipoDeBateria = tipoDeBateria;

    }

    @Override public String toString() {

        return "SmartDevice: Marca='" + marca + "', Modelo= '" + modelo + "', Sistema operativo= '" + sistemaOperativo + "', Tipo de batería= '" + tipoDeBateria + "'";

    }

    public static class SmartPhone extends SmartDevice {

        String tipoDeCargador;
        String operadorMovil;

        public SmartPhone(){}

        public SmartPhone(String marca, String modelo, String sistemaOperativo, String tipoDeBateria, String tipoDeCargador, String operadorMovil) {

            super(marca, modelo, sistemaOperativo, tipoDeBateria);
            this.tipoDeCargador = tipoDeCargador;
            this.operadorMovil = operadorMovil;

        }

        @Override public String toString() {

            return "SmartPhone: Marca= '" + marca + "', Modelo= '" + modelo + "', Sistema operativo= '" + sistemaOperativo + "', Tipo de batería= '" + tipoDeBateria + "', Tipo de cargador= '" + tipoDeCargador + "', Tipo de cargador= '" + operadorMovil + "'";

        }

    }

    public static class SmartWatch extends SmartDevice {

        boolean pulsioximetro;
        boolean termometro;

        public SmartWatch(){}

        public SmartWatch(String marca, String modelo, String sistemaOperativo, String tipoDeBateria, boolean pulsioximetro, boolean termometro) {

            super(marca, modelo, sistemaOperativo, tipoDeBateria);
            this.pulsioximetro = pulsioximetro;
            this.termometro = termometro;

        }

        @Override public String toString() {

            return "SmartWatch: Marca='" + marca + "', Modelo= '" + modelo + "', Sistema operativo= '" + sistemaOperativo + "', Tipo de batería= '" + tipoDeBateria + "', Tiene pulsioximetro= '" + pulsioximetro + "', Tiene termómetro= '" + termometro + "'";

        }

    }

}