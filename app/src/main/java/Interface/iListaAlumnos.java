package Interface;

import android.content.Context;
import android.widget.AdapterView;
import android.widget.Toast;

public class iListaAlumnos  implements AdapterView.OnItemClickListener{
    Context ctx;

    public void iListaAlumnos(Context ctx){ this.ctx=ctx;
        @Override
                public void onItemClick(AdapterView<> adapterView, View view, int i, long l){
            Toast.makkeText(ctx, "ha seleccionado al alumno: "
            + adapterView.getrItemAtPosition(i).toString(), Toast.LENGTH_SHORT.SHOW();
        }
    }

}
