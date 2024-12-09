package com.company.views.view.cart;


import com.company.views.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.StandardView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "cart-view", layout = MainView.class)
@ViewController(id = "CartView")
@ViewDescriptor(path = "cart-view.xml")
public class CartView extends StandardView {
}