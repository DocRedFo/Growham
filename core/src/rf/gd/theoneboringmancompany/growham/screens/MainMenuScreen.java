package rf.gd.theoneboringmancompany.growham.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

import rf.gd.theoneboringmancompany.growham.Main;

public class MainMenuScreen implements Screen {
    final Main main;

    private final static float ANIMATION_SPEED = 10/30f;

    private Animation animation;
    private TextureAtlas play, breakAndPlay, scores;
    private Music music;

    public MainMenuScreen(Main main) {
        this.main = main;

        if (main.manager.isLoaded("Audio/Music/Menu.mp3", Music.class)){
            music = main.manager.get("Audio/Music/Menu.mp3", Music.class);
        }
        else {
            music = Gdx.audio.newMusic(Gdx.files.internal("Audio/Music/Menu.mp3"));
        }
        if (main.manager.isLoaded("Pictures/Buttons/Animation/BreakAndPlay/sprite.atlas", TextureAtlas.class)){
            breakAndPlay = main.manager.get("Pictures/Buttons/Animation/Scores/sprite.atlas", TextureAtlas.class);
        }
        else {
            breakAndPlay = new TextureAtlas("Pictures/Buttons/Animation/Scores/sprite.atlas");
        }
        if (main.manager.isLoaded("Pictures/Buttons/Animation/Play/sprite.atlas", TextureAtlas.class)){
            play = main.manager.get("Pictures/Buttons/Animation/Play/sprite.atlas", TextureAtlas.class);
        }
        else {
            play = new TextureAtlas("Pictures/Buttons/Animation/Play/sprite.atlas");
        }
        if (main.manager.isLoaded("Pictures/Buttons/Animation/Scores/sprite.atlas", TextureAtlas.class)){
            scores = main.manager.get("Pictures/Buttons/Animation/Scores/sprite.atlas", TextureAtlas.class);
        }
        else {
            scores = new TextureAtlas("Pictures/Buttons/Animation/Scores/sprite.atlas");
        }

        music.setVolume(5/100f);
        music.setLooping(true);
        music.play();


    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(109/255f, 72/255f, 215/255f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }

    @Override
    public void resize(int width, int height) {
        main.viewport.update(width, height);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        play.dispose();
        breakAndPlay.dispose();
        scores.dispose();
        main.dispose();
    }
}
