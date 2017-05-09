package bertucci.pedro.iotbrasil.Relatorios;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import bertucci.pedro.iotbrasil.R;


/**
 * Created by b_ped on 09/05/2017.
 */

public class relatorioAdapter  extends RecyclerView.Adapter<relatorioAdapter.ViewHolder> {

    private ArrayList<String> countries;

    public relatorioAdapter(ArrayList<String> countries) {
        this.countries = countries;
    }


    @Override
    public int getItemCount() {
        return countries.size();
    }

    @Override
    public relatorioAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_relatorios, viewGroup, false);
        return new relatorioAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.tv_country.setText(countries.get(i));

        viewHolder.tv_country.hasOnClickListeners();
    }



    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_country;

        public ViewHolder(View view) {
            super(view);

            tv_country = (TextView) view.findViewById(R.id.tv_country);

            tv_country.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context context = v.getContext();
                    Intent intent = new Intent(context, MainRelatorioDevices.class);
                    context.startActivity(intent);
                }
            });

        }
    }
}
