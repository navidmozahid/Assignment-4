package com.example.assignment4;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.customListView);

        ArrayList<HashMap<String, String>> itemList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            HashMap<String, String> map = new HashMap<>();
            map.put("image", String.valueOf(R.drawable.ic_launcher_foreground)); // Example image
            map.put("text", "Item " + i);
            itemList.add(map);
        }

        SimpleAdapter adapter = new SimpleAdapter(this, itemList, R.layout.list_item,
                new String[]{"image", "text"}, new int[]{R.id.itemImage, R.id.itemText});
        listView.setAdapter(adapter);
    }
}