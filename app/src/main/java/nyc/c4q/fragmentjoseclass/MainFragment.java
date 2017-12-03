package nyc.c4q.fragmentjoseclass;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;



/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    View rootView;
    TextView textView;
    Button button;

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_main, container, false);

        textView = rootView.findViewById(R.id.textview);
        button = rootView.findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                NextFragment nextFragment = new NextFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container ,nextFragment);
                fragmentTransaction.addToBackStack("next fragment");
                fragmentTransaction.commit();

            }
        });

        return rootView;

    }

}
