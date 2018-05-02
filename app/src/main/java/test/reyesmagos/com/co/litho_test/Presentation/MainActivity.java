package test.reyesmagos.com.co.litho_test.Presentation;

import android.app.Activity;
import android.os.Bundle;

import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.LithoView;
import com.facebook.litho.sections.SectionContext;
import com.facebook.litho.sections.widget.RecyclerCollectionComponent;
import com.facebook.litho.widget.RecyclerBinder;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ComponentContext componentContext = new ComponentContext(this);

        final Component component =
                RecyclerCollectionComponent.create(componentContext)
                        .disablePTR(true)
                        .section(ListSection.create(new SectionContext(componentContext)).build())
                        .build();

        setContentView(LithoView.create(componentContext, component));

    }
}
