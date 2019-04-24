package Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fragment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment implements View.OnClickListener{

    private Button btnAreaOfCircle;
    private EditText EtRadius;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_second, container, false);

        EtRadius=view.findViewById(R.id.EtRadius);
        btnAreaOfCircle=view.findViewById(R.id.btnAreaOfCircle);

        btnAreaOfCircle.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        float radius= Float.parseFloat(EtRadius.getText().toString());
        float area=3.14f*radius*radius;

        Toast.makeText(getActivity(),"Area of Circle: "+area,Toast.LENGTH_LONG).show();
    }
}
