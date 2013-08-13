package eu.jedrzej;

import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;

	public HomePage(final PageParameters parameters) {
		super(parameters);

		add(new Label("version", getApplication().getFrameworkSettings().getVersion()));
        add(new Label("helloMessage", "Hello, Wicket!"));
//        add(new Label("dummy", "dummy error"));

        add(new Link("linkId") {

            @Override
            public void onClick() {
                setResponsePage(HomePage.class);
            }
        });
    }
}
