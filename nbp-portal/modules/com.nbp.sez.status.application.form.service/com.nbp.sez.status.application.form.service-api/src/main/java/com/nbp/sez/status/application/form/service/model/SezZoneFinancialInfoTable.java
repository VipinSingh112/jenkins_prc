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
 * The table class for the &quot;nbp_sez_zone_financial_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneFinancialInfo
 * @generated
 */
public class SezZoneFinancialInfoTable
	extends BaseTable<SezZoneFinancialInfoTable> {

	public static final SezZoneFinancialInfoTable INSTANCE =
		new SezZoneFinancialInfoTable();

	public final Column<SezZoneFinancialInfoTable, Long> sezZoneFinancialnfoId =
		createColumn(
			"sezZoneFinancialnfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<SezZoneFinancialInfoTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezZoneFinancialInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezZoneFinancialInfoTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezZoneFinancialInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezZoneFinancialInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezZoneFinancialInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezZoneFinancialInfoTable, String>
		buildingInfrastructure = createColumn(
			"buildingInfrastructure", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneFinancialInfoTable, String>
		equipmentInfrastructure = createColumn(
			"equipmentInfrastructure", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneFinancialInfoTable, String>
		machinesInfrastructure = createColumn(
			"machinesInfrastructure", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneFinancialInfoTable, String> totalInfrastructure =
		createColumn(
			"totalInfrastructure", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneFinancialInfoTable, String> financeSource =
		createColumn(
			"financeSource", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezZoneFinancialInfoTable, String> otherFinanceSource =
		createColumn(
			"otherFinanceSource", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneFinancialInfoTable, Long>
		sezStatusApplicationId = createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezZoneFinancialInfoTable() {
		super("nbp_sez_zone_financial_info", SezZoneFinancialInfoTable::new);
	}

}