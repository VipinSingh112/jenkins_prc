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
 * The table class for the &quot;nbp_jtb_water_general&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionWaterGenDeclare
 * @generated
 */
public class AttractionWaterGenDeclareTable
	extends BaseTable<AttractionWaterGenDeclareTable> {

	public static final AttractionWaterGenDeclareTable INSTANCE =
		new AttractionWaterGenDeclareTable();

	public final Column<AttractionWaterGenDeclareTable, Long>
		attractionWaterGenDeclareId = createColumn(
			"attractionWaterGenDeclareId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AttractionWaterGenDeclareTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterGenDeclareTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterGenDeclareTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterGenDeclareTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterGenDeclareTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterGenDeclareTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterGenDeclareTable, String> firstAid =
		createColumn(
			"firstAid", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterGenDeclareTable, String> cpr =
		createColumn("cpr", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterGenDeclareTable, String>
		divingCertificate = createColumn(
			"divingCertificate", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionWaterGenDeclareTable, String> rlss =
		createColumn("rlss", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterGenDeclareTable, String> lifeguard =
		createColumn(
			"lifeguard", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterGenDeclareTable, String> breathing =
		createColumn(
			"breathing", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterGenDeclareTable, String> operationName =
		createColumn(
			"operationName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterGenDeclareTable, String>
		operationAddress = createColumn(
			"operationAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionWaterGenDeclareTable, String>
		insuranceAmount = createColumn(
			"insuranceAmount", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionWaterGenDeclareTable, Date> managerSignDate =
		createColumn(
			"managerSignDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<AttractionWaterGenDeclareTable, Long> jtbApplicationId =
		createColumn(
			"jtbApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private AttractionWaterGenDeclareTable() {
		super("nbp_jtb_water_general", AttractionWaterGenDeclareTable::new);
	}

}