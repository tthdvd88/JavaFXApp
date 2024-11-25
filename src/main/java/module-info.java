module org.example.javafxforexapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires gson;
    requires httpcore;
    requires httpclient;
    requires java.sql;
    opens org.example.javafxforexapp to javafx.fxml;
    opens com.oanda.v20;
    opens com.oanda.v20.account;
    opens com.oanda.v20.pricing;
    opens com.oanda.v20.pricing_common;
    opens com.oanda.v20.order;
    opens com.oanda.v20.instrument;
    opens com.oanda.v20.transaction;
    opens com.oanda.v20.trade;
    exports org.example.javafxforexapp;
    exports com.oanda.v20.primitives;
    exports com.oanda.v20.transaction;
    exports com.oanda.v20.pricing_common;
    exports com.oanda.v20.order;
    exports com.oanda.v20.trade;
}