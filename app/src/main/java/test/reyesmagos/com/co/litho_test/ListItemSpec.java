package test.reyesmagos.com.co.litho_test;

import com.facebook.litho.Column;
import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.Row;
import com.facebook.litho.annotations.LayoutSpec;
import com.facebook.litho.annotations.OnCreateLayout;
import com.facebook.litho.annotations.Prop;
import com.facebook.litho.widget.Image;
import com.facebook.litho.widget.Text;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaEdge;

@LayoutSpec
public class ListItemSpec {

    @OnCreateLayout
    static Component onCreateLayout(ComponentContext c,
                                    @Prop String name,
                                    @Prop String age){

        final Column componentLayout = Column.create(c)
                .paddingDip(YogaEdge.ALL, 16)
                .flexGrow(1)
                .child(
                        Text.create(c)
                                .text(name)
                                .textSizeSp(30)
                )
                .child(
                        Text.create(c)
                        .text(age)
                        .textSizeSp(15)
                )
                .build();


        return Row.create(c)
                .paddingDip(YogaEdge.ALL, 16)
                .child(Image.create(c)
                        .drawableRes(R.drawable.ic_launcher_background)
                        .widthDip(60)
                        .heightDip(60)
                        .alignSelf(YogaAlign.CENTER))
                .child(componentLayout).build();

    }
}
