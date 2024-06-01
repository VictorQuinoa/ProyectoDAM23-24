package Model.Musica;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;



public class MusicaFondo {
    Random rm = new Random();

    public static int statusApp = 0;
    private AdminMusic adm = new AdminMusic();
    List <String> listSongChill;
    List <String> listSongFast;

    private void initListSongChill(){
        listSongChill = List.of("Decorativos/pistasAudio/Chill/[Persona 4 OST] 02 - A Corner of Memories.wav",
        "Decorativos/pistasAudio/Chill/[Persona 4 OST] 06 - Signs Of Love.wav",
        "Decorativos/pistasAudio/Chill/After the Battle - Persona 3 Reload Original Soundtrack.wav",
        "Decorativos/pistasAudio/Chill/Fallout New Vegas Radio - Hallo Mister X.wav",
        "Decorativos/pistasAudio/Chill/Fallout New Vegas Radio - Jazz Club Blues.wav",
        "Decorativos/pistasAudio/Chill/Fallout New Vegas Radio - Slow Sax.wav",
        "Decorativos/pistasAudio/Chill/Iwatodai Dorm -Reload- - Persona 3 Reload Original Soundtrack.wav",
        "Decorativos/pistasAudio/Chill/This Mysterious Feeling - Persona 3 Reload Original Soundtrack.wav",
        "Decorativos/pistasAudio/Chill/Yakuza 0 OST - 27 Fever Time.wav"
        );
    }
    private void initListSongFast(){
        listSongFast = new ArrayList<>();
        listSongFast.add("Decorativos/pistasAudio/Fast/Yakuza 0 OST - 27 Fever Time.wav");
        listSongFast.add("Decorativos/pistasAudio/Fast/[Persona 4 OST] 08 - Your Affection.wav");
        listSongFast.add("Decorativos/pistasAudio/Fast/[Persona 4 OST] 23 - Sauna.wav");
        listSongFast.add("Decorativos/pistasAudio/Fast/[Persona 4 OST] 27 - specialist.wav");
        listSongFast.add("Decorativos/pistasAudio/Fast/P5 OST 01 Wake Up, Get Up, Get Out There.wav");
        listSongFast.add("Decorativos/pistasAudio/Fast/Persona 5 - The whims of fate Original Lyrics & Sub. Español.wav");
        listSongFast.add("Decorativos/pistasAudio/Fast/Yakuza 0 OST - 15 Customer Creed.wav");
        listSongFast.add("Decorativos/pistasAudio/Fast/Yakuza 0 OST - 57 Breeze Time.wav");
        listSongFast.add("Decorativos/pistasAudio/Fast/Yakuza 0 OST - 80 Queen of the passion.wav");
    }
    public void musicaDeFondo(int statusApp){
        initListSongChill();
        initListSongFast();
        //vemos si está dentro de un juego
        if(statusApp == 1){
            adm.stopMusic();
            adm.playMusic(listSongFast.get(rm.nextInt(listSongFast.size())));
        }
        if(statusApp == 0){
            adm.stopMusic();
            adm.playMusic(listSongChill.get(rm.nextInt(listSongChill.size())));
        }
      

    }

}

