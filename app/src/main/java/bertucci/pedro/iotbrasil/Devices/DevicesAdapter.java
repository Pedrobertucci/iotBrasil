package bertucci.pedro.iotbrasil.Devices;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import bertucci.pedro.iotbrasil.MainActivity;
import bertucci.pedro.iotbrasil.R;
import bertucci.pedro.iotbrasil.configuracoes.MainConfiguracoes;

/**
 * Created by pedro on 03/05/17.
 */

public class DevicesAdapter extends RecyclerView.Adapter<DevicesAdapter.ViewHolder>{


    private ArrayList<String> countries;

    public DevicesAdapter(ArrayList<String> countries) {
        this.countries = countries;
    }

    @Override
    public DevicesAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DevicesAdapter.ViewHolder viewHolder, int i) {

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

            tv_country = (TextView)view.findViewById(R.id.tv_country);

            view.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    Context context = v.getContext();
                    Intent intent = new Intent(context,MainPerfilDevice.class);
                    context.startActivity(intent);
                }
            });

        }
    }
}
