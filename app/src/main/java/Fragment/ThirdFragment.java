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
public class ThirdFragment extends Fragment implements View.OnClickListener {

private Button BtnCalc;
private EditText EtHeight,EtBase;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_third, container, false);
        EtHeight=view.findViewById(R.id.EtHeight);
        EtBase=view.findViewById(R.id.Etbase);

        BtnCalc=view.findViewById(R.id.btnCalc);

        BtnCalc.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {
        Float height=Float.parseFloat(EtHeight.getText().toString());
        Float base=Float.parseFloat(EtBase.getText().toString());

        Float area=0.5f*(base*height);

        Toast.makeText(getActivity(),"Area of Triangle"+area,Toast.LENGTH_LONG).show();
    }
}
