package modelos;

public class MusicApp {
        /**
         * Muestra cómo podemos usar el patrón de diseño Adapter para
         * permitir la compatibilidad entre interfaces de diferentes clases.
         * En este caso, estamos simulando la existencia de un reproductor
         * de audio que tiene una interfaz diferente a la nuestra. Para
         * poder utilizar ese reproductor, creamos un adaptador que
         * implementa nuestra interfaz y delega las llamadas al reproductor de terceros.
         * Al final, podemos utilizar el reproductor de audio de terceros
         * sin necesidad de modificar el código que lo utiliza.
         */
    public static void main(String[] args) {
        
        MusicPlayer defaultPlayer = new MusicPlayer() {
            /**
             * Reproduce una canción con el reproductor de audio por defecto.
             * @param fileName el nombre del archivo de la canción a reproducir.
             */
            @Override
            public void playSong(String fileName) {
                System.out.println("Reproduciendo canción con MusicPlayer: " + fileName);
            }
        };

        // Usando el reproductor de terceros a través del adaptador.
        ThirdPartyAudioPlayer thirdPartyAudioPlayer = new ThirdPartyAudioPlayer();
        MusicPlayer adaptedPlayer = new AudioPlayerAdapter(thirdPartyAudioPlayer);

        // Reproduciendo una canción con el reproductor original.
        defaultPlayer.playSong("cancion1.mp3");

        // Reproduciendo una canción con el reproductor de terceros adaptado.
        adaptedPlayer.playSong("cancion2.mp3");
}
}
