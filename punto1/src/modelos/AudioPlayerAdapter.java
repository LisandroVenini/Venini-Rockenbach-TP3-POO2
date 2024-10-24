package modelos;
public class AudioPlayerAdapter implements MusicPlayer {
    private ThirdPartyAudioPlayer thirdPartyAudioPlayer;

    public AudioPlayerAdapter(ThirdPartyAudioPlayer thirdPartyAudioPlayer) {
        this.thirdPartyAudioPlayer = thirdPartyAudioPlayer;
    }

    /**
     * Reproduce una cancion usando el reproductor de audio de terceros.
     * @param filename el nombre del archivo de audio a reproducir.
     */
    @Override
    public void playSong(String filename) {
        thirdPartyAudioPlayer.startAudio(filename);
    }
}