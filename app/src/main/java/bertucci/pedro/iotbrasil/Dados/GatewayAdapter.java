package bertucci.pedro.iotbrasil.Dados;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

import bertucci.pedro.iotbrasil.R;

/**
 * Created by pedro on 19/05/17.
 */

public class GatewayAdapter extends BaseAdapter {



    private Context context;
    private List<Gateway> list;


    public GatewayAdapter(Context context, String list){
        this.context = context;

    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return list.get(position).getId_gateway();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int auxPosition = position;

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final RelativeLayout layout = (RelativeLayout)inflater.inflate(R.layout.activity_main_relatorio_devices, null);

        TextView txtNome = (TextView)layout.findViewById(R.id.txtDevices);
        txtNome.setText(list.get(position).getNome());

        return layout;
    }
}
