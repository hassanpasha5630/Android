package pashabrb.application3_;

/**
 * Created by Hassan on 3/22/2017.
 */

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class firstF extends Fragment {


    ArrayList<String> arrayList;
    private ArrayAdapter<String> adapter;
    ListView lv;

    public firstF() {

       
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       
        final web_view_fragment web = new web_view_fragment();
        String[] teams = {"Bulls", "Lakers", "Knicks", "Celtics", "Warriors", "Cavaliers"};
        View view = null;






        FragmentManager fragmentManager;



        int current = getResources().getConfiguration().orientation;
        if (current == Configuration.ORIENTATION_LANDSCAPE) {





            Toast.makeText(getActivity(), "LandScape changed", Toast.LENGTH_LONG).show();

            view = inflater.inflate(R.layout.nba_first_fargment, container, false);
            lv = (ListView) view.findViewById(R.id.fragment1);
         
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
                    if(position == 0 ){


                        view.setSelected(true);

                        setRetainInstance(false);

                        firstF f = new firstF();
                        getFragmentManager().findFragmentById(R.id.for_listview);

                        FragmentTransaction transaction = getFragmentManager().beginTransaction();

                        transaction.replace(R.id.for_listview,f).commit();


                        url = "http://www.nba.com/bulls/";


                        Bundle bundle = new Bundle();
                        bundle.putString("url", url);
                        fragment = new web_view_fragment();
                        fragment.setArguments(bundle);
                        FragmentTransaction transaction2 = getChildFragmentManager().beginTransaction();
                        transaction2.addToBackStack("select2");
                        transaction2.replace(R.id.for_web_view, fragment).commit();


                        Toast.makeText(getActivity(), "Bulls selected .. opening up webview please wait", Toast.LENGTH_LONG).show();

                    }
                    if (position == 1) {



                        firstF f = new firstF();
                        getFragmentManager().findFragmentById(R.id.for_listview);

                        FragmentTransaction transaction = getFragmentManager().beginTransaction();

                        transaction.replace(R.id.for_listview,f).commit();

                        url = "http://www.nba.com/lakers/";
                        Bundle bundle = new Bundle();
                        bundle.putString("url", url);
                        fragment = new web_view_fragment();
                        fragment.setArguments(bundle);
                        FragmentTransaction transaction2 = getChildFragmentManager().beginTransaction();

                        transaction2.replace(R.id.for_web_view, fragment);
                        transaction2.addToBackStack("select2");

                        transaction2.commit();


                        Toast.makeText(getActivity(), "Lakers selected.. opening up webview please wait", Toast.LENGTH_LONG).show();

                    }

                    if (position == 2) {



                        firstF f = new firstF();
                        getFragmentManager().findFragmentById(R.id.for_listview);

                        FragmentTransaction transaction = getFragmentManager().beginTransaction();

                        transaction.replace(R.id.for_listview,f).commit();

                        url = "http://www.espn.com/nba/team/_/name/ny/new-york-knicks/";;
                        Bundle bundle = new Bundle();
                        bundle.putString("url", url);
                        fragment = new web_view_fragment();
                        fragment.setArguments(bundle);
                        FragmentTransaction transaction2 = getChildFragmentManager().beginTransaction();

                        transaction2.replace(R.id.for_web_view, fragment);
                        transaction2.addToBackStack("select2");

                        transaction2.commit();


                        Toast.makeText(getActivity(), " Knicks selected.. opening up webview please wait", Toast.LENGTH_LONG).show();

                    }



                    if (position == 3) {



                        firstF f = new firstF();
                        getFragmentManager().findFragmentById(R.id.for_listview);

                        FragmentTransaction transaction = getFragmentManager().beginTransaction();

                        transaction.replace(R.id.for_listview,f).commit();

                        url = "http://www.nba.com/celtics/";
                        Bundle bundle = new Bundle();
                        bundle.putString("url", url);
                        fragment = new web_view_fragment();
                        fragment.setArguments(bundle);
                        FragmentTransaction transaction2 = getChildFragmentManager().beginTransaction();

                        transaction2.replace(R.id.for_web_view, fragment);
                        transaction2.addToBackStack("select2");

                        transaction2.commit();


                        Toast.makeText(getActivity(), "Celtics selected.. opening up webview please wait", Toast.LENGTH_LONG).show();

                    }


                    if (position == 4) {



                        firstF f = new firstF();
                        getFragmentManager().findFragmentById(R.id.for_listview);

                        FragmentTransaction transaction = getFragmentManager().beginTransaction();

                        transaction.replace(R.id.for_listview,f).commit();

                        url = "http://www.nba.com/warriors/";
                        Bundle bundle = new Bundle();
                        bundle.putString("url", url);
                        fragment = new web_view_fragment();
                        fragment.setArguments(bundle);
                        FragmentTransaction transaction2 = getChildFragmentManager().beginTransaction();

                        transaction2.replace(R.id.for_web_view, fragment);
                        transaction2.addToBackStack("select2");

                        transaction2.commit();


                        Toast.makeText(getActivity(), "Warriors selected.. opening up webview please wait", Toast.LENGTH_LONG).show();

                    }


                    if (position == 5) {



                        firstF f = new firstF();
                        getFragmentManager().findFragmentById(R.id.for_listview);

                        FragmentTransaction transaction = getFragmentManager().beginTransaction();

                        transaction.replace(R.id.for_listview,f).commit();

                        url = "http://www.nba.com/cavaliers/";
                        Bundle bundle = new Bundle();
                        bundle.putString("url", url);
                        fragment = new web_view_fragment();
                        fragment.setArguments(bundle);
                        FragmentTransaction transaction2 = getChildFragmentManager().beginTransaction();

                        transaction2.replace(R.id.for_web_view, fragment);
                        transaction2.addToBackStack("select2");

                        transaction2.commit();


                        Toast.makeText(getActivity(), " Cavs selected.. opening up webview please wait", Toast.LENGTH_LONG).show();

                    }


                }
            });








        }

        if (current == Configuration.ORIENTATION_PORTRAIT) {





            view = inflater.inflate(R.layout.nba_first_fargment, container, false);
            lv = (ListView) view.findViewById(R.id.fragment1);
           
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
                    if (position == 0) {

                        url = "http://www.nba.com/bulls/";


                        Bundle bundle = new Bundle();
                        bundle.putString("url", url);
                        fragment = new web_view_fragment();
                        fragment.setArguments(bundle);
                        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();

                        transaction.replace(R.id.list_fragment, fragment).commit();
                         transaction.addToBackStack("select");



                        Toast.makeText(getActivity(), "Bulls selected .. opening up webview please wait", Toast.LENGTH_LONG).show();


       

                    }

                    if (position == 1) {

                        url = "http://www.nba.com/lakers/";
                        Bundle bundle = new Bundle();
                        bundle.putString("url", url);
                        fragment = new web_view_fragment();
                        fragment.setArguments(bundle);
                        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();

                        transaction.replace(R.id.list_fragment, fragment);
                        transaction.addToBackStack("select");
              
                        transaction.commit();


                        Toast.makeText(getActivity(), "Lakers selected.. opening up webview please wait", Toast.LENGTH_LONG).show();

                    }


                    if (position == 3) {
                        url = "http://www.nba.com/celtics/";
                        Bundle bundle = new Bundle();
                        bundle.putString("url", url);
                        fragment = new web_view_fragment();
                        fragment.setArguments(bundle);
                        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
                        transaction.addToBackStack("select");
                        transaction.replace(R.id.list_fragment, fragment).commit();

                        Toast.makeText(getActivity(), " Celtics selected.. opening up webview please wait", Toast.LENGTH_LONG).show();

                    }


                    if (position == 4) {
                        url = "http://www.nba.com/warriors/";
                        Bundle bundle = new Bundle();
                        bundle.putString("url", url);
                        fragment = new web_view_fragment();
                        fragment.setArguments(bundle);
                        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
                        transaction.addToBackStack("select");
                        transaction.replace(R.id.list_fragment, fragment).commit();

                        Toast.makeText(getActivity(), " Warriors selected.. opening up webview please wait", Toast.LENGTH_LONG).show();

                    }

                    if (position == 5) {
                        url = "http://www.nba.com/cavaliers/";
                        Bundle bundle = new Bundle();
                        bundle.putString("url", url);
                        fragment = new web_view_fragment();
                        fragment.setArguments(bundle);
                        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
                        transaction.addToBackStack("select");
                        transaction.replace(R.id.list_fragment, fragment).commit();
                        Toast.makeText(getActivity(), " Cavs selected .. opening up webview please wait", Toast.LENGTH_LONG).show();

                    }


                    if (position == 2) {
                        url = "http://www.espn.com/nba/team/_/name/ny/new-york-knicks/";
                        Bundle bundle = new Bundle();
                        bundle.putString("url", url);
                        fragment = new web_view_fragment();
                        fragment.setArguments(bundle);
                        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
                        transaction.addToBackStack("select");
                        transaction.replace(R.id.list_fragment, fragment).commit();
                        Toast.makeText(getActivity(), " Knicks selected.. opening up webview please wait", Toast.LENGTH_LONG).show();

                    }
                }
            });

        }

        return view;





    }




}

