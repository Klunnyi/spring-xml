package ua.klunnyi.springcourse.music.testBean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import static lombok.AccessLevel.*;

/**
 * @author Serhii Klunniy
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = PRIVATE)
public class TestBean {

    String name;

}
