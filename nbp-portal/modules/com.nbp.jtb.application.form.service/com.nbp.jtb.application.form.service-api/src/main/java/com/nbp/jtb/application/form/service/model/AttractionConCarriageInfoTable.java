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
 * The table class for the &quot;nbp_jtb_contract_carriage&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionConCarriageInfo
 * @generated
 */
public class AttractionConCarriageInfoTable
	extends BaseTable<AttractionConCarriageInfoTable> {

	public static final AttractionConCarriageInfoTable INSTANCE =
		new AttractionConCarriageInfoTable();

	public final Column<AttractionConCarriageInfoTable, Long>
		attractionConCarriageInfoId = createColumn(
			"attractionConCarriageInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AttractionConCarriageInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionConCarriageInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionConCarriageInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionConCarriageInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionConCarriageInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AttractionConCarriageInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AttractionConCarriageInfoTable, String> ownerName =
		createColumn(
			"ownerName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionConCarriageInfoTable, String> homeAddress =
		createColumn(
			"homeAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionConCarriageInfoTable, String> email =
		createColumn("email", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionConCarriageInfoTable, String> telephone =
		createColumn(
			"telephone", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionConCarriageInfoTable, String> parish =
		createColumn(
			"parish", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionConCarriageInfoTable, Date> newContractDate =
		createColumn(
			"newContractDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<AttractionConCarriageInfoTable, String>
		newContarctVehiclesNo = createColumn(
			"newContarctVehiclesNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionConCarriageInfoTable, String> newContractTrn =
		createColumn(
			"newContractTrn", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionConCarriageInfoTable, String>
		contractOrganization = createColumn(
			"contractOrganization", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionConCarriageInfoTable, Date> ownerSignDate =
		createColumn(
			"ownerSignDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AttractionConCarriageInfoTable, Long> jtbApplicationId =
		createColumn(
			"jtbApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private AttractionConCarriageInfoTable() {
		super("nbp_jtb_contract_carriage", AttractionConCarriageInfoTable::new);
	}

}