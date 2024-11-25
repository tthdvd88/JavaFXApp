package com.oanda.v20.trade;

import java.util.ArrayList;
import java.util.Collection;
import java.math.BigDecimal;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.order.OrderID;
import com.oanda.v20.pricing_common.PriceValue;
import com.oanda.v20.primitives.AccountUnits;
import com.oanda.v20.primitives.DateTime;
import com.oanda.v20.primitives.DecimalNumber;
import com.oanda.v20.primitives.InstrumentName;
import com.oanda.v20.transaction.ClientExtensions;
import com.oanda.v20.transaction.TransactionID;

/**
 * The summary of a Trade within an Account. This representation does not
 * provide the full details of the Trade's dependent Orders.
 * <p>
 * {currentUnits} ({initialUnits}) of {instrument} @ {price}
 */
public class TradeSummary {

    /**
     * Default constructor.
     */
    public TradeSummary() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the TradeSummary to copy
     */
    public TradeSummary(TradeSummary other) {
        this.id = other.id;
        this.instrument = other.instrument;
        this.price = other.price;
        this.openTime = other.openTime;
        this.state = other.state;
        this.initialUnits = other.initialUnits;
        this.initialMarginRequired = other.initialMarginRequired;
        this.currentUnits = other.currentUnits;
        this.realizedPL = other.realizedPL;
        this.unrealizedPL = other.unrealizedPL;
        this.marginUsed = other.marginUsed;
        this.averageClosePrice = other.averageClosePrice;
        if (other.closingTransactionIDs != null)
        {
            this.closingTransactionIDs = new ArrayList<TransactionID>(other.closingTransactionIDs);
        }
        this.financing = other.financing;
        this.closeTime = other.closeTime;
        if (other.clientExtensions != null)
        {
            this.clientExtensions = new ClientExtensions(other.clientExtensions);
        }
        this.takeProfitOrderID = other.takeProfitOrderID;
        this.stopLossOrderID = other.stopLossOrderID;
        this.trailingStopLossOrderID = other.trailingStopLossOrderID;
    }

    @SerializedName("id") private TradeID id;

    /**
     * Get the Trade ID
     * <p>
     * The Trade's identifier, unique within the Trade's Account.
     * <p>
     * @return the Trade ID
     * @see TradeID
     */
    public TradeID getId() {
        return this.id;
    }

    /**
     * Set the Trade ID
     * <p>
     * The Trade's identifier, unique within the Trade's Account.
     * <p>
     * @param id the Trade ID as a TradeID
     * @return {@link TradeSummary TradeSummary}
     * @see TradeID
     */
    public TradeSummary setId(TradeID id) {
        this.id = id;
        return this;
    }
    /**
     * Set the Trade ID
     * <p>
     * The Trade's identifier, unique within the Trade's Account.
     * <p>
     * @param id the Trade ID as a String
     * @return {@link TradeSummary TradeSummary}
     * @see TradeID
     */
    public TradeSummary setId(String id) {
        this.id = new TradeID(id);
        return this;
    }

    @SerializedName("instrument") private InstrumentName instrument;

    /**
     * Get the Instrument
     * <p>
     * The Trade's Instrument.
     * <p>
     * @return the Instrument
     * @see InstrumentName
     */
    public InstrumentName getInstrument() {
        return this.instrument;
    }

    /**
     * Set the Instrument
     * <p>
     * The Trade's Instrument.
     * <p>
     * @param instrument the Instrument as an InstrumentName
     * @return {@link TradeSummary TradeSummary}
     * @see InstrumentName
     */
    public TradeSummary setInstrument(InstrumentName instrument) {
        this.instrument = instrument;
        return this;
    }
    /**
     * Set the Instrument
     * <p>
     * The Trade's Instrument.
     * <p>
     * @param instrument the Instrument as a String
     * @return {@link TradeSummary TradeSummary}
     * @see InstrumentName
     */
    public TradeSummary setInstrument(String instrument) {
        this.instrument = new InstrumentName(instrument);
        return this;
    }

    @SerializedName("price") private PriceValue price;

    /**
     * Get the Fill Price
     * <p>
     * The execution price of the Trade.
     * <p>
     * @return the Fill Price
     * @see PriceValue
     */
    public PriceValue getPrice() {
        return this.price;
    }

    /**
     * Set the Fill Price
     * <p>
     * The execution price of the Trade.
     * <p>
     * @param price the Fill Price as a PriceValue
     * @return {@link TradeSummary TradeSummary}
     * @see PriceValue
     */
    public TradeSummary setPrice(PriceValue price) {
        this.price = price;
        return this;
    }
    /**
     * Set the Fill Price
     * <p>
     * The execution price of the Trade.
     * <p>
     * @param price the Fill Price as a String
     * @return {@link TradeSummary TradeSummary}
     * @see PriceValue
     */
    public TradeSummary setPrice(String price) {
        this.price = new PriceValue(price);
        return this;
    }
    /**
     * Set the Fill Price
     * <p>
     * The execution price of the Trade.
     * <p>
     * @param price the Fill Price as a double
     * @return {@link TradeSummary TradeSummary}
     * @see PriceValue
     */
    public TradeSummary setPrice(double price) {
        this.price = new PriceValue(price);
        return this;
    }
    /**
     * Set the Fill Price
     * <p>
     * The execution price of the Trade.
     * <p>
     * @param price the Fill Price as a BigDecimal
     * @return {@link TradeSummary TradeSummary}
     * @see PriceValue
     */
    public TradeSummary setPrice(BigDecimal price) {
        this.price = new PriceValue(price);
        return this;
    }

    @SerializedName("openTime") private DateTime openTime;

    /**
     * Get the Open Time
     * <p>
     * The date/time when the Trade was opened.
     * <p>
     * @return the Open Time
     * @see DateTime
     */
    public DateTime getOpenTime() {
        return this.openTime;
    }

    /**
     * Set the Open Time
     * <p>
     * The date/time when the Trade was opened.
     * <p>
     * @param openTime the Open Time as a DateTime
     * @return {@link TradeSummary TradeSummary}
     * @see DateTime
     */
    public TradeSummary setOpenTime(DateTime openTime) {
        this.openTime = openTime;
        return this;
    }
    /**
     * Set the Open Time
     * <p>
     * The date/time when the Trade was opened.
     * <p>
     * @param openTime the Open Time as a String
     * @return {@link TradeSummary TradeSummary}
     * @see DateTime
     */
    public TradeSummary setOpenTime(String openTime) {
        this.openTime = new DateTime(openTime);
        return this;
    }

    @SerializedName("state") private TradeState state;

    /**
     * Get the State
     * <p>
     * The current state of the Trade.
     * <p>
     * @return the State
     * @see TradeState
     */
    public TradeState getState() {
        return this.state;
    }

    /**
     * Set the State
     * <p>
     * The current state of the Trade.
     * <p>
     * @param state the State as a TradeState
     * @return {@link TradeSummary TradeSummary}
     * @see TradeState
     */
    public TradeSummary setState(TradeState state) {
        this.state = state;
        return this;
    }

    @SerializedName("initialUnits") private DecimalNumber initialUnits;

    /**
     * Get the Initial Trade Units
     * <p>
     * The initial size of the Trade. Negative values indicate a short Trade,
     * and positive values indicate a long Trade.
     * <p>
     * @return the Initial Trade Units
     * @see DecimalNumber
     */
    public DecimalNumber getInitialUnits() {
        return this.initialUnits;
    }

    /**
     * Set the Initial Trade Units
     * <p>
     * The initial size of the Trade. Negative values indicate a short Trade,
     * and positive values indicate a long Trade.
     * <p>
     * @param initialUnits the Initial Trade Units as a DecimalNumber
     * @return {@link TradeSummary TradeSummary}
     * @see DecimalNumber
     */
    public TradeSummary setInitialUnits(DecimalNumber initialUnits) {
        this.initialUnits = initialUnits;
        return this;
    }
    /**
     * Set the Initial Trade Units
     * <p>
     * The initial size of the Trade. Negative values indicate a short Trade,
     * and positive values indicate a long Trade.
     * <p>
     * @param initialUnits the Initial Trade Units as a String
     * @return {@link TradeSummary TradeSummary}
     * @see DecimalNumber
     */
    public TradeSummary setInitialUnits(String initialUnits) {
        this.initialUnits = new DecimalNumber(initialUnits);
        return this;
    }
    /**
     * Set the Initial Trade Units
     * <p>
     * The initial size of the Trade. Negative values indicate a short Trade,
     * and positive values indicate a long Trade.
     * <p>
     * @param initialUnits the Initial Trade Units as a double
     * @return {@link TradeSummary TradeSummary}
     * @see DecimalNumber
     */
    public TradeSummary setInitialUnits(double initialUnits) {
        this.initialUnits = new DecimalNumber(initialUnits);
        return this;
    }
    /**
     * Set the Initial Trade Units
     * <p>
     * The initial size of the Trade. Negative values indicate a short Trade,
     * and positive values indicate a long Trade.
     * <p>
     * @param initialUnits the Initial Trade Units as a BigDecimal
     * @return {@link TradeSummary TradeSummary}
     * @see DecimalNumber
     */
    public TradeSummary setInitialUnits(BigDecimal initialUnits) {
        this.initialUnits = new DecimalNumber(initialUnits);
        return this;
    }

    @SerializedName("initialMarginRequired") private AccountUnits initialMarginRequired;

    /**
     * Get the Initial Margin Required
     * <p>
     * The margin required at the time the Trade was created. Note, this is the
     * 'pure' margin required, it is not the 'effective' margin used that
     * factors in the trade risk if a GSLO is attached to the trade.
     * <p>
     * @return the Initial Margin Required
     * @see AccountUnits
     */
    public AccountUnits getInitialMarginRequired() {
        return this.initialMarginRequired;
    }

    /**
     * Set the Initial Margin Required
     * <p>
     * The margin required at the time the Trade was created. Note, this is the
     * 'pure' margin required, it is not the 'effective' margin used that
     * factors in the trade risk if a GSLO is attached to the trade.
     * <p>
     * @param initialMarginRequired the Initial Margin Required as an
     * AccountUnits
     * @return {@link TradeSummary TradeSummary}
     * @see AccountUnits
     */
    public TradeSummary setInitialMarginRequired(AccountUnits initialMarginRequired) {
        this.initialMarginRequired = initialMarginRequired;
        return this;
    }
    /**
     * Set the Initial Margin Required
     * <p>
     * The margin required at the time the Trade was created. Note, this is the
     * 'pure' margin required, it is not the 'effective' margin used that
     * factors in the trade risk if a GSLO is attached to the trade.
     * <p>
     * @param initialMarginRequired the Initial Margin Required as a String
     * @return {@link TradeSummary TradeSummary}
     * @see AccountUnits
     */
    public TradeSummary setInitialMarginRequired(String initialMarginRequired) {
        this.initialMarginRequired = new AccountUnits(initialMarginRequired);
        return this;
    }
    /**
     * Set the Initial Margin Required
     * <p>
     * The margin required at the time the Trade was created. Note, this is the
     * 'pure' margin required, it is not the 'effective' margin used that
     * factors in the trade risk if a GSLO is attached to the trade.
     * <p>
     * @param initialMarginRequired the Initial Margin Required as a double
     * @return {@link TradeSummary TradeSummary}
     * @see AccountUnits
     */
    public TradeSummary setInitialMarginRequired(double initialMarginRequired) {
        this.initialMarginRequired = new AccountUnits(initialMarginRequired);
        return this;
    }
    /**
     * Set the Initial Margin Required
     * <p>
     * The margin required at the time the Trade was created. Note, this is the
     * 'pure' margin required, it is not the 'effective' margin used that
     * factors in the trade risk if a GSLO is attached to the trade.
     * <p>
     * @param initialMarginRequired the Initial Margin Required as a BigDecimal
     * @return {@link TradeSummary TradeSummary}
     * @see AccountUnits
     */
    public TradeSummary setInitialMarginRequired(BigDecimal initialMarginRequired) {
        this.initialMarginRequired = new AccountUnits(initialMarginRequired);
        return this;
    }

    @SerializedName("currentUnits") private DecimalNumber currentUnits;

    /**
     * Get the Current Open Trade Units
     * <p>
     * The number of units currently open for the Trade. This value is reduced
     * to 0.0 as the Trade is closed.
     * <p>
     * @return the Current Open Trade Units
     * @see DecimalNumber
     */
    public DecimalNumber getCurrentUnits() {
        return this.currentUnits;
    }

    /**
     * Set the Current Open Trade Units
     * <p>
     * The number of units currently open for the Trade. This value is reduced
     * to 0.0 as the Trade is closed.
     * <p>
     * @param currentUnits the Current Open Trade Units as a DecimalNumber
     * @return {@link TradeSummary TradeSummary}
     * @see DecimalNumber
     */
    public TradeSummary setCurrentUnits(DecimalNumber currentUnits) {
        this.currentUnits = currentUnits;
        return this;
    }
    /**
     * Set the Current Open Trade Units
     * <p>
     * The number of units currently open for the Trade. This value is reduced
     * to 0.0 as the Trade is closed.
     * <p>
     * @param currentUnits the Current Open Trade Units as a String
     * @return {@link TradeSummary TradeSummary}
     * @see DecimalNumber
     */
    public TradeSummary setCurrentUnits(String currentUnits) {
        this.currentUnits = new DecimalNumber(currentUnits);
        return this;
    }
    /**
     * Set the Current Open Trade Units
     * <p>
     * The number of units currently open for the Trade. This value is reduced
     * to 0.0 as the Trade is closed.
     * <p>
     * @param currentUnits the Current Open Trade Units as a double
     * @return {@link TradeSummary TradeSummary}
     * @see DecimalNumber
     */
    public TradeSummary setCurrentUnits(double currentUnits) {
        this.currentUnits = new DecimalNumber(currentUnits);
        return this;
    }
    /**
     * Set the Current Open Trade Units
     * <p>
     * The number of units currently open for the Trade. This value is reduced
     * to 0.0 as the Trade is closed.
     * <p>
     * @param currentUnits the Current Open Trade Units as a BigDecimal
     * @return {@link TradeSummary TradeSummary}
     * @see DecimalNumber
     */
    public TradeSummary setCurrentUnits(BigDecimal currentUnits) {
        this.currentUnits = new DecimalNumber(currentUnits);
        return this;
    }

    @SerializedName("realizedPL") private AccountUnits realizedPL;

    /**
     * Get the Realized Profit/Loss
     * <p>
     * The total profit/loss realized on the closed portion of the Trade.
     * <p>
     * @return the Realized Profit/Loss
     * @see AccountUnits
     */
    public AccountUnits getRealizedPL() {
        return this.realizedPL;
    }

    /**
     * Set the Realized Profit/Loss
     * <p>
     * The total profit/loss realized on the closed portion of the Trade.
     * <p>
     * @param realizedPL the Realized Profit/Loss as an AccountUnits
     * @return {@link TradeSummary TradeSummary}
     * @see AccountUnits
     */
    public TradeSummary setRealizedPL(AccountUnits realizedPL) {
        this.realizedPL = realizedPL;
        return this;
    }
    /**
     * Set the Realized Profit/Loss
     * <p>
     * The total profit/loss realized on the closed portion of the Trade.
     * <p>
     * @param realizedPL the Realized Profit/Loss as a String
     * @return {@link TradeSummary TradeSummary}
     * @see AccountUnits
     */
    public TradeSummary setRealizedPL(String realizedPL) {
        this.realizedPL = new AccountUnits(realizedPL);
        return this;
    }
    /**
     * Set the Realized Profit/Loss
     * <p>
     * The total profit/loss realized on the closed portion of the Trade.
     * <p>
     * @param realizedPL the Realized Profit/Loss as a double
     * @return {@link TradeSummary TradeSummary}
     * @see AccountUnits
     */
    public TradeSummary setRealizedPL(double realizedPL) {
        this.realizedPL = new AccountUnits(realizedPL);
        return this;
    }
    /**
     * Set the Realized Profit/Loss
     * <p>
     * The total profit/loss realized on the closed portion of the Trade.
     * <p>
     * @param realizedPL the Realized Profit/Loss as a BigDecimal
     * @return {@link TradeSummary TradeSummary}
     * @see AccountUnits
     */
    public TradeSummary setRealizedPL(BigDecimal realizedPL) {
        this.realizedPL = new AccountUnits(realizedPL);
        return this;
    }

    @SerializedName("unrealizedPL") private AccountUnits unrealizedPL;

    /**
     * Get the Unrealized Profit/Loss
     * <p>
     * The unrealized profit/loss on the open portion of the Trade.
     * <p>
     * @return the Unrealized Profit/Loss
     * @see AccountUnits
     */
    public AccountUnits getUnrealizedPL() {
        return this.unrealizedPL;
    }

    /**
     * Set the Unrealized Profit/Loss
     * <p>
     * The unrealized profit/loss on the open portion of the Trade.
     * <p>
     * @param unrealizedPL the Unrealized Profit/Loss as an AccountUnits
     * @return {@link TradeSummary TradeSummary}
     * @see AccountUnits
     */
    public TradeSummary setUnrealizedPL(AccountUnits unrealizedPL) {
        this.unrealizedPL = unrealizedPL;
        return this;
    }
    /**
     * Set the Unrealized Profit/Loss
     * <p>
     * The unrealized profit/loss on the open portion of the Trade.
     * <p>
     * @param unrealizedPL the Unrealized Profit/Loss as a String
     * @return {@link TradeSummary TradeSummary}
     * @see AccountUnits
     */
    public TradeSummary setUnrealizedPL(String unrealizedPL) {
        this.unrealizedPL = new AccountUnits(unrealizedPL);
        return this;
    }
    /**
     * Set the Unrealized Profit/Loss
     * <p>
     * The unrealized profit/loss on the open portion of the Trade.
     * <p>
     * @param unrealizedPL the Unrealized Profit/Loss as a double
     * @return {@link TradeSummary TradeSummary}
     * @see AccountUnits
     */
    public TradeSummary setUnrealizedPL(double unrealizedPL) {
        this.unrealizedPL = new AccountUnits(unrealizedPL);
        return this;
    }
    /**
     * Set the Unrealized Profit/Loss
     * <p>
     * The unrealized profit/loss on the open portion of the Trade.
     * <p>
     * @param unrealizedPL the Unrealized Profit/Loss as a BigDecimal
     * @return {@link TradeSummary TradeSummary}
     * @see AccountUnits
     */
    public TradeSummary setUnrealizedPL(BigDecimal unrealizedPL) {
        this.unrealizedPL = new AccountUnits(unrealizedPL);
        return this;
    }

    @SerializedName("marginUsed") private AccountUnits marginUsed;

    /**
     * Get the Margin Used
     * <p>
     * Margin currently used by the Trade.
     * <p>
     * @return the Margin Used
     * @see AccountUnits
     */
    public AccountUnits getMarginUsed() {
        return this.marginUsed;
    }

    /**
     * Set the Margin Used
     * <p>
     * Margin currently used by the Trade.
     * <p>
     * @param marginUsed the Margin Used as an AccountUnits
     * @return {@link TradeSummary TradeSummary}
     * @see AccountUnits
     */
    public TradeSummary setMarginUsed(AccountUnits marginUsed) {
        this.marginUsed = marginUsed;
        return this;
    }
    /**
     * Set the Margin Used
     * <p>
     * Margin currently used by the Trade.
     * <p>
     * @param marginUsed the Margin Used as a String
     * @return {@link TradeSummary TradeSummary}
     * @see AccountUnits
     */
    public TradeSummary setMarginUsed(String marginUsed) {
        this.marginUsed = new AccountUnits(marginUsed);
        return this;
    }
    /**
     * Set the Margin Used
     * <p>
     * Margin currently used by the Trade.
     * <p>
     * @param marginUsed the Margin Used as a double
     * @return {@link TradeSummary TradeSummary}
     * @see AccountUnits
     */
    public TradeSummary setMarginUsed(double marginUsed) {
        this.marginUsed = new AccountUnits(marginUsed);
        return this;
    }
    /**
     * Set the Margin Used
     * <p>
     * Margin currently used by the Trade.
     * <p>
     * @param marginUsed the Margin Used as a BigDecimal
     * @return {@link TradeSummary TradeSummary}
     * @see AccountUnits
     */
    public TradeSummary setMarginUsed(BigDecimal marginUsed) {
        this.marginUsed = new AccountUnits(marginUsed);
        return this;
    }

    @SerializedName("averageClosePrice") private PriceValue averageClosePrice;

    /**
     * Get the Average Close Price
     * <p>
     * The average closing price of the Trade. Only present if the Trade has
     * been closed or reduced at least once.
     * <p>
     * @return the Average Close Price
     * @see PriceValue
     */
    public PriceValue getAverageClosePrice() {
        return this.averageClosePrice;
    }

    /**
     * Set the Average Close Price
     * <p>
     * The average closing price of the Trade. Only present if the Trade has
     * been closed or reduced at least once.
     * <p>
     * @param averageClosePrice the Average Close Price as a PriceValue
     * @return {@link TradeSummary TradeSummary}
     * @see PriceValue
     */
    public TradeSummary setAverageClosePrice(PriceValue averageClosePrice) {
        this.averageClosePrice = averageClosePrice;
        return this;
    }
    /**
     * Set the Average Close Price
     * <p>
     * The average closing price of the Trade. Only present if the Trade has
     * been closed or reduced at least once.
     * <p>
     * @param averageClosePrice the Average Close Price as a String
     * @return {@link TradeSummary TradeSummary}
     * @see PriceValue
     */
    public TradeSummary setAverageClosePrice(String averageClosePrice) {
        this.averageClosePrice = new PriceValue(averageClosePrice);
        return this;
    }
    /**
     * Set the Average Close Price
     * <p>
     * The average closing price of the Trade. Only present if the Trade has
     * been closed or reduced at least once.
     * <p>
     * @param averageClosePrice the Average Close Price as a double
     * @return {@link TradeSummary TradeSummary}
     * @see PriceValue
     */
    public TradeSummary setAverageClosePrice(double averageClosePrice) {
        this.averageClosePrice = new PriceValue(averageClosePrice);
        return this;
    }
    /**
     * Set the Average Close Price
     * <p>
     * The average closing price of the Trade. Only present if the Trade has
     * been closed or reduced at least once.
     * <p>
     * @param averageClosePrice the Average Close Price as a BigDecimal
     * @return {@link TradeSummary TradeSummary}
     * @see PriceValue
     */
    public TradeSummary setAverageClosePrice(BigDecimal averageClosePrice) {
        this.averageClosePrice = new PriceValue(averageClosePrice);
        return this;
    }

    @SerializedName("closingTransactionIDs") private ArrayList<TransactionID> closingTransactionIDs;

    /**
     * Get the Closing Transaction IDs
     * <p>
     * The IDs of the Transactions that have closed portions of this Trade.
     * <p>
     * @return the Closing Transaction IDs
     * @see TransactionID
     */
    public List<TransactionID> getClosingTransactionIDs() {
        return this.closingTransactionIDs;
    }

    /**
     * Set the Closing Transaction IDs
     * <p>
     * The IDs of the Transactions that have closed portions of this Trade.
     * <p>
     * @param closingTransactionIDs the Closing Transaction IDs
     * @return {@link TradeSummary TradeSummary}
     * @see TransactionID
     */
    public TradeSummary setClosingTransactionIDs(Collection<?> closingTransactionIDs) {
        ArrayList<TransactionID> newClosingTransactionIDs = new ArrayList<TransactionID>(closingTransactionIDs.size());
        closingTransactionIDs.forEach((item) -> {
            if (item instanceof TransactionID)
            {
                newClosingTransactionIDs.add((TransactionID) item);
            }
            else if (item instanceof String)
            {
                newClosingTransactionIDs.add(new TransactionID((String) item));
            }
            else
            {
                throw new IllegalArgumentException(
                    item.getClass().getName() + " cannot be converted to a TransactionID"
                );
            }
        });
        this.closingTransactionIDs = newClosingTransactionIDs;
        return this;
    }

    @SerializedName("financing") private AccountUnits financing;

    /**
     * Get the Financing
     * <p>
     * The financing paid/collected for this Trade.
     * <p>
     * @return the Financing
     * @see AccountUnits
     */
    public AccountUnits getFinancing() {
        return this.financing;
    }

    /**
     * Set the Financing
     * <p>
     * The financing paid/collected for this Trade.
     * <p>
     * @param financing the Financing as an AccountUnits
     * @return {@link TradeSummary TradeSummary}
     * @see AccountUnits
     */
    public TradeSummary setFinancing(AccountUnits financing) {
        this.financing = financing;
        return this;
    }
    /**
     * Set the Financing
     * <p>
     * The financing paid/collected for this Trade.
     * <p>
     * @param financing the Financing as a String
     * @return {@link TradeSummary TradeSummary}
     * @see AccountUnits
     */
    public TradeSummary setFinancing(String financing) {
        this.financing = new AccountUnits(financing);
        return this;
    }
    /**
     * Set the Financing
     * <p>
     * The financing paid/collected for this Trade.
     * <p>
     * @param financing the Financing as a double
     * @return {@link TradeSummary TradeSummary}
     * @see AccountUnits
     */
    public TradeSummary setFinancing(double financing) {
        this.financing = new AccountUnits(financing);
        return this;
    }
    /**
     * Set the Financing
     * <p>
     * The financing paid/collected for this Trade.
     * <p>
     * @param financing the Financing as a BigDecimal
     * @return {@link TradeSummary TradeSummary}
     * @see AccountUnits
     */
    public TradeSummary setFinancing(BigDecimal financing) {
        this.financing = new AccountUnits(financing);
        return this;
    }

    @SerializedName("closeTime") private DateTime closeTime;

    /**
     * Get the Close Time
     * <p>
     * The date/time when the Trade was fully closed. Only provided for Trades
     * whose state is CLOSED.
     * <p>
     * @return the Close Time
     * @see DateTime
     */
    public DateTime getCloseTime() {
        return this.closeTime;
    }

    /**
     * Set the Close Time
     * <p>
     * The date/time when the Trade was fully closed. Only provided for Trades
     * whose state is CLOSED.
     * <p>
     * @param closeTime the Close Time as a DateTime
     * @return {@link TradeSummary TradeSummary}
     * @see DateTime
     */
    public TradeSummary setCloseTime(DateTime closeTime) {
        this.closeTime = closeTime;
        return this;
    }
    /**
     * Set the Close Time
     * <p>
     * The date/time when the Trade was fully closed. Only provided for Trades
     * whose state is CLOSED.
     * <p>
     * @param closeTime the Close Time as a String
     * @return {@link TradeSummary TradeSummary}
     * @see DateTime
     */
    public TradeSummary setCloseTime(String closeTime) {
        this.closeTime = new DateTime(closeTime);
        return this;
    }

    @SerializedName("clientExtensions") private ClientExtensions clientExtensions;

    /**
     * Get the Client Extensions
     * <p>
     * The client extensions of the Trade.
     * <p>
     * @return the Client Extensions
     * @see ClientExtensions
     */
    public ClientExtensions getClientExtensions() {
        return this.clientExtensions;
    }

    /**
     * Set the Client Extensions
     * <p>
     * The client extensions of the Trade.
     * <p>
     * @param clientExtensions the Client Extensions as a ClientExtensions
     * @return {@link TradeSummary TradeSummary}
     * @see ClientExtensions
     */
    public TradeSummary setClientExtensions(ClientExtensions clientExtensions) {
        this.clientExtensions = clientExtensions;
        return this;
    }

    @SerializedName("takeProfitOrderID") private OrderID takeProfitOrderID;

    /**
     * Get the Take Profit Order ID
     * <p>
     * ID of the Trade's Take Profit Order, only provided if such an Order
     * exists.
     * <p>
     * @return the Take Profit Order ID
     * @see OrderID
     */
    public OrderID getTakeProfitOrderID() {
        return this.takeProfitOrderID;
    }

    /**
     * Set the Take Profit Order ID
     * <p>
     * ID of the Trade's Take Profit Order, only provided if such an Order
     * exists.
     * <p>
     * @param takeProfitOrderID the Take Profit Order ID as an OrderID
     * @return {@link TradeSummary TradeSummary}
     * @see OrderID
     */
    public TradeSummary setTakeProfitOrderID(OrderID takeProfitOrderID) {
        this.takeProfitOrderID = takeProfitOrderID;
        return this;
    }
    /**
     * Set the Take Profit Order ID
     * <p>
     * ID of the Trade's Take Profit Order, only provided if such an Order
     * exists.
     * <p>
     * @param takeProfitOrderID the Take Profit Order ID as a String
     * @return {@link TradeSummary TradeSummary}
     * @see OrderID
     */
    public TradeSummary setTakeProfitOrderID(String takeProfitOrderID) {
        this.takeProfitOrderID = new OrderID(takeProfitOrderID);
        return this;
    }

    @SerializedName("stopLossOrderID") private OrderID stopLossOrderID;

    /**
     * Get the Stop Loss Order ID
     * <p>
     * ID of the Trade's Stop Loss Order, only provided if such an Order
     * exists.
     * <p>
     * @return the Stop Loss Order ID
     * @see OrderID
     */
    public OrderID getStopLossOrderID() {
        return this.stopLossOrderID;
    }

    /**
     * Set the Stop Loss Order ID
     * <p>
     * ID of the Trade's Stop Loss Order, only provided if such an Order
     * exists.
     * <p>
     * @param stopLossOrderID the Stop Loss Order ID as an OrderID
     * @return {@link TradeSummary TradeSummary}
     * @see OrderID
     */
    public TradeSummary setStopLossOrderID(OrderID stopLossOrderID) {
        this.stopLossOrderID = stopLossOrderID;
        return this;
    }
    /**
     * Set the Stop Loss Order ID
     * <p>
     * ID of the Trade's Stop Loss Order, only provided if such an Order
     * exists.
     * <p>
     * @param stopLossOrderID the Stop Loss Order ID as a String
     * @return {@link TradeSummary TradeSummary}
     * @see OrderID
     */
    public TradeSummary setStopLossOrderID(String stopLossOrderID) {
        this.stopLossOrderID = new OrderID(stopLossOrderID);
        return this;
    }

    @SerializedName("trailingStopLossOrderID") private OrderID trailingStopLossOrderID;

    /**
     * Get the Trailing Stop Loss Order ID
     * <p>
     * ID of the Trade's Trailing Stop Loss Order, only provided if such an
     * Order exists.
     * <p>
     * @return the Trailing Stop Loss Order ID
     * @see OrderID
     */
    public OrderID getTrailingStopLossOrderID() {
        return this.trailingStopLossOrderID;
    }

    /**
     * Set the Trailing Stop Loss Order ID
     * <p>
     * ID of the Trade's Trailing Stop Loss Order, only provided if such an
     * Order exists.
     * <p>
     * @param trailingStopLossOrderID the Trailing Stop Loss Order ID as an
     * OrderID
     * @return {@link TradeSummary TradeSummary}
     * @see OrderID
     */
    public TradeSummary setTrailingStopLossOrderID(OrderID trailingStopLossOrderID) {
        this.trailingStopLossOrderID = trailingStopLossOrderID;
        return this;
    }
    /**
     * Set the Trailing Stop Loss Order ID
     * <p>
     * ID of the Trade's Trailing Stop Loss Order, only provided if such an
     * Order exists.
     * <p>
     * @param trailingStopLossOrderID the Trailing Stop Loss Order ID as a
     * String
     * @return {@link TradeSummary TradeSummary}
     * @see OrderID
     */
    public TradeSummary setTrailingStopLossOrderID(String trailingStopLossOrderID) {
        this.trailingStopLossOrderID = new OrderID(trailingStopLossOrderID);
        return this;
    }

    @Override
    public String toString() {
        return "TradeSummary(" +
            "id=" +
                (id == null ? "null" : id.toString()) + ", " +
            "instrument=" +
                (instrument == null ? "null" : instrument.toString()) + ", " +
            "price=" +
                (price == null ? "null" : price.toString()) + ", " +
            "openTime=" +
                (openTime == null ? "null" : openTime.toString()) + ", " +
            "state=" +
                (state == null ? "null" : state.toString()) + ", " +
            "initialUnits=" +
                (initialUnits == null ? "null" : initialUnits.toString()) + ", " +
            "initialMarginRequired=" +
                (initialMarginRequired == null ? "null" : initialMarginRequired.toString()) + ", " +
            "currentUnits=" +
                (currentUnits == null ? "null" : currentUnits.toString()) + ", " +
            "realizedPL=" +
                (realizedPL == null ? "null" : realizedPL.toString()) + ", " +
            "unrealizedPL=" +
                (unrealizedPL == null ? "null" : unrealizedPL.toString()) + ", " +
            "marginUsed=" +
                (marginUsed == null ? "null" : marginUsed.toString()) + ", " +
            "averageClosePrice=" +
                (averageClosePrice == null ? "null" : averageClosePrice.toString()) + ", " +
            "closingTransactionIDs=" +
                (closingTransactionIDs == null ? "null" : closingTransactionIDs.toString()) + ", " +
            "financing=" +
                (financing == null ? "null" : financing.toString()) + ", " +
            "closeTime=" +
                (closeTime == null ? "null" : closeTime.toString()) + ", " +
            "clientExtensions=" +
                (clientExtensions == null ? "null" : clientExtensions.toString()) + ", " +
            "takeProfitOrderID=" +
                (takeProfitOrderID == null ? "null" : takeProfitOrderID.toString()) + ", " +
            "stopLossOrderID=" +
                (stopLossOrderID == null ? "null" : stopLossOrderID.toString()) + ", " +
            "trailingStopLossOrderID=" +
                (trailingStopLossOrderID == null ? "null" : trailingStopLossOrderID.toString()) +
            ")";
    }
}
