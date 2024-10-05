public class Nave {
        private String nombre;
        private int fila;
        private String columna;
        private boolean estado;
        private int puntos;
        // Constructor con parámetros
        public Nave(String nombre, int fila, String columna, boolean estado, int puntos) {
            this.nombre = nombre;
            this.fila = fila;
            this.columna = columna;
            this.estado = estado;
            this.puntos = puntos;
        }
    
        // Métodos getters
        public String getNombre() {
            return nombre;
        }
    
        public int getFila() {
            return fila;
        }
    
        public String getColumna() {
            return columna;
        }
    
        public boolean getEstado() {
            return estado;
        }
    
        public int getPuntos() {
            return puntos;
        }
    
        // Métodos setters
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
        public void setFila(int fila) {
            this.fila = fila;
        }
    
        public void setColumna(String columna) {
            this.columna = columna;
        }
    
        public void setEstado(boolean estado) {
            this.estado = estado;
        }
    
        public void setPuntos(int puntos) {
            this.puntos = puntos;
        }
        public String toString() {
            return "Nombre: " + nombre + ", Fila: " + fila + ", Columna: " + columna +
                    ", Estado: " + estado + ", Puntos: " + puntos;
        }
    }
    
    

