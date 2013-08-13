package eu.jedrzej;

import org.apache.wicket.Component;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

/**
 * Created with IntelliJ IDEA.
 * User: jkalinowski
 * Date: 13.08.13
 * Time: 14:36
 */
public class TemplatePage extends WebPage {

    public static final String CONTENT_ID = "content";

    private Component headerPanel;
    private Component menuPanel;
    private Component footerPanel;

    public TemplatePage() {
        add(headerPanel = new HeaderPanel("headerPanel"));
        add(menuPanel = new MenuPanel("menuPanel"));
        add(footerPanel = new FooterPanel("footerPanel"));

        add(new Label(CONTENT_ID, "Put your content here."));
    }

    public Component getHeaderPanel() {
        return headerPanel;
    }

    public Component getMenuPanel() {
        return menuPanel;
    }

    public Component getFooterPanel() {
        return footerPanel;
    }
}
