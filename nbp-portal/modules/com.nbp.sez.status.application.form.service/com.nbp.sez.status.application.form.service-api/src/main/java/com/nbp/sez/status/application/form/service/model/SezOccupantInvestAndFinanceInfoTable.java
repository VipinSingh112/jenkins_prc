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
 * The table class for the &quot;nbp_sez_occ_invest_fina_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantInvestAndFinanceInfo
 * @generated
 */
public class SezOccupantInvestAndFinanceInfoTable
	extends BaseTable<SezOccupantInvestAndFinanceInfoTable> {

	public static final SezOccupantInvestAndFinanceInfoTable INSTANCE =
		new SezOccupantInvestAndFinanceInfoTable();

	public final Column<SezOccupantInvestAndFinanceInfoTable, Long>
		sezOccInvestFinancId = createColumn(
			"sezOccInvestFinancId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<SezOccupantInvestAndFinanceInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccupantInvestAndFinanceInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccupantInvestAndFinanceInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccupantInvestAndFinanceInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezOccupantInvestAndFinanceInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezOccupantInvestAndFinanceInfoTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezOccupantInvestAndFinanceInfoTable, String>
		occInfraBuilding = createColumn(
			"occInfraBuilding", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupantInvestAndFinanceInfoTable, String>
		occInfraEquipment = createColumn(
			"occInfraEquipment", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupantInvestAndFinanceInfoTable, String>
		occInfraMachines = createColumn(
			"occInfraMachines", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupantInvestAndFinanceInfoTable, String>
		occInfraTotal = createColumn(
			"occInfraTotal", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezOccupantInvestAndFinanceInfoTable, String>
		occInfraFinanceSource = createColumn(
			"occInfraFinanceSource", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupantInvestAndFinanceInfoTable, Long>
		sezStatusApplicationId = createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezOccupantInvestAndFinanceInfoTable() {
		super(
			"nbp_sez_occ_invest_fina_info",
			SezOccupantInvestAndFinanceInfoTable::new);
	}

}