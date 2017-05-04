package bertucci.pedro.iotbrasil.getway;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import bertucci.pedro.iotbrasil.Devices.DevicesAdapter;
import bertucci.pedro.iotbrasil.Devices.MainPerfilDevice;
import bertucci.pedro.iotbrasil.R;

/**
 * Created by b_ped on 04/05/2017.
 */

public class GetwayAdapter extends RecyclerView.Adapter<GetwayAdapter.ViewHolder>{

    private ArrayList<String> countries;

    public GetwayAdapter(ArrayList<String> countries) {
        this.countries = countries;
    }

    @Override
    public GetwayAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card, viewGroup, false);
        return new GetwayAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.tv_country.setText(countries.get(i));

        viewHolder.tv_country.hasOnClickListeners();
    }



    @Override
    public int getItemCount() {
        return countries.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_country;
        public ViewHolder(View view) {
            super(view);

            tv_country = (TextView)view.findViewById(R.id.card_getway);

            view.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    Context context = v.getContext();
                    Intent intent = new Intent(context,ProfileGetway.class);
                    context.startActivity(intent);
                }
            });

        }
    }

}