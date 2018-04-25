package test.reyesmagos.com.co.litho_test;

import android.graphics.Color;

import com.facebook.litho.Component;
import com.facebook.litho.sections.Children;
import com.facebook.litho.sections.SectionContext;
import com.facebook.litho.sections.annotations.GroupSectionSpec;
import com.facebook.litho.sections.annotations.OnCreateChildren;
import com.facebook.litho.sections.common.SingleComponentSection;
import com.facebook.litho.widget.Text;

@GroupSectionSpec
public class ListSectionSpec {

    @OnCreateChildren
    static Children onCreateChildren(final SectionContext c){
        Children.Builder builder = Children.create();

        Component text = Text.create(c)
                .text("title6")
                .textSizeSp(24)
                .build();

        for (int i = 0; i < 32; i++){
            builder.child(
                    SingleComponentSection.create(c)
                    .key(String.valueOf(i))
                    .component(ListItem.create(c)
                            .color(i % 2 == 0 ? Color.WHITE : Color.rgb(220, 220, 220))
                            .title(i + " Hello World")
                            .subtitle("Litho test")
                            .build())
            );
        }
        builder.child(SingleComponentSection.create(c)
            .component(text).build());

        return builder.build();
    }

}
