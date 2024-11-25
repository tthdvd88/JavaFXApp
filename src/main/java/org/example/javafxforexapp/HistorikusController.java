package org.example.javafxforexapp;
import com.oanda.v20.ContextBuilder;
import com.oanda.v20.instrument.Candlestick;
import com.oanda.v20.instrument.InstrumentCandlesRequest;
import com.oanda.v20.instrument.InstrumentCandlesResponse;
import com.oanda.v20.primitives.InstrumentName;
import com.oanda.v20.Context;
import javafx.fxml.FXML;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.*;

import java.time.LocalDate;

import static com.oanda.v20.instrument.CandlestickGranularity.H1;


public class HistorikusController {

    @FXML
    private ComboBox devizaComBox;
    @FXML
    private DatePicker startDate;
    @FXML
    private DatePicker endDate;
    @FXML
    private AreaChart<String, String> arvaltGrafikon;
    @FXML
    private CategoryAxis idoTengely;
    @FXML
    private NumberAxis arTengely;
    @FXML
    private Button searchButton;
    @FXML
    private TableView<String> arvaltTv;
    @FXML
    private TableColumn<String, String> arvaltCol;
    @FXML
    private TableColumn<LocalDate, LocalDate> kezdodatumCol;
    @FXML
    private TableColumn<LocalDate, LocalDate> vegdatumCol;


    @FXML
    private void initialize() {
        devizaComBox.getItems().addAll("EUR_USD","USD_JPY","GBP_USD","USD_CHF");
    }

    @FXML
    private void buttonClick() {
        if (devizaComBox.getValue() == "EUR_USD"){
            showArValtozas1();
            datumBeallit();
        } else if (devizaComBox.getValue() == "USD_JPY") {
            showArValtozas2();
            datumBeallit();
        } else if (devizaComBox.getValue() == "GBP_USD") {
            showArValtozas3();
            datumBeallit();
        } else if (devizaComBox.getValue() == "USD_CHF") {
            showArValtozas4();
            datumBeallit();
        }
    }

    public void showArValtozas1() {

        try {
            Context ctx = new ContextBuilder(Config.URL).setToken(Config.TOKEN).setApplication("ArValtozas").build();
            InstrumentCandlesRequest request = new InstrumentCandlesRequest(new InstrumentName("EUR_USD"));
            request.setGranularity(H1);
            request.setCount(10L);
            InstrumentCandlesResponse resp = ctx.instrument.candles(request);
            for (Candlestick candle : resp.getCandles())
                arvaltCol.setText(candle.toString());
            for (Candlestick candle: resp.getCandles())
                arvaltCol.setText(candle.toString()+"\n" + candle.getTime()+ "\t" +candle.getMid());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void showArValtozas2() {

        try {
            Context ctx = new ContextBuilder(Config.URL).setToken(Config.TOKEN).setApplication("ArValtozas").build();
            InstrumentCandlesRequest request = new InstrumentCandlesRequest(new InstrumentName("USD_JPY"));
            request.setGranularity(H1);
            request.setCount(10L);
            InstrumentCandlesResponse resp = ctx.instrument.candles(request);
            for (Candlestick candle : resp.getCandles())
                arvaltCol.setText(candle.toString());
            for (Candlestick candle: resp.getCandles())
                arvaltCol.setText(candle.toString()+"\n" + candle.getTime()+ "\t" +candle.getMid());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void showArValtozas3() {

        try {
            Context ctx = new ContextBuilder(Config.URL).setToken(Config.TOKEN).setApplication("ArValtozas").build();
            InstrumentCandlesRequest request = new InstrumentCandlesRequest(new InstrumentName("GBP_USD"));
            request.setGranularity(H1);
            request.setCount(10L);
            InstrumentCandlesResponse resp = ctx.instrument.candles(request);
            for (Candlestick candle : resp.getCandles())
                arvaltCol.setText(candle.toString());
            for (Candlestick candle: resp.getCandles())
                arvaltCol.setText(candle.toString()+"\n" + candle.getTime()+ "\t" +candle.getMid());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void showArValtozas4() {

        try {
            Context ctx = new ContextBuilder(Config.URL).setToken(Config.TOKEN).setApplication("ArValtozas").build();
            InstrumentCandlesRequest request = new InstrumentCandlesRequest(new InstrumentName("USD_CHF"));
            request.setGranularity(H1);
            request.setCount(10L);
            InstrumentCandlesResponse resp = ctx.instrument.candles(request);
            for (Candlestick candle : resp.getCandles())
                arvaltCol.setText(candle.toString());
            for (Candlestick candle: resp.getCandles())
                arvaltCol.setText(candle.toString()+"\n" + candle.getTime()+ "\t" +candle.getMid());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void datumBeallit() {
        kezdodatumCol.setText(startDate.getValue().toString());
        vegdatumCol.setText(endDate.getValue().toString());
    }


}
