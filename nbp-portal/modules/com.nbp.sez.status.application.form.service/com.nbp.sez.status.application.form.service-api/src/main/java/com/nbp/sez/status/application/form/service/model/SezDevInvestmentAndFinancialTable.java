/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_sez_dev_Inves_and_financ&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevInvestmentAndFinancial
 * @generated
 */
public class SezDevInvestmentAndFinancialTable
	extends BaseTable<SezDevInvestmentAndFinancialTable> {

	public static final SezDevInvestmentAndFinancialTable INSTANCE =
		new SezDevInvestmentAndFinancialTable();

	public final Column<SezDevInvestmentAndFinancialTable, Long>
		sezDevInvestmentAndFinancialId = createColumn(
			"sezDevInvestmentAndFinancialId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<SezDevInvestmentAndFinancialTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevInvestmentAndFinancialTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevInvestmentAndFinancialTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevInvestmentAndFinancialTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevInvestmentAndFinancialTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezDevInvestmentAndFinancialTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezDevInvestmentAndFinancialTable, String> valueOfLand =
		createColumn(
			"valueOfLand", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevInvestmentAndFinancialTable, String>
		buildingFactoryDevelop = createColumn(
			"buildingFactoryDevelop", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevInvestmentAndFinancialTable, String>
		onSiteInfrastructure = createColumn(
			"onSiteInfrastructure", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevInvestmentAndFinancialTable, String> port =
		createColumn("port", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevInvestmentAndFinancialTable, String> airPort =
		createColumn(
			"airPort", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevInvestmentAndFinancialTable, String> other =
		createColumn("other", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevInvestmentAndFinancialTable, String> total =
		createColumn("total", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevInvestmentAndFinancialTable, String>
		totalLocalDirector = createColumn(
			"totalLocalDirector", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevInvestmentAndFinancialTable, String>
		totalForeignDirector = createColumn(
			"totalForeignDirector", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevInvestmentAndFinancialTable, String> companyName =
		createColumn(
			"companyName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevInvestmentAndFinancialTable, String>
		resisdentAddress = createColumn(
			"resisdentAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevInvestmentAndFinancialTable, String>
		sourceOfFunds = createColumn(
			"sourceOfFunds", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevInvestmentAndFinancialTable, Long>
		sezStatusApplicationId = createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezDevInvestmentAndFinancialTable() {
		super(
			"nbp_sez_dev_Inves_and_financ",
			SezDevInvestmentAndFinancialTable::new);
	}

}