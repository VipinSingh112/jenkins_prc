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
 * The table class for the &quot;nbp_jtb_water_employee&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionWaterEmployee
 * @generated
 */
public class AttractionWaterEmployeeTable
	extends BaseTable<AttractionWaterEmployeeTable> {

	public static final AttractionWaterEmployeeTable INSTANCE =
		new AttractionWaterEmployeeTable();

	public final Column<AttractionWaterEmployeeTable, Long>
		attractionWaterEmpLicId = createColumn(
			"attractionWaterEmpLicId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AttractionWaterEmployeeTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterEmployeeTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterEmployeeTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterEmployeeTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterEmployeeTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterEmployeeTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterEmployeeTable, String> applicantName =
		createColumn(
			"applicantName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterEmployeeTable, String> applicantAddress =
		createColumn(
			"applicantAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionWaterEmployeeTable, String> applicantAge =
		createColumn(
			"applicantAge", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterEmployeeTable, String>
		applicantNationality = createColumn(
			"applicantNationality", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionWaterEmployeeTable, String>
		workPermitApplied = createColumn(
			"workPermitApplied", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionWaterEmployeeTable, Date> workPermitDate =
		createColumn(
			"workPermitDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterEmployeeTable, String> qualification =
		createColumn(
			"qualification", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterEmployeeTable, String>
		placeOfEmployment = createColumn(
			"placeOfEmployment", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionWaterEmployeeTable, String> ownerName =
		createColumn(
			"ownerName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterEmployeeTable, String> cpr =
		createColumn("cpr", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterEmployeeTable, String> firstAid =
		createColumn(
			"firstAid", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterEmployeeTable, String> medicFirstAid =
		createColumn(
			"medicFirstAid", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterEmployeeTable, String> lifeguard =
		createColumn(
			"lifeguard", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterEmployeeTable, String> rescueDiver =
		createColumn(
			"rescueDiver", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterEmployeeTable, String> otherRescue =
		createColumn(
			"otherRescue", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterEmployeeTable, Date>
		employeeSignatureDate = createColumn(
			"employeeSignatureDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<AttractionWaterEmployeeTable, String> timePeriod =
		createColumn(
			"timePeriod", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterEmployeeTable, Long> jtbApplicationId =
		createColumn(
			"jtbApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private AttractionWaterEmployeeTable() {
		super("nbp_jtb_water_employee", AttractionWaterEmployeeTable::new);
	}

}