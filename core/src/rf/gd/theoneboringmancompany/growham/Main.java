package rf.gd.theoneboringmancompany.growham;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.ExtendViewport;

import rf.gd.theoneboringmancompany.growham.screens.LogoScreen;

public class Main extends Game {
	public SpriteBatch batch;
	public BitmapFont fontOrdinary;
	public BitmapFont fontWarning;
	public OrthographicCamera camera;
	public ExtendViewport viewport;
	public AssetManager manager;

	public float CameraHeight = 810;
	public float CameraWidth = 1440;

	public int height;
	public int width;


	@Override
	public void create() {
		batch = new SpriteBatch();

		camera = new OrthographicCamera();

		fontOrdinary = new BitmapFont(Gdx.files.internal("BitmapFonts/OrdinaryText/ordinarytext.fnt"));
		fontWarning = new BitmapFont(Gdx.files.internal("BitmapFonts/WarningText/warningtext.fnt"));

		height = Gdx.graphics.getHeight();
		width = Gdx.graphics.getWidth();

		//CameraWidth = width / (height/CameraHeight);

		camera.setToOrtho(false, CameraWidth, CameraHeight);


		camera.position.set(camera.viewportWidth / 2, camera.viewportHeight / 2, 0);


		viewport = new ExtendViewport(camera.viewportWidth, camera.viewportHeight, camera);

		this.setScreen(new LogoScreen(this));
	}

	@Override
	public void dispose () {
		super.dispose();
		fontOrdinary.dispose();
		fontWarning.dispose();
	}
}
