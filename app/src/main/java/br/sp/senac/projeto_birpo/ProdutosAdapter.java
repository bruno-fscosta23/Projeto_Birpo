package br.sp.senac.projeto_birpo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProdutosAdapter extends RecyclerView.Adapter<ProdutosAdapter.MyviewHolder> {

    private Context mContext;
    private List<Produtos> mData;

    public ProdutosAdapter(Context mContext, List<Produtos> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;

        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.produtos_cardview,parent,false);

        return new MyviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyviewHolder holder, int position) {
        holder.textView.setText(mData.get(position).getNome());
        holder.textView1.setText(mData.get(position).getCodigo());
        holder.imageView.setImageResource(mData.get(position).getImagem());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class MyviewHolder extends RecyclerView.ViewHolder{

        TextView textView, textView1;

        ImageView imageView;


        public MyviewHolder(@NonNull View itemView) {

            super(itemView);

            textView = (TextView)itemView.findViewById(R.id.idTxtProduto);
            textView1 = (TextView)itemView.findViewById(R.id.idTxtExpProduto);
            imageView = (ImageView)itemView.findViewById(R.id.imgProduto);
        }
    }
}

