package com.stripe.model;

import java.util.Map;

public class InvoiceLineItem extends StripeObject {
	String id;
	String type;
	Boolean livemode;
	Integer amount;
	String currency;
	Boolean proration;
	InvoiceLineItemPeriod period;
	Integer quantity;
	Plan plan;
	String description;
	Map<String, String> metadata;
	String subscription;

	public String getId() {
		return this.id;
	}

	public String getType() {
		return this.type;
	}

	public Boolean getLivemode() {
		return this.livemode;
	}

	public Integer getAmount() {
		return this.amount;
	}

	public String getCurrency() {
		return this.currency;
	}

	public Boolean getProration() {
		return this.proration;
	}

	public InvoiceLineItemPeriod getPeriod() {
		return this.period;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public Plan getPlan() {
		return this.plan;
	}

	public String getDescription() {
		return this.description;
	}

	public Map<String, String> getMetadata() {
		return this.metadata;
	}

	public String getSubscription() {
		return this.subscription;
	}
}
