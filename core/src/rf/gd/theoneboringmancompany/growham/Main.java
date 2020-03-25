package rf.gd.theoneboringmancompany.growham;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

public class Main extends Game {
	SpriteBatch batch;
	Texture img;
	Animation animation;
	TextureAtlas textureAtlas;

	@Override
	public void create() {

	}

	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
