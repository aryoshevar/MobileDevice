import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Mengubah background menjadi warna biru saat aktivitas dibuat
        View mainLayout = findViewById(R.id.main_layout);
        mainLayout.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_light));
    }
}
