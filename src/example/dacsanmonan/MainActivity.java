package example.dacsanmonan;

import java.util.ArrayList;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
 
        /*tập tin res/layout/activity_vietnamese.xml làm
        layout hiển thị cho activity này*/
        setContentView(R.layout.activity_main);
 
        //tạo mảng động chứa các phần tử là ListItem
        ArrayList<ListItem> celebrities = new ArrayList<ListItem>();
 
        //thêm các phần tử vào mảng động celebrities
        celebrities.add(new ListItem("Món 1",     R.drawable.mon1, " Dòng 2", "30 phút"));
        celebrities.add(new ListItem("Món 2",   R.drawable.mon2, "Dòng 2", "30 phút"));
        celebrities.add(new ListItem("Món 3",    R.drawable.mon3, "Dòng 2 ", "30 phút"));
        
 
        //lấy về ListView đã đặt trên activity_vietnamese.xml
        ListView listViewVietnamese = (ListView) findViewById(R.id.listViewVietnamese);
      
        
        //tạo một đối tượng adapter mới tạo
        VietnameseAdapter newAdapter = new VietnameseAdapter(this, listViewVietnamese.getId(), celebrities);
 
        //sử dụng newAdapter cho listViewVietnamese
        listViewVietnamese.setAdapter(newAdapter);
        listViewVietnamese.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "aa", Toast.LENGTH_LONG).show();
				
			}
		});
    }
}