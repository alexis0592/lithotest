package test.reyesmagos.com.co.litho_test;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;

import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.LithoView;
import com.facebook.litho.widget.Text;
import com.facebook.litho.widget.VerticalGravity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ComponentContext c = new ComponentContext(this);

        Component textComponent = Text.create(c)
                .text("Hello World")
                .textColor(Color.GREEN)
                .textSizeDip(28)
                .verticalGravity(VerticalGravity.CENTER)
                .textAlignment(Layout.Alignment.ALIGN_CENTER)
                .build();

        final LithoView lithoView = LithoView.create(
                this /* context */,
                ListItem.create(c).build());

        setContentView(lithoView);
    }
}
