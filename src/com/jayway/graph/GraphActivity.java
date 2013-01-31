package com.jayway.graph;

import java.util.ArrayList;
import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class GraphActivity extends Activity {

    private Random random = new Random();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);

        // TODO 1) Create a new class extending view

        // TODO 2) Change graphView to be an instance of your graph view class
        final View graphView = findViewById(R.id.graph_view);

        // TODO 3) Create a setData method on the view that takes an ArrayList
        // of floats

        findViewById(R.id.button1).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<Float> data1 = getRandomData(1, 20);
                // TODO 4) set data to the graphView
                // graphView.setData(data1);

            }
        });

        findViewById(R.id.button2).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<Float> data2 = getRandomData(2, 20);
                // TODO 4) set data to the graphView
                // graphView.setData(data2);

            }
        });

        findViewById(R.id.button3).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<Float> data3 = getRandomData(3, 20);
                // TODO 4) set data to the graphView
                // graphView.setData(data3);

            }
        });
        
        // TODO 5) Draw the graph!
    }

    private ArrayList<Float> getRandomData(int seed, int size) {
        random.setSeed(seed);

        ArrayList<Float> data = new ArrayList<Float>();
        for (int i = 0; i < size; i++) {
            data.add((float) (random.nextInt(20) + 10));
        }

        return data;
    }
}
