package tech.albert.pokemongoiv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

	Button startService, stopService;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		startService = (Button) findViewById(R.id.startService);
		stopService = (Button) findViewById(R.id.stopService);

		startService.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				startService(new Intent(getApplication(), Gastly.class));
			}
		});

		stopService.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				stopService(new Intent(getApplication(), Gastly.class));
			}
		});
	}
}
