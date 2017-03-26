package pashabrb.application3_;


import  android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.support.v4.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class mlb_web_fragment extends Fragment {

    WebView wv;

    public mlb_web_fragment() {
       
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String myValue = this.getArguments().getString("url");
        View view = inflater.inflate(R.layout.fragment_mlb_web_fragment, container, false);
        wv = (WebView) view.findViewById(R.id.mlb_web_fragment);
        wv.getSettings().setJavaScriptEnabled(true);
        
        wv.loadUrl(myValue);
        return view;
    }
}


