package com.diegusweb.mediform.ui.fragments;


import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.diegusweb.mediform.R;
import com.diegusweb.mediform.ui.adapters.AdaptadorInicio;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentoInicio extends Fragment {

    public static final int NUM_COLUMNS = 2;

    private RecyclerView reciclador;
    private LinearLayoutManager layoutManager;
    private AdaptadorInicio adaptador;

    public FragmentoInicio() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragmento_inicio, container, false);

        View view = inflater.inflate(R.layout.fragmento_inicio, container, false);

        reciclador = (RecyclerView) view.findViewById(R.id.reciclador);
        layoutManager = new LinearLayoutManager(getActivity());
        reciclador.setLayoutManager(new GridLayoutManager(getActivity(), NUM_COLUMNS));

        adaptador = new AdaptadorInicio();
        adaptador.setOnItemClickListener(new AdaptadorInicio.OnItemClickListener() {
            @Override
            public void onItemClick(View itemView, int position) {
                String name = adaptador.getItem(position).getNombre();
                //int id = adaptador.getItem(position).getIdTransport();
                Toast.makeText(getActivity(), "diego was clicked! " + "- " + name, Toast.LENGTH_SHORT).show();

            }
        });
        reciclador.setAdapter(adaptador);
        return view;
    }


}
