package bertucci.pedro.iotbrasil.Relatorios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;

import bertucci.pedro.iotbrasil.R;
import bertucci.pedro.iotbrasil.getway.GetwayAdapter;

public class MainRelatorios extends AppCompatActivity {

    private ArrayList countries;
    private GridLayoutManager meuLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_relatorios);
        funcoes();
    }

    public void funcoes(){

        meuLayout = new GridLayoutManager(getApplicationContext(),1);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.card_recycler_view_relatorios);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(meuLayout);
        countries = new ArrayList<>();
        countries.add("Getway 1");
        countries.add("Getway 2");
        countries.add("Getway 3");
        countries.add("Getway 4");

        RecyclerView.Adapter adapter = new GetwayAdapter(countries);
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
                    System.out.println("teste");
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
