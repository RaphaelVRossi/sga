package br.com.rrossi.sga.ui.view;

import br.com.rrossi.sga.ui.MainUi;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import javax.annotation.PostConstruct;

@SpringView(name = TesteView.VIEW_NAME, ui = MainUi.class)
public class TesteView extends VerticalLayout implements View {
    public final static String VIEW_NAME = "";

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
    }

    @PostConstruct
    void init() {
        addComponent(new Label("Esse é o teste"));
    }
}
