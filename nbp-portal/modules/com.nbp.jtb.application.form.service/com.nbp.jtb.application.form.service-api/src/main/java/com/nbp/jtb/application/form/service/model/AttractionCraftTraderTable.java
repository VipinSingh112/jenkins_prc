/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_jtb_craft_trader_permit&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionCraftTrader
 * @generated
 */
public class AttractionCraftTraderTable
	extends BaseTable<AttractionCraftTraderTable> {

	public static final AttractionCraftTraderTable INSTANCE =
		new AttractionCraftTraderTable();

	public final Column<AttractionCraftTraderTable, Long>
		attractionCraftTraderId = createColumn(
			"attractionCraftTraderId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AttractionCraftTraderTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionCraftTraderTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionCraftTraderTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionCraftTraderTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionCraftTraderTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AttractionCraftTraderTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AttractionCraftTraderTable, String>
		craftTradersAppliOwner = createColumn(
			"craftTradersAppliOwner", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionCraftTraderTable, String>
		craftTradersAppliAddress = createColumn(
			"craftTradersAppliAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionCraftTraderTable, String>
		craftTradersAppliPhoneNo = createColumn(
			"craftTradersAppliPhoneNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionCraftTraderTable, String>
		craftTradersAppliEmail = createColumn(
			"craftTradersAppliEmail", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionCraftTraderTable, String> occupyLocation =
		createColumn(
			"occupyLocation", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionCraftTraderTable, String>
		craftTraderGoodsType = createColumn(
			"craftTraderGoodsType", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionCraftTraderTable, String> craftTraderName =
		createColumn(
			"craftTraderName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionCraftTraderTable, String>
		craftTraderPosition = createColumn(
			"craftTraderPosition", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionCraftTraderTable, String>
		craftTraderMinisterAddr = createColumn(
			"craftTraderMinisterAddr", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionCraftTraderTable, String>
		craftTraderMinisterName = createColumn(
			"craftTraderMinisterName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionCraftTraderTable, String>
		craftTraderMinisterNamePos = createColumn(
			"craftTraderMinisterNamePos", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionCraftTraderTable, String>
		craftTraderAddressOwner = createColumn(
			"craftTraderAddressOwner", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionCraftTraderTable, Date> craftTraderSignDate =
		createColumn(
			"craftTraderSignDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<AttractionCraftTraderTable, Date>
		craftTraderAssistSiDate = createColumn(
			"craftTraderAssistSiDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<AttractionCraftTraderTable, Long> jtbApplicationId =
		createColumn(
			"jtbApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private AttractionCraftTraderTable() {
		super("nbp_jtb_craft_trader_permit", AttractionCraftTraderTable::new);
	}

}