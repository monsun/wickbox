package eu.jedrzej;

import org.apache.wicket.markup.html.WebPage;

/**
 * Created with IntelliJ IDEA.
 * User: jkalinowski
 * Date: 13.08.13
 * Time: 15:53
 */
public class SimpleLoginPage extends TemplatePage {

    public SimpleLoginPage() {
        super();
//        replace(new LoginFormPanel(CONTENT_ID));
        remove(CONTENT_ID);
        getMenuPanel().setVisible(false);
    }
}
