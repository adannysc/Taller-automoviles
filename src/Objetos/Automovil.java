
package Objetos;

public class Automovil {
        
    private String marca;
    private Integer modelo;
    private Double motor;
    private String combustible;
    private String tipo;
    private Integer puertas;
    private Integer asientos;
    private Integer velocidad_maxima;
    private String color;
    private Integer velocidad_actual;

public Automovil (String marca, Integer modelo, Double motor, String combustible, String tipo, Integer puertas, Integer asientos, Integer velocidad_maxima, String color, Integer velocidad_actual) {
    this.marca = marca;
    this.modelo = modelo;
    this.motor = motor;
    this.combustible = combustible;
    this.tipo = tipo;
    this.puertas = puertas;
    this.asientos = asientos;
    this.velocidad_maxima = velocidad_maxima;
    this.color = color;
    this.velocidad_actual = velocidad_actual;
    }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public Integer getModelo() {
            return modelo;
        }

        public void setModelo(Integer modelo) {
            this.modelo = modelo;
        }

        public Double getMotor() {
            return motor;
        }

        public void setMotor(Double motor) {
            this.motor = motor;
        }

        public String getCombustible() {
            return combustible;
        }

        public void setCombustible(String combustible) {
            this.combustible = combustible;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public Integer getPuertas() {
            return puertas;
        }

        public void setPuertas(Integer puertas) {
            this.puertas = puertas;
        }

        public Integer getAsientos() {
            return asientos;
        }

        public void setAsientos(Integer asientos) {
            this.asientos = asientos;
        }

        public Integer getVelocidad_maxima() {
            return velocidad_maxima;
        }

        public void setVelocidad_maxima(Integer velocidad_maxima) {
            this.velocidad_maxima = velocidad_maxima;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public Integer getVelocidad_actual() {
            return velocidad_actual;
        }

        public void setVelocidad_actual(Integer velocidad_actual) {
            this.velocidad_actual = velocidad_actual;
        }


    public void acelerar(Integer aumentar) {
        if (velocidad_actual + aumentar > velocidad_maxima) {
            velocidad_actual = velocidad_maxima;
            System.out.println("Has acelerado hasta el maximo de " +
                    velocidad_maxima + " Km/h");
        } else {
            velocidad_actual = velocidad_actual + aumentar;
            System.out.println("Aceleraste hasta la velocidad de " +
                    velocidad_actual + " Km/h");
        }
    }
    
    public void desacelerar(Integer disminuir){
        if (velocidad_actual - disminuir < 0) {
            velocidad_actual = 0;
            System.out.println("Te has detenido.");
        } else {
            velocidad_actual = velocidad_actual - disminuir;
            System.out.println("Disminuiste la velocidad hasta " +
                    velocidad_actual + " Km/h.");
        }
    }
    
    public void frenar(){
        velocidad_actual = 0;
        System.out.println("Has frenado por completo");
    }
    public void destino(Integer distancia){
        if (velocidad_actual > 0) {
            Integer destino = distancia / velocidad_actual;
            System.out.println("El destino está a = " + destino + " h");
        } else {
            System.out.println("El carro está detenido y asi no llegara al"
                    + " destino");
        }
    }
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nMarca = ").append(marca);
        sb.append("\nModelo = ").append(modelo);
        sb.append("\nMotor = ").append(motor);
        sb.append("\nTipo de combustible = ").append(combustible);
        sb.append("\nTipo de carro = ").append(tipo);
        sb.append("\nNumero de Puertas = ").append(puertas);
        sb.append("\nNumero de Asientos = ").append(asientos);
        sb.append("\nVelocidad Maxima = ").append(velocidad_maxima);
        sb.append("\nColor = ").append(color);
        sb.append("\nVelocidad Actual = ").append(velocidad_actual);
        return sb.toString();
    } 

    
}
