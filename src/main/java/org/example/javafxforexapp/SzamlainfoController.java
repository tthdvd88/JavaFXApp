package org.example.javafxforexapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import com.oanda.v20.account.AccountID;
import com.oanda.v20.Context;
import com.oanda.v20.ContextBuilder;
import com.oanda.v20.pricing.ClientPrice;
import com.oanda.v20.pricing.PricingGetRequest;
import com.oanda.v20.pricing.PricingGetResponse;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SzamlainfoController {
    @FXML
    private TableView<String> szamlainfoTv;
    @FXML
    private TableColumn<?,String> szamlainfoCol;


    public void szamlainfoButtonClick() {
        try{
            Context ctx = new ContextBuilder(Config.URL).setToken(Config.TOKEN).setApplication("PricePolling").build();
            AccountID accountId = Config.ACCOUNTID;
            List<String> instruments = new ArrayList<>( Arrays.asList("EUR_USD","USD_JPY","GBP_USD","USD_CHF"));
            PricingGetRequest request = new PricingGetRequest(accountId, instruments);
            PricingGetResponse resp = ctx.pricing.get(request);
            for (ClientPrice price : resp.getPrices())
                szamlainfoCol.setText(price.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}