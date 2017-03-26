package pashabrb.application3_;


import android.os.Bundle;
//import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


import android.support.v4.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class web_view_fragment extends Fragment {

    WebView wv ;
    String url ;
    public web_view_fragment() {
        
    }


    String getString(String u){
        return  this.url = u ;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       
      
        String myValue = this.getArguments().getString("url");
        View view = inflater.inflate(R.layout.fragment_web_view_fragment, container, false);
        wv = (WebView) view.findViewById(R.id.nba_web);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.loadUrl(myValue);
        return view;
    }

}
