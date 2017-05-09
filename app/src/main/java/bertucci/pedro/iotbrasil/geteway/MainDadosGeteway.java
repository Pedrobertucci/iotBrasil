package bertucci.pedro.iotbrasil.geteway;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import bertucci.pedro.iotbrasil.R;
import bertucci.pedro.iotbrasil.Relatorios.MainRelatorioDevices;

public class MainDadosGeteway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dados_geteway);


        final ListView listview = (ListView) findViewById(R.id.listInGeteway);
        String[] values = new String[] {
                " 1 | DEVICE 1 | 12/05/2016 08:35",
                " 2 | DEVICE 2 | 12/05/2016 08:35",
                " 3 | DEVICE 3 | 12/05/2016 08:35",
                " 4 | DEVICE 4 | 12/05/2016 08:35",
                " 5 | DEVICE 1 | 12/05/2016 08:35",
                " 6 | DEVICE 2 | 12/05/2016 08:35",
                " 7 | DEVICE 3 | 12/05/2016 08:35",
                " 8 | DEVICE 4 | 12/05/2016 08:35",
                " 9 | DEVICE 1 | 12/05/2016 08:35",
                " 10 | DEVICE 2 | 12/05/2016 08:35",
                " 11 | DEVICE 3 | 12/05/2016 08:35",
                " 12 | DEVICE 4 | 12/05/2016 08:35",
                " 13 | DEVICE 1 | 12/05/2016 08:35",
                " 14 | DEVICE 2 | 12/05/2016 08:35",
                " 15 | DEVICE 3 | 12/05/2016 08:35",
                " 16 | DEVICE 4 | 12/05/2016 08:35",
                " 17 | DEVICE 1 | 12/05/2016 08:35",
                " 18 | DEVICE 2 | 12/05/2016 08:35",
                " 19 | DEVICE 3 | 12/05/2016 08:35",
                " 20| DEVICE 4 | 12/05/2016 08:35",
                " 21 | DEVICE 1 | 12/05/2016 08:35",
                " 22 | DEVICE 2 | 12/05/2016 08:35",
                " 23 | DEVICE 3 | 12/05/2016 08:35",
                " 24 | DEVICE 4 | 12/05/2016 08:35",
                " 25 | DEVICE 1 | 12/05/2016 08:35",
                " 26 | DEVICE 2 | 12/05/2016 08:35",
                " 27 | DEVICE 3 | 12/05/2016 08:35",
                " 28 | DEVICE 4 | 12/05/2016 08:35",
                " 29 | DEVICE 1 | 12/05/2016 08:35",
                " 30 | DEVICE 2 | 12/05/2016 08:35"};

        final ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < values.length; ++i) {
            list.add(values[i]);
        }
        final MainDadosGeteway.StableArrayAdapter adapter = new MainDadosGeteway.StableArrayAdapter(this,
                android.R.layout.simple_list_item_1, list);
        listview.setAdapter(adapter);
    }

    private class StableArrayAdapter extends ArrayAdapter<String> {

        HashMap<String, Integer> mIdMap = new HashMap<String, Integer>();

        public StableArrayAdapter(Context context, int textViewResourceId,
                                  List<String> objects) {
            super(context, textViewResourceId, objects);
            for (int i = 0; i < objects.size(); ++i) {
                mIdMap.put(objects.get(i), i);
            }
        }

        @Override
        public long getItemId(int position) {
            String item = getItem(position);
            return mIdMap.get(item);
        }

        @Override
        public boolean hasStableIds() {
            return true;
        }

    }
}
