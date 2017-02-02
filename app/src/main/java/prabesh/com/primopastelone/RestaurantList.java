package prabesh.com.primopastelone;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RAKEZ on 10/24/2016.
 */
public class RestaurantList extends AppCompatActivity {
    ListView lv;
    List<Product> l = new ArrayList<Product>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurant_activity);
        lv= (ListView) findViewById(R.id.cakelist_custolv);

        l.add(new Product("Java Restaurant","THis is located at kathmandu","$24",R.drawable.restaurant));
        l.add(new Product("Java Restaurant","THis is located at kathmandu","$24",R.drawable.restaurant));
        l.add(new Product("Java Restaurant","THis is located at kathmandu","$24",R.drawable.restaurant));
        l.add(new Product("Java Restaurant","THis is located at kathmandu","$24",R.drawable.restaurant));
        l.add(new Product("Java Restaurant","THis is located at kathmandu","$24",R.drawable.restaurant));


        ArrayAdapter<Product> ad = new MyListAdapter();
        lv.setAdapter(ad);



    }
    public class MyListAdapter extends ArrayAdapter<Product> {

        public MyListAdapter(){
            super(RestaurantList.this, R.layout.custon_listitem,l);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View itemView  = convertView;
            if(convertView==null){
                itemView =getLayoutInflater().inflate(R.layout.customforrestaurant,parent,false);
            }
            Product currentProduct = l.get(position);
            ImageView imageView = (ImageView)itemView.findViewById(R.id.lvicon);
            TextView titleView = (TextView) itemView.findViewById(R.id.lvtitle);
            TextView descView = (TextView) itemView.findViewById(R.id.lvdesc);


            imageView.setImageResource(currentProduct.getIcon());
            titleView.setText(currentProduct.getTitle());
            descView.setText(currentProduct.getDesc());

            return itemView;

        }
    }
}
