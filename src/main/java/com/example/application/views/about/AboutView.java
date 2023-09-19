package com.example.application.views.about;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;

@PageTitle("About")
@Route(value = "about", layout = MainLayout.class)
@PermitAll
@Uses(Icon.class)
public class AboutView extends Composite<VerticalLayout> {

    public AboutView() {
        Paragraph textLarge = new Paragraph();
        getContent().setHeightFull();
        getContent().setWidthFull();
        textLarge.setText(
                "Welcome to the Club Attendance Management Platform. We are dedicated to providing a practical and efficient solution for clubs of all types to maintain accurate attendance records. Our platform offers straightforward tools designed to simplify the process of tracking member participation. With customizable attendance forms and real-time reporting, managing your club's attendance has never been easier. Our system helps clubs maintain organized records without the need for time-consuming manual tracking. Join us today and experience an efficient and reliable way to manage attendance for your club.");
        getContent().setAlignSelf(FlexComponent.Alignment.START, textLarge);
        textLarge.getStyle().set("font-size", "var(--lumo-font-size-xl)");
        getContent().add(textLarge);
    }
}
