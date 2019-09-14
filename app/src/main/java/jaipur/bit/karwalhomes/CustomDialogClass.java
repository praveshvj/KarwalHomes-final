package jaipur.bit.karwalhomes;


import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomDialogClass extends Dialog implements
        android.view.View.OnClickListener {

    public Activity c;
    public Dialog d;
    TextView tv1,tv2,tv3;
    ImageView imageView;
     private RecyclerView mRecyclerView;
    private MyAdapter2 myAdapter2;
    LinearLayoutManager layoutManager;
    CustomDialogClass(Activity a, SingleItem singleItem) {
        super(a);
        // TODO Auto-generated constructor stub
        ArrayList<Integer> arrayList = new ArrayList<>();
         layoutManager= new LinearLayoutManager(c, LinearLayoutManager.HORIZONTAL, false);

        Log.d("RECYCLER VIEW FOUND ",""+mRecyclerView);
        this.c = a;
        SingleItem singleItem1 = singleItem;

        arrayList.add(R.drawable.aa);
        arrayList.add(R.drawable.ab);
        arrayList.add(R.drawable.ac);
        arrayList.add(R.drawable.ad);
        arrayList.add(R.drawable.ae);
        arrayList.add(R.drawable.af);
        arrayList.add(R.drawable.ag);
        arrayList.add(R.drawable.ah);
        arrayList.add(R.drawable.ai);
        arrayList.add(R.drawable.aj);
        arrayList.add(R.drawable.ak);


        myAdapter2 = new MyAdapter2(this, arrayList);
 //above three lines added

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.custimdialog);
        mRecyclerView = findViewById(R.id.recycler_view);
        mRecyclerView.setAdapter(myAdapter2);
        mRecyclerView.setLayoutManager(layoutManager);
        init();
        setValues();
    }

    private void setValues() {
        //imageView.setImageResource(singleItem.getImage());
//        tv1.setText(String.valueOf(singleItem.getRent()));
  //      tv2.setText(singleItem.getAddress());
    }

    private void init() {
        //imageView=findViewById(R.id.myimageD);
    //    tv1=findViewById(R.id.tv2);
      //  tv2=findViewById(R.id.tv4);
        //tv3=findViewById(R.id.tv6);
    }

    @Override
    public void onClick(View v) {
        dismiss();
    }
}