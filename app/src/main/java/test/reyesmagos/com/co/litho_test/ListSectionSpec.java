package test.reyesmagos.com.co.litho_test;

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
                            .name(i + " Hello World")
                            .age("Litho test")
                            .build())
            );
        }
        builder.child(SingleComponentSection.create(c)
            .component(text).build());

        return builder.build();
    }

}
