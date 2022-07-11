public class MediaPlayerAdapter implements MediaPlayer{
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerAdapter(TipoMedia tipoMedia, String nomeArquivo) {
        if(tipoMedia != TipoMedia.MP3){
            advancedMediaPlayer = new VideoMediaPlayer();
            this.reproduzir(tipoMedia, nomeArquivo);
        }
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
