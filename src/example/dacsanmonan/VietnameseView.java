package example.dacsanmonan;

import android.app.Service;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
/**
 * lớp tương ứng với 1 item trên Custom-ListView
 */
public class VietnameseView extends LinearLayout {
    //các thuộc tính tương ứng với các View Widget
    //trong tập tin list_item.xml
    public ImageView    photo;
    public TextView     name;
    public TextView     life;
    public TextView     carrer;
    public VietnameseView(Context context) {
        super(context);
 
        //đọc tập tin list_item.xml để lấy các thành phần
        LayoutInflater linflater = (LayoutInflater) ((MainActivity)context).getSystemService(Service.LAYOUT_INFLATER_SERVICE);
        linflater.inflate(R.layout.list_item, this);
 
        //lấy các thành  phần tương ứng
        this.photo  = (ImageView) findViewById(R.id.itemPhoto);
        this.name   = (TextView) findViewById(R.id.itemName);
        this.life   = (TextView) findViewById(R.id.itemLife);
        this.carrer = (TextView) findViewById(R.id.itemCarrer);
    }
 
    /**
     * phương thức đặt data vào trong phần tử VietnameseView
     * @param item
     */
    public void setListItem(ListItem item){
        this.photo.setImageResource(item.photo);
        this.name.setText(item.name);
        this.life.setText(item.life);
        this.carrer.setText(item.career);
    }
}