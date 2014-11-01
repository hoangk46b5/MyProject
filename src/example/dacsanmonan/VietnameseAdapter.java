package example.dacsanmonan;

import java.util.List;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
public class VietnameseAdapter extends ArrayAdapter<ListItem> {
 
    private List<ListItem>  _listItems;
    private Context         _context;
    public VietnameseAdapter(Context context, int textViewResourceId,List<ListItem> objects) {
        super(context, textViewResourceId, objects);
        this._context   = context;
        this._listItems = objects;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        VietnameseView view = new VietnameseView(this._context);
        view.setListItem(this._listItems.get(position));
        return view;
    }
}
