package com.oanda.v20.transaction;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.account.AccountID;
import com.oanda.v20.primitives.DateTime;
import com.oanda.v20.trade.TradeID;

/**
 * A TradeClientExtensionsModifyRejectTransaction represents the rejection of
 * the modification of a Trade's Client Extensions.
 * <p>
 * Reject Modify Trade {tradeID} Client Extensions
 */
public class TradeClientExtensionsModifyRejectTransaction implements Transaction {

    /**
     * Default constructor.
     */
    public TradeClientExtensionsModifyRejectTransaction() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the TradeClientExtensionsModifyRejectTransaction to copy
     */
    public TradeClientExtensionsModifyRejectTransaction(TradeClientExtensionsModifyRejectTransaction other) {
        this.id = other.id;
        this.time = other.time;
        if (other.userID != null)
        {
            this.userID = new Long(other.userID);
        }
        this.accountID = other.accountID;
        this.batchID = other.batchID;
        this.requestID = other.requestID;
        this.type = other.type;
        this.tradeID = other.tradeID;
        this.clientTradeID = other.clientTradeID;
        if (other.tradeClientExtensionsModify != null)
        {
            this.tradeClientExtensionsModify = new ClientExtensions(other.tradeClientExtensionsModify);
        }
        this.rejectReason = other.rejectReason;
    }

    @SerializedName("id") private TransactionID id;

    /**
     * Get the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @return the Transaction ID
     * @see TransactionID
     */
    public TransactionID getId() {
        return this.id;
    }

    /**
     * Set the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @param id the Transaction ID as a TransactionID
     * @return {@link TradeClientExtensionsModifyRejectTransaction
     * TradeClientExtensionsModifyRejectTransaction}
     * @see TransactionID
     */
    public TradeClientExtensionsModifyRejectTransaction setId(TransactionID id) {
        this.id = id;
        return this;
    }
    /**
     * Set the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @param id the Transaction ID as a String
     * @return {@link TradeClientExtensionsModifyRejectTransaction
     * TradeClientExtensionsModifyRejectTransaction}
     * @see TransactionID
     */
    public TradeClientExtensionsModifyRejectTransaction setId(String id) {
        this.id = new TransactionID(id);
        return this;
    }

    @SerializedName("time") private DateTime time;

    /**
     * Get the Time
     * <p>
     * The date/time when the Transaction was created.
     * <p>
     * @return the Time
     * @see DateTime
     */
    public DateTime getTime() {
        return this.time;
    }

    /**
     * Set the Time
     * <p>
     * The date/time when the Transaction was created.
     * <p>
     * @param time the Time as a DateTime
     * @return {@link TradeClientExtensionsModifyRejectTransaction
     * TradeClientExtensionsModifyRejectTransaction}
     * @see DateTime
     */
    public TradeClientExtensionsModifyRejectTransaction setTime(DateTime time) {
        this.time = time;
        return this;
    }
    /**
     * Set the Time
     * <p>
     * The date/time when the Transaction was created.
     * <p>
     * @param time the Time as a String
     * @return {@link TradeClientExtensionsModifyRejectTransaction
     * TradeClientExtensionsModifyRejectTransaction}
     * @see DateTime
     */
    public TradeClientExtensionsModifyRejectTransaction setTime(String time) {
        this.time = new DateTime(time);
        return this;
    }

    @SerializedName("userID") private Long userID;

    /**
     * Get the User ID
     * <p>
     * The ID of the user that initiated the creation of the Transaction.
     * <p>
     * @return the User ID
     */
    public Long getUserID() {
        return this.userID;
    }

    /**
     * Set the User ID
     * <p>
     * The ID of the user that initiated the creation of the Transaction.
     * <p>
     * @param userID the User ID as a Long
     * @return {@link TradeClientExtensionsModifyRejectTransaction
     * TradeClientExtensionsModifyRejectTransaction}
     */
    public TradeClientExtensionsModifyRejectTransaction setUserID(Long userID) {
        this.userID = userID;
        return this;
    }

    @SerializedName("accountID") private AccountID accountID;

    /**
     * Get the Account ID
     * <p>
     * The ID of the Account the Transaction was created for.
     * <p>
     * @return the Account ID
     * @see AccountID
     */
    public AccountID getAccountID() {
        return this.accountID;
    }

    /**
     * Set the Account ID
     * <p>
     * The ID of the Account the Transaction was created for.
     * <p>
     * @param accountID the Account ID as an AccountID
     * @return {@link TradeClientExtensionsModifyRejectTransaction
     * TradeClientExtensionsModifyRejectTransaction}
     * @see AccountID
     */
    public TradeClientExtensionsModifyRejectTransaction setAccountID(AccountID accountID) {
        this.accountID = accountID;
        return this;
    }
    /**
     * Set the Account ID
     * <p>
     * The ID of the Account the Transaction was created for.
     * <p>
     * @param accountID the Account ID as a String
     * @return {@link TradeClientExtensionsModifyRejectTransaction
     * TradeClientExtensionsModifyRejectTransaction}
     * @see AccountID
     */
    public TradeClientExtensionsModifyRejectTransaction setAccountID(String accountID) {
        this.accountID = new AccountID(accountID);
        return this;
    }

    @SerializedName("batchID") private TransactionID batchID;

    /**
     * Get the Transaction Batch ID
     * <p>
     * The ID of the "batch" that the Transaction belongs to. Transactions in
     * the same batch are applied to the Account simultaneously.
     * <p>
     * @return the Transaction Batch ID
     * @see TransactionID
     */
    public TransactionID getBatchID() {
        return this.batchID;
    }

    /**
     * Set the Transaction Batch ID
     * <p>
     * The ID of the "batch" that the Transaction belongs to. Transactions in
     * the same batch are applied to the Account simultaneously.
     * <p>
     * @param batchID the Transaction Batch ID as a TransactionID
     * @return {@link TradeClientExtensionsModifyRejectTransaction
     * TradeClientExtensionsModifyRejectTransaction}
     * @see TransactionID
     */
    public TradeClientExtensionsModifyRejectTransaction setBatchID(TransactionID batchID) {
        this.batchID = batchID;
        return this;
    }
    /**
     * Set the Transaction Batch ID
     * <p>
     * The ID of the "batch" that the Transaction belongs to. Transactions in
     * the same batch are applied to the Account simultaneously.
     * <p>
     * @param batchID the Transaction Batch ID as a String
     * @return {@link TradeClientExtensionsModifyRejectTransaction
     * TradeClientExtensionsModifyRejectTransaction}
     * @see TransactionID
     */
    public TradeClientExtensionsModifyRejectTransaction setBatchID(String batchID) {
        this.batchID = new TransactionID(batchID);
        return this;
    }

    @SerializedName("requestID") private RequestID requestID;

    /**
     * Get the Request ID
     * <p>
     * The Request ID of the request which generated the transaction.
     * <p>
     * @return the Request ID
     * @see RequestID
     */
    public RequestID getRequestID() {
        return this.requestID;
    }

    /**
     * Set the Request ID
     * <p>
     * The Request ID of the request which generated the transaction.
     * <p>
     * @param requestID the Request ID as a RequestID
     * @return {@link TradeClientExtensionsModifyRejectTransaction
     * TradeClientExtensionsModifyRejectTransaction}
     * @see RequestID
     */
    public TradeClientExtensionsModifyRejectTransaction setRequestID(RequestID requestID) {
        this.requestID = requestID;
        return this;
    }
    /**
     * Set the Request ID
     * <p>
     * The Request ID of the request which generated the transaction.
     * <p>
     * @param requestID the Request ID as a String
     * @return {@link TradeClientExtensionsModifyRejectTransaction
     * TradeClientExtensionsModifyRejectTransaction}
     * @see RequestID
     */
    public TradeClientExtensionsModifyRejectTransaction setRequestID(String requestID) {
        this.requestID = new RequestID(requestID);
        return this;
    }

    @SerializedName("type") private TransactionType type = TransactionType.TRADE_CLIENT_EXTENSIONS_MODIFY_REJECT;

    /**
     * Get the Type
     * <p>
     * The Type of the Transaction. Always set to
     * "TRADE_CLIENT_EXTENSIONS_MODIFY_REJECT" for a
     * TradeClientExtensionsModifyRejectTransaction.
     * <p>
     * @return the Type
     * @see TransactionType
     */
    public TransactionType getType() {
        return this.type;
    }

    /**
     * Set the Type
     * <p>
     * The Type of the Transaction. Always set to
     * "TRADE_CLIENT_EXTENSIONS_MODIFY_REJECT" for a
     * TradeClientExtensionsModifyRejectTransaction.
     * <p>
     * @param type the Type as a TransactionType
     * @return {@link TradeClientExtensionsModifyRejectTransaction
     * TradeClientExtensionsModifyRejectTransaction}
     * @see TransactionType
     */
    public TradeClientExtensionsModifyRejectTransaction setType(TransactionType type) {
        this.type = type;
        return this;
    }

    @SerializedName("tradeID") private TradeID tradeID;

    /**
     * Get the Trade ID
     * <p>
     * The ID of the Trade who's client extensions are to be modified.
     * <p>
     * @return the Trade ID
     * @see TradeID
     */
    public TradeID getTradeID() {
        return this.tradeID;
    }

    /**
     * Set the Trade ID
     * <p>
     * The ID of the Trade who's client extensions are to be modified.
     * <p>
     * @param tradeID the Trade ID as a TradeID
     * @return {@link TradeClientExtensionsModifyRejectTransaction
     * TradeClientExtensionsModifyRejectTransaction}
     * @see TradeID
     */
    public TradeClientExtensionsModifyRejectTransaction setTradeID(TradeID tradeID) {
        this.tradeID = tradeID;
        return this;
    }
    /**
     * Set the Trade ID
     * <p>
     * The ID of the Trade who's client extensions are to be modified.
     * <p>
     * @param tradeID the Trade ID as a String
     * @return {@link TradeClientExtensionsModifyRejectTransaction
     * TradeClientExtensionsModifyRejectTransaction}
     * @see TradeID
     */
    public TradeClientExtensionsModifyRejectTransaction setTradeID(String tradeID) {
        this.tradeID = new TradeID(tradeID);
        return this;
    }

    @SerializedName("clientTradeID") private ClientID clientTradeID;

    /**
     * Get the Client Trade ID
     * <p>
     * The original Client ID of the Trade who's client extensions are to be
     * modified.
     * <p>
     * @return the Client Trade ID
     * @see ClientID
     */
    public ClientID getClientTradeID() {
        return this.clientTradeID;
    }

    /**
     * Set the Client Trade ID
     * <p>
     * The original Client ID of the Trade who's client extensions are to be
     * modified.
     * <p>
     * @param clientTradeID the Client Trade ID as a ClientID
     * @return {@link TradeClientExtensionsModifyRejectTransaction
     * TradeClientExtensionsModifyRejectTransaction}
     * @see ClientID
     */
    public TradeClientExtensionsModifyRejectTransaction setClientTradeID(ClientID clientTradeID) {
        this.clientTradeID = clientTradeID;
        return this;
    }
    /**
     * Set the Client Trade ID
     * <p>
     * The original Client ID of the Trade who's client extensions are to be
     * modified.
     * <p>
     * @param clientTradeID the Client Trade ID as a String
     * @return {@link TradeClientExtensionsModifyRejectTransaction
     * TradeClientExtensionsModifyRejectTransaction}
     * @see ClientID
     */
    public TradeClientExtensionsModifyRejectTransaction setClientTradeID(String clientTradeID) {
        this.clientTradeID = new ClientID(clientTradeID);
        return this;
    }

    @SerializedName("tradeClientExtensionsModify") private ClientExtensions tradeClientExtensionsModify;

    /**
     * Get the Extensions
     * <p>
     * The new Client Extensions for the Trade.
     * <p>
     * @return the Extensions
     * @see ClientExtensions
     */
    public ClientExtensions getTradeClientExtensionsModify() {
        return this.tradeClientExtensionsModify;
    }

    /**
     * Set the Extensions
     * <p>
     * The new Client Extensions for the Trade.
     * <p>
     * @param tradeClientExtensionsModify the Extensions as a ClientExtensions
     * @return {@link TradeClientExtensionsModifyRejectTransaction
     * TradeClientExtensionsModifyRejectTransaction}
     * @see ClientExtensions
     */
    public TradeClientExtensionsModifyRejectTransaction setTradeClientExtensionsModify(ClientExtensions tradeClientExtensionsModify) {
        this.tradeClientExtensionsModify = tradeClientExtensionsModify;
        return this;
    }

    @SerializedName("rejectReason") private TransactionRejectReason rejectReason;

    /**
     * Get the Reject Reason
     * <p>
     * The reason that the Reject Transaction was created
     * <p>
     * @return the Reject Reason
     * @see TransactionRejectReason
     */
    public TransactionRejectReason getRejectReason() {
        return this.rejectReason;
    }

    /**
     * Set the Reject Reason
     * <p>
     * The reason that the Reject Transaction was created
     * <p>
     * @param rejectReason the Reject Reason as a TransactionRejectReason
     * @return {@link TradeClientExtensionsModifyRejectTransaction
     * TradeClientExtensionsModifyRejectTransaction}
     * @see TransactionRejectReason
     */
    public TradeClientExtensionsModifyRejectTransaction setRejectReason(TransactionRejectReason rejectReason) {
        this.rejectReason = rejectReason;
        return this;
    }

    @Override
    public String toString() {
        return "TradeClientExtensionsModifyRejectTransaction(" +
            "id=" +
                (id == null ? "null" : id.toString()) + ", " +
            "time=" +
                (time == null ? "null" : time.toString()) + ", " +
            "userID=" +
                (userID == null ? "null" : userID.toString()) + ", " +
            "accountID=" +
                (accountID == null ? "null" : accountID.toString()) + ", " +
            "batchID=" +
                (batchID == null ? "null" : batchID.toString()) + ", " +
            "requestID=" +
                (requestID == null ? "null" : requestID.toString()) + ", " +
            "type=" +
                (type == null ? "null" : type.toString()) + ", " +
            "tradeID=" +
                (tradeID == null ? "null" : tradeID.toString()) + ", " +
            "clientTradeID=" +
                (clientTradeID == null ? "null" : clientTradeID.toString()) + ", " +
            "tradeClientExtensionsModify=" +
                (tradeClientExtensionsModify == null ? "null" : tradeClientExtensionsModify.toString()) + ", " +
            "rejectReason=" +
                (rejectReason == null ? "null" : rejectReason.toString()) +
            ")";
    }
}
