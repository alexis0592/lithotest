package test.reyesmagos.com.co.litho_test.Presentation;

import android.view.View;
import android.widget.Toast;

import com.facebook.litho.sections.Children;
import com.facebook.litho.sections.SectionContext;
import com.facebook.litho.sections.annotations.GroupSectionSpec;
import com.facebook.litho.sections.annotations.OnCreateChildren;
import com.facebook.litho.sections.common.SingleComponentSection;

import java.util.ArrayList;
import java.util.List;

import test.reyesmagos.com.co.litho_test.Presentation.Model.Person;


@GroupSectionSpec
public class ListSectionSpec {

    private List<Person> personList;

    @OnCreateChildren
    static Children onCreateChildren(final SectionContext c){
        Children.Builder builder = Children.create();
        ListSectionSpec listSectionSpec = new ListSectionSpec();
        listSectionSpec.initializeData();

        for (int i = 0; i < listSectionSpec.personList.size(); i++){
            builder.child(
                    SingleComponentSection.create(c)
                    .key(String.valueOf(i))
                    .component(ListItem.create(c)
                            .name(listSectionSpec.personList.get(i).getName())
                            .age(listSectionSpec.personList.get(i).getAge())
                            .listener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Toast.makeText(c, "Toast", Toast.LENGTH_LONG).show();
                                }
                            })
                            .build())
            );
        }

        return builder.build();
    }

    private void initializeData(){
        personList = new ArrayList<>();

        for(int i = 0; i < 32; i++){
            personList.add(new Person("Persona " + i, i + " years"));
        }



    }

}
