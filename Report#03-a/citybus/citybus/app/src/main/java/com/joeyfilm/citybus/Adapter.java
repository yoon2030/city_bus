package com.joeyfilm.citybus;

import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Person2> personList2;
    public Adapter(List<Person2> personList2){
        this.personList2 = personList2;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.nameText.setText(personList2.get(i).getName());
        myViewHolder.ageText.setText(personList2.get(i).getContent());
        myViewHolder.contentText.setText(personList2.get(i).getContent2());
        myViewHolder.payByText.setText(personList2.get(i).getPayBy_());
        myViewHolder.moneyText.setText(personList2.get(i).getMoney_());

    }

    @Override
    public int getItemCount() {
        return personList2.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView nameText, ageText, contentText, payByText, moneyText;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nameText = itemView.findViewById(R.id.text_name);
            ageText = itemView.findViewById(R.id.text_content);
            contentText = itemView.findViewById(R.id.text_content2);
            payByText = itemView.findViewById(R.id.text_payBy);
            moneyText = itemView.findViewById(R.id.text_money);

        }
    }
}
