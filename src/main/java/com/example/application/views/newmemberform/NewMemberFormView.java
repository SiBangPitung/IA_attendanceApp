package com.example.application.views.newmemberform;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import com.vaadin.flow.theme.lumo.LumoUtility.Padding;
import jakarta.annotation.security.RolesAllowed;

@PageTitle("New Member Form")
@Route(value = "new-member-form", layout = MainLayout.class)
@RolesAllowed("USER")
@Uses(Icon.class)
public class NewMemberFormView extends Composite<VerticalLayout> {

    public NewMemberFormView() {
        HorizontalLayout layoutRow = new HorizontalLayout();
        VerticalLayout layoutColumn5 = new VerticalLayout();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        H3 h3 = new H3();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        VerticalLayout layoutColumn3 = new VerticalLayout();
        TextField textField = new TextField();
        EmailField emailField = new EmailField();
        VerticalLayout layoutColumn4 = new VerticalLayout();
        TextField textField2 = new TextField();
        HorizontalLayout layoutRow3 = new HorizontalLayout();
        DatePicker datePicker = new DatePicker();
        HorizontalLayout layoutRow4 = new HorizontalLayout();
        Button buttonPrimary = new Button();
        Button buttonSecondary = new Button();
        VerticalLayout layoutColumn6 = new VerticalLayout();
        getContent().setWidthFull();
        getContent().addClassName(Padding.LARGE);
        layoutRow.setWidthFull();
        layoutRow.setFlexGrow(1.0, layoutColumn5);
        layoutColumn5.setWidth(null);
        layoutRow.setFlexGrow(1.0, layoutColumn2);
        layoutColumn2.setWidth(null);
        h3.setText("Personal Information");
        layoutRow2.setWidthFull();
        layoutRow2.addClassName(Gap.LARGE);
        layoutRow2.setFlexGrow(1.0, layoutColumn3);
        layoutColumn3.setWidth(null);
        textField.setLabel("First Name");
        textField.setWidthFull();
        emailField.setLabel("school ID");
        emailField.setWidthFull();
        layoutRow2.setFlexGrow(1.0, layoutColumn4);
        layoutColumn4.setWidth(null);
        textField2.setLabel("Last Name");
        textField2.setWidthFull();
        layoutRow3.addClassName(Gap.MEDIUM);
        layoutRow3.setWidthFull();
        datePicker.setLabel("time joined");
        layoutRow3.setFlexGrow(1.0, datePicker);
        layoutRow4.addClassName(Gap.MEDIUM);
        buttonPrimary.setText("Save");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonSecondary.setText("Cancel");
        layoutRow.setFlexGrow(1.0, layoutColumn6);
        layoutColumn6.setWidth(null);
        getContent().add(layoutRow);
        layoutRow.add(layoutColumn5);
        layoutRow.add(layoutColumn2);
        layoutColumn2.add(h3);
        layoutColumn2.add(layoutRow2);
        layoutRow2.add(layoutColumn3);
        layoutColumn3.add(textField);
        layoutColumn3.add(emailField);
        layoutRow2.add(layoutColumn4);
        layoutColumn4.add(textField2);
        layoutColumn4.add(layoutRow3);
        layoutRow3.add(datePicker);
        layoutColumn2.add(layoutRow4);
        layoutRow4.add(buttonPrimary);
        layoutRow4.add(buttonSecondary);
        layoutRow.add(layoutColumn6);
    }
}
