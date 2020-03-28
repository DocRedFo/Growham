package rf.gd.theoneboringmancompany.growham.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

import rf.gd.theoneboringmancompany.growham.Main;

public class LogoScreen implements Screen {
    private final Main main;

    private Texture img;
    private Music sound;

    public LogoScreen(Main main) {
        this.main = main;

        img = new Texture("Pictures/Other/Logo/logo.png");

        main.fontOrdinary.setColor(Color.WHITE);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        sound = Gdx.audio.newMusic(Gdx.files.internal("Audio/UI/ok.mp3"));

        main.manager = new AssetManager();

        main.manager.load("Audio/Music/Menu.mp3", Music.class);
        main.manager.load("Pictures/Buttons/Animation/BreakAndPlay/sprite.atlas", TextureAtlas.class);
        main.manager.load("Pictures/Buttons/Animation/Play/sprite.atlas", TextureAtlas.class);
        main.manager.load("Pictures/Buttons/Animation/Scores/sprite.atlas", TextureAtlas.class);

        main.camera.update();
        main.batch.setProjectionMatrix(main.camera.combined);
        main.batch.begin();
        main.batch.draw(img, 0, 0);
        main.fontOrdinary.draw(main.batch, "Нажмите для начала | Tap to begin", main.camera.viewportWidth/2,
                main.camera.viewportHeight / 10);
        main.batch.end();

        sound.setLooping(false);
        sound.setVolume(30/100f);

        if (Gdx.input.isTouched()){
            sound.play();
            main.setScreen(new MainMenuScreen(main));
            dispose();
        }

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
        main.dispose();
        img.dispose();
        sound.dispose();
    }
}
