package senac.cadaluno.castellan.listviewpro;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TARDE on 20/03/2018.
 */

public class ListaAdapterItem extends ArrayAdapter<Item> {
    private Context context;
    private ArrayList<Item> arrayList;

    public ListaAdapterItem(Context contexto, ArrayList<Item> listaDeItens) {
        super(contexto, 0, listaDeItens);
        this.context = contexto;
        this.arrayList = listaDeItens;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Item itemPos = this.arrayList.get(position);

        convertView = LayoutInflater.from(this.context).inflate();

        return itemPos;
    }
}
