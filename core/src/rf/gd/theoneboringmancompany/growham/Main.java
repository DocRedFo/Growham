package rf.gd.theoneboringmancompany.growham;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

public class Main extends Game {
	public SpriteBatch batch;
	public BitmapFont fontOrdinary;
	public BitmapFont fontWarning;
	public Pixmap pix;
	public Texture img;
	public Animation animation;
	public TextureAtlas atlas;

	public int height;
	public int weight;
	public double density;
	public String densityFile;

	@Override
	public void create() {
		batch = new SpriteBatch();
		fontOrdinary = new BitmapFont(Gdx.files.internal("BitmapFonts/OrdinaryText/ordinarytext.fnt"));
		fontWarning = new BitmapFont(Gdx.files.internal("BitmapFonts/WarningText/warningtext.fnt"));
		height = Gdx.graphics.getHeight();
		weight = Gdx.graphics.getWidth();
		density = Gdx.graphics.getDensity();
		if (density > 1.5) density = 1.5;
		densityFile = Double.toString(density);
		//this.setScreen();
	}

	@Override
	public void dispose () {
		batch.dispose();
		fontOrdinary.dispose();
		fontWarning.dispose();
		pix.dispose();
		atlas.dispose();
	}
}
