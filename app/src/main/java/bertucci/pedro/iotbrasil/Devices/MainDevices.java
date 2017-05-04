package bertucci.pedro.iotbrasil.Devices;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import bertucci.pedro.iotbrasil.R;

public class MainDevices extends AppCompatActivity {

    private ArrayList countries;
    private GridLayoutManager lLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_devices);
        funcoes();
    }

    public  void funcoes(){

        lLayout = new GridLayoutManager(getApplicationContext(),2);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.card_recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(lLayout);
        countries = new ArrayList<>();
        countries.add("Device 1");
        countries.add("Device 2");
        countries.add("Device 3");
        countries.add("Device 4");
        countries.add("Device 5");
        countries.add("Device 6");
        countries.add("Device 7");
        RecyclerView.Adapter adapter = new DevicesAdapter(countries);
        recyclerView.setAdapter(adapter);

        recyclerView.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {

                @Override public boolean onSingleTapUp(MotionEvent e) {
                    return true;
                }

            });
            @Override
            public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {

                View child = rv.findChildViewUnder(e.getX(), e.getY());
                if(child != null && gestureDetector.onTouchEvent(e)) {

                }

                return false;
            }

            @Override
            public void onTouchEvent(RecyclerView rv, MotionEvent e) {

            }

            @Override
            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

            }
        });
    }
}
