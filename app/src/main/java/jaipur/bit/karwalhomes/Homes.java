package jaipur.bit.karwalhomes;

import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Homes extends AppCompatActivity {
    ListView listView;
    ArrayList<SingleItem> arrayList;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homes);
        listView = findViewById(R.id.listview);
        arrayList = new ArrayList<>();

        addHome();
        setListner();

    //add item to list
        //

        myAdapter = new MyAdapter(this, arrayList);
        listView.setAdapter(myAdapter);

    }
    private void setListner() {
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                SingleItem singleItem6 = arrayList.get(position);
                CustomDialogClass cdd = new CustomDialogClass(Homes.this, singleItem6);
                cdd.show();
            }
        });
    }
    private void addHome() {
        SingleItem singleItem1 = new SingleItem(R.drawable.a, 15000, "some address");
        SingleItem singleItem2 = new SingleItem(R.drawable.b, 15000, "some address");
        SingleItem singleItem3 = new SingleItem(R.drawable.c, 15000, "some address");
        SingleItem singleItem4 = new SingleItem(R.drawable.d, 15000, "some address");
        SingleItem singleItem5 = new SingleItem(R.drawable.e, 15000, "some address");
        SingleItem singleItem6 = new SingleItem(R.drawable.f, 15000, "some address");
        SingleItem singleItem7 = new SingleItem(R.drawable.g, 15000, "some address");
        SingleItem singleItem8 = new SingleItem(R.drawable.h, 15000, "some address");
        SingleItem singleItem9 = new SingleItem(R.drawable.i, 15000, "some address");
        SingleItem singleItem10 =new SingleItem(R.drawable.j, 15000, "some address");
        SingleItem singleItem11= new SingleItem(R.drawable.k, 15000, "some address");
        SingleItem singleItem12= new SingleItem(R.drawable.l, 15000, "some address");
        SingleItem singleItem13= new SingleItem(R.drawable.m, 15000, "some address");
        SingleItem singleItem14= new SingleItem(R.drawable.n, 15000, "some address");
        SingleItem singleItem15= new SingleItem(R.drawable.o, 15000, "some address");
        SingleItem singleItem16= new SingleItem(R.drawable.p, 15000, "some address");
        SingleItem singleItem17= new SingleItem(R.drawable.q, 15000, "some address");
        SingleItem singleItem18= new SingleItem(R.drawable.r, 15000, "some address");
        SingleItem singleItem19= new SingleItem(R.drawable.s, 15000, "some address");
        SingleItem singleItem20= new SingleItem(R.drawable.t, 15000, "some address");
        SingleItem singleItem21= new SingleItem(R.drawable.u, 15000, "some address");
        SingleItem singleItem22= new SingleItem(R.drawable.v, 15000, "some address");
        SingleItem singleItem23= new SingleItem(R.drawable.w, 15000, "some address");
        SingleItem singleItem24= new SingleItem(R.drawable.x, 15000, "some address");
        SingleItem singleItem25= new SingleItem(R.drawable.y, 15000, "some address");

        arrayList.add(singleItem1);
        arrayList.add(singleItem2);
        arrayList.add(singleItem3);
        arrayList.add(singleItem4);
        arrayList.add(singleItem5);
        arrayList.add(singleItem6);
        arrayList.add(singleItem7);
        arrayList.add(singleItem8);
        arrayList.add(singleItem9);
        arrayList.add(singleItem10);
        arrayList.add(singleItem11);
        arrayList.add(singleItem12);
        arrayList.add(singleItem13);
        arrayList.add(singleItem14);
        arrayList.add(singleItem15);
        arrayList.add(singleItem16);
        arrayList.add(singleItem17);
        arrayList.add(singleItem18);
        arrayList.add(singleItem19);
        arrayList.add(singleItem20);
        arrayList.add(singleItem21);
        arrayList.add(singleItem22);
        arrayList.add(singleItem23);
        arrayList.add(singleItem24);
        arrayList.add(singleItem25);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.filter:
                return true;
            case R.id.min:
//                Collections.sort(arrayList, new Comparator<SingleItem>()
//                {
//                    @Override
//                    public int compare(SingleItem lhs, SingleItem rhs) {
//                        myAdapter=new MyAdapter(Home.this,arrayList);
//                        listView.setAdapter(myAdapter);
//                        setListner();
//                        return Integer.compare(lhs.getRent(), rhs.getRent());
//                    }
//                });
                return true;
            case R.id.high:
//                Collections.sort(arrayList, new Comparator<SingleItem>()
//                {
//                    @Override
//                    public int compare(SingleItem lhs, SingleItem rhs) {
//                        myAdapter=new MyAdapter(Home.this,arrayList);
//                        listView.setAdapter(myAdapter);
//                        setListner();
//                        return Integer.compare(rhs.getRent(), lhs.getRent());
//                    }
//                });
                return true;
            case R.id.share:
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = "SHARE US";
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject Here");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, "Share via"));
                Toast.makeText(this, "SHARE SELECTED", Toast.LENGTH_LONG).show();
                return true;
            case R.id.about:
                Toast.makeText(this, "About us", Toast.LENGTH_LONG).show();
                Intent intent1 = new Intent(this, AboutUs.class);
                startActivity(intent1);
                return true;
            case R.id.logout:
                Toast.makeText(this, "Logout SELECTED", Toast.LENGTH_LONG).show();
                Intent intent2 = new Intent(this, Login.class);
                startActivity(intent2);
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }
}
