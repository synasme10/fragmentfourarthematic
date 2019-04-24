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
public class FourthFragment extends Fragment implements View.OnClickListener {

    private Button btnCalculate;
    private EditText EtPrinciple,EtRate,EtTime;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_fourth, container, false);

        EtPrinciple=view.findViewById(R.id.EtPrinciple);
        EtRate=view.findViewById(R.id.EtRate);
        EtTime=view.findViewById(R.id.Etbase);

        btnCalculate=view.findViewById(R.id.btnCalculate);
        btnCalculate.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        float principle=Float.parseFloat(EtPrinciple.getText().toString());
        float time=Float.parseFloat(EtTime.getText().toString());
        float rate=Float.parseFloat(EtRate.getText().toString());

        float SI=(principle*time*rate)/100;

        Toast.makeText(getActivity(),"Simple Interest is: "+SI,Toast.LENGTH_LONG).show();
    }
}
