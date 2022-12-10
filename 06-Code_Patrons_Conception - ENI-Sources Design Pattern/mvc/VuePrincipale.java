package com.example.mvc;

import java.util.List;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Label;
import com.vaadin.ui.NativeButton;
import com.vaadin.ui.NativeSelect;

public class VuePrincipale extends CustomComponent
    implements Observateur {
  private static final long serialVersionUID = 1L;
  BaseVehicules modele;
  @AutoGenerated
  private AbsoluteLayout mainLayout;
  @AutoGenerated
  private NativeSelect menuChoix;
  @AutoGenerated
  private NativeButton boutonAvisSuivant;
  @AutoGenerated
  private Label champPrix;
  @AutoGenerated
  private Label champModele;
  @AutoGenerated
  private Label champMarque;
  @AutoGenerated
  private Label champAvis;
  @AutoGenerated
  private Label labelPrix;
  @AutoGenerated
  private Label labelModele;
  @AutoGenerated
  private Label labelMarque;

  public VuePrincipale(BaseVehicules modele) {
    this.modele = modele;
    buildMainLayout();
    setCompositionRoot(mainLayout);
    modele.ajoute(this);
    menuChoix
        .addListener(new ControleurMenuChoix(modele));
    boutonAvisSuivant
        .addListener(new ControleurBoutonAvisSuivant(
            modele, this));
    actualise();
  }

  @AutoGenerated
  private AbsoluteLayout buildMainLayout() {
    // common part: create layout
    mainLayout = new AbsoluteLayout();
    mainLayout.setImmediate(false);
    mainLayout.setWidth("540px");
    mainLayout.setHeight("520px");
    mainLayout.setMargin(false);
    // top-level component properties
    setWidth("540px");
    setHeight("520px");
    // labelMarque
    labelMarque = new Label();
    labelMarque.setImmediate(false);
    labelMarque.setWidth("-1px");
    labelMarque.setHeight("-1px");
    labelMarque.setValue("Marque");
    mainLayout.addComponent(
        labelMarque, "top:140.0px;left:49.0px;");
    // labelModele
    labelModele = new Label();
    labelModele.setImmediate(false);
    labelModele.setWidth("51px");
    labelModele.setHeight("-1px");
    labelModele.setValue("Modele");
    mainLayout.addComponent(
        labelModele, "top:180.0px;left:49.0px;");
    // labelPrix
    labelPrix = new Label();
    labelPrix.setImmediate(false);
    labelPrix.setWidth("-1px");
    labelPrix.setHeight("-1px");
    labelPrix.setValue("Prix");
    mainLayout.addComponent(
        labelPrix, "top:220.0px;left:49.0px;");
    // champAvis
    champAvis = new Label();
    champAvis.setWidth("331px");
    champAvis.setHeight("140px");
    mainLayout.addComponent(
        champAvis, "top:320.0px;left:49.0px;");
    // champMarque
    champMarque = new Label();
    champMarque.setWidth("240px");
    champMarque.setHeight("-1px");
    mainLayout.addComponent(
        champMarque, "top:140.0px;left:140.0px;");
    // champModele
    champModele = new Label();
    champModele.setWidth("240px");
    champModele.setHeight("-1px");
    mainLayout.addComponent(
        champModele, "top:180.0px;left:140.0px;");
    // champPrix
    champPrix = new Label();
    champPrix.setWidth("240px");
    champPrix.setHeight("-1px");
    mainLayout.addComponent(
        champPrix, "top:220.0px;left:140.0px;");
    // boutonAvisSuivant
    boutonAvisSuivant = new NativeButton();
    boutonAvisSuivant.setCaption("Avis suivant");
    boutonAvisSuivant.setImmediate(true);
    boutonAvisSuivant.setWidth("120px");
    boutonAvisSuivant.setHeight("-1px");
    mainLayout.addComponent(
        boutonAvisSuivant, "top:262.0px;left:140.0px;");
    // menuChoix
    menuChoix = new NativeSelect();
    menuChoix.setImmediate(true);
    menuChoix.setNullSelectionAllowed(false);
    menuChoix.setWidth("240px");
    menuChoix.setHeight("23px");
    mainLayout.addComponent(
        menuChoix, "top:60.0px;left:140.0px;");
    return mainLayout;
  }

  public void actualise() {
    menuChoix.removeAllItems();
    List<BaseVehicules.VehiculeDescription> listeVehicules =
        modele
            .getListeVehicules();
    int indiceVehiculeCourant =
        modele.getIndiceVehiculeCourant();
    for (BaseVehicules.VehiculeDescription description : listeVehicules) {
      menuChoix.addItem(description);
      if (description.getIndice() == indiceVehiculeCourant)
        menuChoix.select(description);
    }
    champMarque.setValue(modele.getMarqueCourante());
    champModele.setValue(modele.getModeleCourant());
    champPrix.setValue(modele.getPrixCourant());
  }

  public void afficheAvis(int indiceAvis) {
    champAvis.setValue(modele.getAvis(indiceAvis));
  }
}
