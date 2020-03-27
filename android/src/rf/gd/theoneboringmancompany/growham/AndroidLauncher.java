package rf.gd.theoneboringmancompany.growham;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

public class AndroidLauncher extends AndroidApplication {
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		config.useWakelock = false;
		config.useGyroscope = false;
		config.useCompass = false;
		config.useAccelerometer = false;
		initialize(new Main(), config);
	}
}
