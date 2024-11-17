package com.example.assignment4;

import android.os.Bundle;
import android.widget.ExpandableListAdapter;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ExpandableListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expandable_list);

        ExpandableListView expandableListView = findViewById(R.id.expandableListView);

        List<String> parentItems = new ArrayList<>();
        HashMap<String, List<String>> childItems = new HashMap<>();

        for (int i = 1; i <= 5; i++) {
            String parent = "Parent " + i;
            parentItems.add(parent);

            List<String> children = new ArrayList<>();
            for (int j = 1; j <= 3; j++) {
                children.add("Child " + i + "." + j);
            }
            childItems.put(parent, children);
        }

        ExpandableListAdapter adapter = new ExpandableListAdapter(this, parentItems, childItems);
        expandableListView.setAdapter(adapter);
    }
}