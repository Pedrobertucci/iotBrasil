package bertucci.pedro.iotbrasil.getway;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import bertucci.pedro.iotbrasil.Devices.DevicesAdapter;
import bertucci.pedro.iotbrasil.R;

public class MainGetway extends AppCompatActivity {


    private ArrayList countries;
    private GridLayoutManager meuLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_getway);
        funcoes();

    }

    public void funcoes(){

        meuLayout = new GridLayoutManager(getApplicationContext(),1);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.card_recycler_view_getway);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(meuLayout);
        countries = new ArrayList<>();
        countries.add("Getway 1");
        countries.add("Getway 2");
        countries.add("Getway 3");
        countries.add("Getway 4");

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
                    int position = rv.getChildAdapterPosition(child);
                    Toast.makeText(getApplicationContext(), (Integer) countries.get(position), Toast.LENGTH_SHORT).show();
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
