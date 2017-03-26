package pashabrb.application3_;


import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class mlb_fragment extends Fragment {

    ArrayList<String> arrayList;
    private ArrayAdapter<String> adapter;
    ListView lv;
    public mlb_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        

        String[] teams = {"Cubs", "Socks", "Red Socks", "Mets", "Giants", "Tigers"};
        View view = null;
        final mlb_web_fragment web = new mlb_web_fragment();
        FragmentManager fragmentManager;





        int current = getResources().getConfiguration().orientation;
        if (current == Configuration.ORIENTATION_LANDSCAPE) {

            Toast.makeText(getActivity(), "LandScape changed", Toast.LENGTH_LONG).show();

            view = inflater.inflate(R.layout.fragment_mlb_fragment, container, false);
            lv = (ListView) view.findViewById(R.id.fragment1_mlb);
           
            adapter = new ArrayAdapter<String>(getActivity(), R.layout.activity_bb, R.id.name, teams);


            lv.setAdapter(adapter);

            if (container == null) {
                return null;


            }







            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {





                    view.setSelected(true);

                    String url = null;
                    Fragment fragment = null;

                    if(position==0){

                        mlb_web_fragment f = new mlb_web_fragment();
                        mlb_fragment fr = new mlb_fragment();
                        getFragmentManager().findFragmentById(R.id.for_listview_mlb);

                        FragmentTransaction transaction = getFragmentManager().beginTransaction();
                        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                        transaction.replace(R.id.for_listview_mlb,fr).commit();


                        Toast.makeText(getActivity(), " setting up Fragment ", Toast.LENGTH_LONG).show();




                        url = "http://chicago.cubs.mlb.com/index.jsp?c_id=chc";
                        Bundle bundle = new Bundle();
                        bundle.putString("url", url);
                        fragment = new mlb_web_fragment();
                        fragment.setArguments(bundle);
                        FragmentTransaction transaction2 = getChildFragmentManager().beginTransaction();

                        transaction2.replace(R.id.for_web_view, fragment);
                        transaction2.addToBackStack("select2");
                        transaction2.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);

                        transaction2.commit();

                        Toast.makeText(getActivity(), "Cubs selected .. opening up webview please wait", Toast.LENGTH_LONG).show();




                    }


                    if(position==1){
                        mlb_web_fragment f = new mlb_web_fragment();
                        mlb_fragment fr = new mlb_fragment();
                        getFragmentManager().findFragmentById(R.id.for_listview_mlb);

                        FragmentTransaction transaction = getFragmentManager().beginTransaction();
                        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                        transaction.replace(R.id.for_listview_mlb,fr).commit();


                        Toast.makeText(getActivity(), " Adjusting Fragment ", Toast.LENGTH_LONG).show();




                        url = "http://chicago.whitesox.mlb.com/index.jsp?c_id=cws";
                        Bundle bundle = new Bundle();
                        bundle.putString("url", url);
                        fragment = new mlb_web_fragment();
                        fragment.setArguments(bundle);
                        FragmentTransaction transaction2 = getChildFragmentManager().beginTransaction();

                        transaction2.replace(R.id.for_web_view, fragment);
                        transaction2.addToBackStack("select2");
                        transaction2.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);

                        transaction2.commit();

                        Toast.makeText(getActivity(), "WhiteSocks selected .. opening up webview please wait", Toast.LENGTH_LONG).show();
                    }

                    if(position==2){
                        mlb_web_fragment f = new mlb_web_fragment();
                        mlb_fragment fr = new mlb_fragment();
                        getFragmentManager().findFragmentById(R.id.for_listview_mlb);

                        FragmentTransaction transaction = getFragmentManager().beginTransaction();
                        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                        transaction.replace(R.id.for_listview_mlb,fr).commit();


                        Toast.makeText(getActivity(), " Adjusting Fragment ", Toast.LENGTH_LONG).show();




                        url = "http://boston.redsox.mlb.com/index.jsp?c_id=bos";
                        Bundle bundle = new Bundle();
                        bundle.putString("url", url);
                        fragment = new mlb_web_fragment();
                        fragment.setArguments(bundle);
                        FragmentTransaction transaction2 = getChildFragmentManager().beginTransaction();

                        transaction2.replace(R.id.for_web_view, fragment);
                        transaction2.addToBackStack("select2");
                        transaction2.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);

                        transaction2.commit();

                        Toast.makeText(getActivity(), "RedSox selected .. opening up webview please wait", Toast.LENGTH_LONG).show();
                    }


                    if(position==3){
                        mlb_web_fragment f = new mlb_web_fragment();
                        mlb_fragment fr = new mlb_fragment();
                        getFragmentManager().findFragmentById(R.id.for_listview_mlb);

                        FragmentTransaction transaction = getFragmentManager().beginTransaction();
                        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                        transaction.replace(R.id.for_listview_mlb,fr).commit();


                        Toast.makeText(getActivity(), " Adjusting Fragment ", Toast.LENGTH_LONG).show();




                        url = "http://newyork.mets.mlb.com/index.jsp?c_id=nym";
                        Bundle bundle = new Bundle();
                        bundle.putString("url", url);
                        fragment = new mlb_web_fragment();
                        fragment.setArguments(bundle);
                        FragmentTransaction transaction2 = getChildFragmentManager().beginTransaction();

                        transaction2.replace(R.id.for_web_view, fragment);
                        transaction2.addToBackStack("select2");
                        transaction2.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);

                        transaction2.commit();

                        Toast.makeText(getActivity(), "Mets selected .. opening up webview please wait", Toast.LENGTH_LONG).show();


                    }

                    if(position==4){

                        mlb_web_fragment f = new mlb_web_fragment();
                        mlb_fragment fr = new mlb_fragment();
                        getFragmentManager().findFragmentById(R.id.for_listview_mlb);

                        FragmentTransaction transaction = getFragmentManager().beginTransaction();
                        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                        transaction.replace(R.id.for_listview_mlb,fr).commit();


                        Toast.makeText(getActivity(), " Adjusting Fragment ", Toast.LENGTH_LONG).show();




                        url = "http://sanfrancisco.giants.mlb.com/index.jsp?c_id=sf";
                        Bundle bundle = new Bundle();
                        bundle.putString("url", url);
                        fragment = new mlb_web_fragment();
                        fragment.setArguments(bundle);
                        FragmentTransaction transaction2 = getChildFragmentManager().beginTransaction();

                        transaction2.replace(R.id.for_web_view, fragment);
                        transaction2.addToBackStack("select2");
                        transaction2.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);

                        transaction2.commit();

                        Toast.makeText(getActivity(), "Giants selected .. opening up webview please wait", Toast.LENGTH_LONG).show();

                    }

                    if(position==5){

                        mlb_web_fragment f = new mlb_web_fragment();
                        mlb_fragment fr = new mlb_fragment();
                        getFragmentManager().findFragmentById(R.id.for_listview_mlb);

                        FragmentTransaction transaction = getFragmentManager().beginTransaction();
                        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);


                        transaction.replace(R.id.for_listview_mlb,fr).commit();


                        Toast.makeText(getActivity(), " Adjusting Fragment ", Toast.LENGTH_LONG).show();




                        url = "http://www.detroitnews.com/sports/tigers/";
                        Bundle bundle = new Bundle();
                        bundle.putString("url", url);
                        fragment = new mlb_web_fragment();
                        fragment.setArguments(bundle);
                        FragmentTransaction transaction2 = getChildFragmentManager().beginTransaction();



                        transaction2.replace(R.id.for_web_view, fragment);
                        transaction2.addToBackStack("select2");
                        transaction2.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);

                        transaction2.commit();




                        Toast.makeText(getActivity(), "Tigerss selected .. opening up webview please wait", Toast.LENGTH_LONG).show();


                    }

                }
            });









        }

            if (current == Configuration.ORIENTATION_PORTRAIT) {


                view = inflater.inflate(R.layout.fragment_mlb_fragment, container, false);
                lv = (ListView) view.findViewById(R.id.fragment1_mlb);
                // adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_expandable_list_item_1,teams);
                adapter = new ArrayAdapter<String>(getActivity(), R.layout.activity_base_b, R.id.name, teams);
                lv.setAdapter(adapter);
                if (container == null) {
                    return null;
                }


                lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        view.setSelected(true);
                        String url = null;
                        Fragment fragment = null;
                        if (position == 0) {

                            url = "http://chicago.cubs.mlb.com/index.jsp?c_id=chc";


                            Bundle bundle = new Bundle();
                            bundle.putString("url", url);
                            fragment = new mlb_web_fragment();
                            fragment.setArguments(bundle);
                            FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
                            transaction.addToBackStack("select");
                            transaction.replace(R.id.mlb_list, fragment).commit();

                            Toast.makeText(getActivity(), "Cubs selected .. opening up webview please wait", Toast.LENGTH_LONG).show();


                        }
                        if (position == 1) {

                            url = "http://chicago.whitesox.mlb.com/index.jsp?c_id=cws";


                            Bundle bundle = new Bundle();
                            bundle.putString("url", url);
                            fragment = new mlb_web_fragment();
                            fragment.setArguments(bundle);
                            FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
                            transaction.addToBackStack("select");
                            transaction.replace(R.id.mlb_list, fragment).commit();

                            Toast.makeText(getActivity(), "Socks selected .. opening up webview please wait", Toast.LENGTH_LONG).show();


                        }
                        if (position == 2) {


                            url = "http://boston.redsox.mlb.com/index.jsp?c_id=bos";

                            Bundle bundle = new Bundle();
                            bundle.putString("url", url);
                            fragment = new mlb_web_fragment();
                            fragment.setArguments(bundle);
                            FragmentTransaction transaction = getChildFragmentManager().beginTransaction();

                            transaction.replace(R.id.mlb_list, fragment).commit();

                            Toast.makeText(getActivity(), " Red Socks selected .. opening up webview please wait", Toast.LENGTH_LONG).show();


                        }
                        if (position == 3) {

                            url = "http://newyork.mets.mlb.com/index.jsp?c_id=nym";


                            Bundle bundle = new Bundle();
                            bundle.putString("url", url);
                            fragment = new mlb_web_fragment();
                            fragment.setArguments(bundle);
                            FragmentTransaction transaction = getChildFragmentManager().beginTransaction();

                            transaction.replace(R.id.mlb_list, fragment).commit();

                            Toast.makeText(getActivity(), "Mets selected .. opening up webview please wait", Toast.LENGTH_LONG).show();


                        }
                        if (position == 4) {

                            url = "http://sanfrancisco.giants.mlb.com/index.jsp?c_id=sf";


                            Bundle bundle = new Bundle();
                            bundle.putString("url", url);
                            fragment = new mlb_web_fragment();
                            fragment.setArguments(bundle);
                            FragmentTransaction transaction = getChildFragmentManager().beginTransaction();

                            transaction.replace(R.id.mlb_list, fragment).commit();

                            Toast.makeText(getActivity(), "Giant selected .. opening up webview please wait", Toast.LENGTH_LONG).show();


                        }
                        if (position == 5) {

                            url = "http://detroit.tigers.mlb.com/index.jsp?c_id=det";


                            Bundle bundle = new Bundle();
                            bundle.putString("url", url);
                            fragment = new mlb_web_fragment();
                            fragment.setArguments(bundle);
                            FragmentTransaction transaction = getChildFragmentManager().beginTransaction();

                            transaction.replace(R.id.mlb_list, fragment).commit();

                            Toast.makeText(getActivity(), "Tigers selected .. opening up webview please wait", Toast.LENGTH_LONG).show();


                        }

                    }
                });
            }

        return view;

    }




}
