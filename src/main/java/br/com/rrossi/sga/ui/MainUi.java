package br.com.rrossi.sga.ui;

import br.com.rrossi.sga.ui.view.*;
import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.navigator.SpringNavigator;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.UI;
import com.vaadin.ui.themes.ValoTheme;
import org.springframework.beans.factory.annotation.Autowired;
import org.vaadin.viritin.layouts.MHorizontalLayout;
import org.vaadin.viritin.layouts.MVerticalLayout;

@SpringUI
@Theme("valo")
public class MainUi extends UI {
    private MainView mainContent;

    @Autowired
    public MainUi(MainView mainContent, SpringNavigator navigator) {
        this.mainContent = mainContent;
        navigator.setErrorView(ErrorView.class);
    }

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        setContent(
                new MHorizontalLayout()
                        .add(createNavigationBar())
                        .expand(mainContent)
                        .withFullHeight()
        );
        getNavigator().navigateTo(LoginView.VIEW_NAME);
    }


    private Component createNavigationBar() {
        MVerticalLayout m = new MVerticalLayout().withWidth("300px");
        m.addComponent(createNavButton("First", LoginView.VIEW_NAME));
        m.addComponent(createNavButton("Second", TesteView.VIEW_NAME));
        m.addComponent(createNavButton("THIRD", RegisterUserView.VIEW_NAME));
        return m;
    }

    private Component createNavButton(String caption, String view) {
        Button button = new Button(caption);
        button.addClickListener(e->getNavigator().navigateTo(view));
        button.addStyleName(ValoTheme.BUTTON_LARGE);
        button.addStyleName(ValoTheme.BUTTON_LINK);
        return button;
    }
}
