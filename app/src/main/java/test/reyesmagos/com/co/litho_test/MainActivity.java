package test.reyesmagos.com.co.litho_test;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.OrientationHelper;
import android.text.Layout;
import android.widget.LinearLayout;

import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.LithoView;
import com.facebook.litho.sections.SectionContext;
import com.facebook.litho.sections.widget.RecyclerCollectionComponent;
import com.facebook.litho.widget.LinearLayoutInfo;
import com.facebook.litho.widget.RecyclerBinder;
import com.facebook.litho.widget.Text;
import com.facebook.litho.widget.VerticalGravity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ComponentContext componentContext = new ComponentContext(this);

        Component textComponent = Text.create(componentContext)
                .text("Hello World")
                .textColor(Color.GREEN)
                .textSizeDip(28)
                .verticalGravity(VerticalGravity.CENTER)
                .textAlignment(Layout.Alignment.ALIGN_CENTER)
                .build();

        /*final LithoView lithoView = LithoView.create(
                this /* context ,
                ListItem.create(componentContext).build());*/

        final Component component =
                RecyclerCollectionComponent.create(componentContext)
                        .disablePTR(true)
                        .section(ListSection.create(new SectionContext(componentContext)).build())
                        .build();

        setContentView(LithoView.create(componentContext, component));

        //setContentView(lithoView);
    }
}
