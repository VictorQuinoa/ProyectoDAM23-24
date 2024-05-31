package Model.Musica;
import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;

public class AdminMusic {
    private float dB;
    private float volume = 0.7f;
    protected static Clip musicClip;
    /**
     * Método para poner música
     * @param pathFile url del archivo
     */
    public void playSound(String pathFile ) {
        try {
            // Abrir un audio input stream
            URL url = this.getClass().getClassLoader().getResource(pathFile);
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);

            // Obtener un clip de sonido
            Clip clip = AudioSystem.getClip();

            // Abrir el clip de audio y cargar muestras de audio del audio input stream
            clip.open(audioIn);

            // Obtener el control de volumen
            FloatControl volumeControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);

            // Convertir el volumen en decibelios
             dB = (float) (Math.log(volume) / Math.log(10.0) * 20.0);
            volumeControl.setValue(dB);

            // Iniciar la reproducción
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void playMusic(String musicFile) {
        try {
            // Si la música ya está sonando, no inicia la reproducción
            if (musicClip != null && musicClip.isRunning()) {
                return;
            }

            URL url = this.getClass().getClassLoader().getResource(musicFile);
            AudioInputStream ais = AudioSystem.getAudioInputStream(url);
            musicClip = AudioSystem.getClip();
            musicClip.open(ais);
            FloatControl volumeControl = (FloatControl) musicClip.getControl(FloatControl.Type.MASTER_GAIN);
            float dB = (float) (Math.log(volume) / Math.log(10.0) * 20.0);
            volumeControl.setValue(dB);
            musicClip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    //para parar la música cuando esté lo suficiente baja
    public void stopMusic() {
        if (musicClip != null && musicClip.isRunning()) {
            musicClip.stop();
        }
    }

    /**
     *
     * @return db para poder manejarlo mejor
     */
    public float getdB() {
        return dB;
    }

    /**
     *
     * @param dB para poder modificar gradualmente el volumen
     */
    public void setdB(float dB) {
        this.dB = dB;
    }

}