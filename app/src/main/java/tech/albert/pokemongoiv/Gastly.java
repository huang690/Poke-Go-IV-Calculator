package tech.albert.pokemongoiv;

import android.app.Service;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.IBinder;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by albret on 8/9/2016.
 */
public class Gastly extends Service {

	private WindowManager windowManager;
	private ImageView chatHead;
	private LinearLayout calcScreen;
	private EditText poke_name;
	private EditText poke_power;
	private EditText poke_cp;
	private EditText poke_hp;
	private Button powered;
	private boolean displayed = false;
	WindowManager.LayoutParams headParams;
	WindowManager.LayoutParams calcParams;

	private PokemonData lastPika;

	@Override
	public void onCreate() {
		super.onCreate();

		windowManager = (WindowManager) getSystemService(WINDOW_SERVICE);

		chatHead = new ImageView(this);
		chatHead.setImageResource(R.drawable.icon_head);

		headParams = new WindowManager.LayoutParams(
				WindowManager.LayoutParams.WRAP_CONTENT,
				WindowManager.LayoutParams.WRAP_CONTENT,
				WindowManager.LayoutParams.TYPE_PHONE,
				WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
				PixelFormat.TRANSLUCENT);
		headParams.gravity = Gravity.TOP | Gravity.LEFT;
		headParams.x = 0;
		headParams.y = 0;

		calcScreen = (LinearLayout) ((LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE)).inflate(R.layout.floating_layout, null);
		poke_name = (EditText) calcScreen.findViewById(R.id.pokemon_name);
		poke_power = (EditText) calcScreen.findViewById(R.id.pokemon_power_cost);
		poke_cp = (EditText) calcScreen.findViewById(R.id.pokemon_cp);
		poke_hp = (EditText) calcScreen.findViewById(R.id.pokemon_hp);
		powered = (Button) calcScreen.findViewById(R.id.powered_up_toggle);

		calcParams = new WindowManager.LayoutParams(
				WindowManager.LayoutParams.WRAP_CONTENT,
				WindowManager.LayoutParams.WRAP_CONTENT,
				WindowManager.LayoutParams.TYPE_PHONE,
				WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL,
				PixelFormat.RGB_565);

		calcParams.gravity = Gravity.TOP | Gravity.LEFT;
		calcParams.x = 0;
		calcParams.y = 200;

		//this code is for dragging the chat head
		chatHead.setOnTouchListener(new View.OnTouchListener() {
			private int initialX;
			private int initialY;
			private float initialTouchX;
			private float initialTouchY;

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				switch (event.getAction()) {
					case MotionEvent.ACTION_DOWN:
						initialX = headParams.x;
						initialY = headParams.y;
						initialTouchX = event.getRawX();
						initialTouchY = event.getRawY();
						return true;
					case MotionEvent.ACTION_UP:
						if (!displayed) {
							if (Math.abs(initialX - headParams.x) < 10 && Math.abs(initialY - headParams.y) < 10) {
								displayed = true;
								headParams.x = 0;
								headParams.y = 0;
								windowManager.updateViewLayout(chatHead, headParams);
								windowManager.addView(calcScreen, calcParams);
							}
						} else {
							windowManager.removeView(calcScreen);
							displayed = false;
						}
						return true;
					case MotionEvent.ACTION_MOVE:
						headParams.x = initialX
								+ (int) (event.getRawX() - initialTouchX);
						headParams.y = initialY
								+ (int) (event.getRawY() - initialTouchY);
						windowManager.updateViewLayout(chatHead, headParams);
						if (displayed) {
							windowManager.removeView(calcScreen);
							displayed = false;
						}
						return true;
				}
				return false;
			}
		});


		windowManager.addView(chatHead, headParams);
	}

	public void grabAllData(View view) {//String pokemon_name, int cp, int hp, int power_cost, boolean powered
		String input[] = {poke_name.getText().toString(), poke_power.getText().toString(), poke_cp.getText().toString(), poke_hp.getText().toString()};
		Log.v("qwer", input[0] + " " + input[1] + " " + input[2] + " " + input[3]);
		lastPika = new PokemonData(input[0], Integer.parseInt(input[2]), Integer.parseInt(input[3]), Integer.parseInt(input[1]), powered.getText().equals("Yes"));
	}

	public void refineData(View view) {
		String input[] = {poke_power.getText().toString(), poke_cp.getText().toString(), poke_hp.getText().toString()};
		Log.v("qwer", "Refine: " + input[0] + " " + input[1] + " " + input[2]);
		lastPika.refine(Integer.parseInt(input[1]), Integer.parseInt(input[2]), Integer.parseInt(input[0]));
	}

	public void togglePowerUp(View view) {
		if (powered.getText().equals("Yes"))
			powered.setText("No");
		else
			powered.setText("Yes");
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		if (chatHead != null)
			windowManager.removeView(chatHead);
		if (displayed)
			windowManager.removeView(calcScreen);
	}

	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}
}