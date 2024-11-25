package org.example.javafxforexapp;
import com.oanda.v20.ContextBuilder;
import com.oanda.v20.pricing.ClientPrice;
import com.oanda.v20.pricing.PricingGetRequest;
import com.oanda.v20.pricing.PricingGetResponse;
import com.oanda.v20.account.AccountID;
import com.oanda.v20.Context;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AktualarController {

    @FXML
    public ComboBox aktualarComBox;
    @FXML
    public TextArea aktualarTextArea;

    @FXML
    private void initialize() {
        aktualarComBox.getItems().addAll("EUR_USD","USD_JPY","GBP_USD","USD_CHF");
    }

    @FXML
    private void buttonClick() {
        if (aktualarComBox.getValue() == "EUR_USD"){
            showArfolyam1();
        } else if (aktualarComBox.getValue() == "USD_JPY") {
            showArfolyam2();
        } else if (aktualarComBox.getValue() == "GBP_USD") {
            showArfolyam3();
        } else if (aktualarComBox.getValue() == "USD_CHF") {
            showArfolyam4();
        }
    }

    private void showArfolyam1() {
        try {
            Context ctx = new ContextBuilder(Config.URL).setToken(Config.TOKEN).setApplication("PricePolling").build();
            AccountID accountId = Config.ACCOUNTID;
            List<String> instruments = new ArrayList<>( Arrays.asList("EUR_USD"));
            PricingGetRequest request = new PricingGetRequest(accountId,instruments);
            PricingGetResponse resp = ctx.pricing.get(request);
            for (ClientPrice price : resp.getPrices())
                aktualarTextArea.setText(aktualarTextArea.getText() + price.toString());
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private void showArfolyam2() {
        try {
            Context ctx = new ContextBuilder(Config.URL).setToken(Config.TOKEN).setApplication("PricePolling").build();
            AccountID accountId = Config.ACCOUNTID;
            List<String> instruments = new ArrayList<>( Arrays.asList("USD_JPY"));
            PricingGetRequest request = new PricingGetRequest(accountId,instruments);
            PricingGetResponse resp = ctx.pricing.get(request);
            for (ClientPrice price : resp.getPrices())
                aktualarTextArea.setText(aktualarTextArea.getText() + price.toString());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    private void showArfolyam3() {
        try {
            Context ctx = new ContextBuilder(Config.URL).setToken(Config.TOKEN).setApplication("PricePolling").build();
            AccountID accountId = Config.ACCOUNTID;
            List<String> instruments = new ArrayList<>( Arrays.asList("GBP_USD"));
            PricingGetRequest request = new PricingGetRequest(accountId,instruments);
            PricingGetResponse resp = ctx.pricing.get(request);
            for (ClientPrice price : resp.getPrices())
                aktualarTextArea.setText(aktualarTextArea.getText() + price.toString());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    private void showArfolyam4() {
        try {
            Context ctx = new ContextBuilder(Config.URL).setToken(Config.TOKEN).setApplication("PricePolling").build();
            AccountID accountId = Config.ACCOUNTID;
            List<String> instruments = new ArrayList<>( Arrays.asList("USD_CHF"));
            PricingGetRequest request = new PricingGetRequest(accountId,instruments);
            PricingGetResponse resp = ctx.pricing.get(request);
            for (ClientPrice price : resp.getPrices())
                aktualarTextArea.setText(aktualarTextArea.getText() + price.toString());
        } catch (Exception e){
            e.printStackTrace();
        }
    }


}
