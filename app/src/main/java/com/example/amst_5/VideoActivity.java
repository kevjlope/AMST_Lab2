package com.example.amst_5;

import androidx.appcompat.app.AppCompatActivity;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

//Esta clase se encarga de mostrar el video de youtube y botones "play","volver"
public class VideoActivity extends YouTubeBaseActivity {

    private static final String TAG="Main2Activity";

    //DeclaraciÃ³n de variables
    YouTubePlayerView mYoutubePlayerView;
    Button btnPlay;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        Log.d(TAG,"onCreate:Starting");

        //Obtenemos el botÃ³n play
        btnPlay=(Button) findViewById(R.id.btnPlay);

        //creamos un nuevo objeto YouTubePlayerView y lo inicializamos para poder mostrarlo en pantalla
        mYoutubePlayerView=(YouTubePlayerView) findViewById(R.id.youtubePlay);
        mOnInitializedListener= new YouTubePlayer.OnInitializedListener() {
            @Override

            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                Log.d(TAG,"onClick: Done initializing.");
                youTubePlayer.loadVideo("Pkh8UtuejGw");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.d(TAG,"onClick: Fail to initialize.");
            }
        };

        //Asignamos el evento para el botÃ³n play (iniciar la reproduccion del video)
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"onClick: Initializing Youtube Player.");
                mYoutubePlayerView.initialize(YoutubeConfig.getApiKey(),mOnInitializedListener);
                Log.d(TAG,"onClick: Done initializing.");
            }
        });

    }
    ////Metodo para el boton volver (regresar a la pantalla principal)
    public void volver(View view) {
        finish();
    }
}
