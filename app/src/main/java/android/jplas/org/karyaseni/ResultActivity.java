package android.jplas.org.karyaseni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ResultActivity extends AppCompatActivity {
    ImageView readImage;
    Button btBack;

    public static final String GET_GAMBAR = "get_gambar";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        readImage = findViewById(R.id.readImage);
        btBack = findViewById(R.id.btBack);

        if(getIntent().hasExtra(GET_GAMBAR)){
            Bitmap bitmap = getIntent().getParcelableExtra(GET_GAMBAR);
            readImage.setImageBitmap(bitmap);
        }

        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ResultActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
