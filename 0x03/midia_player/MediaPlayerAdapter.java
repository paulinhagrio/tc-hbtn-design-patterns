public class MediaPlayerAdapter implements MediaPlayer{


    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerAdapter() {
            advancedMediaPlayer = new VideoMediaPlayer();
    }

    @Override
    public void reproduzir(TipoMedia tipoMedia, String nomeArquivo){
        if(tipoMedia == TipoMedia.MP4){
            advancedMediaPlayer.reproduzirMP4(nomeArquivo);
        }
        else if(tipoMedia == TipoMedia.VLC){
            advancedMediaPlayer.reproduzirVlc(nomeArquivo);
        }
    }
}
