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
 * The table class for the &quot;nbp_jtb_domestic_tour&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionDomesticTour
 * @generated
 */
public class AttractionDomesticTourTable
	extends BaseTable<AttractionDomesticTourTable> {

	public static final AttractionDomesticTourTable INSTANCE =
		new AttractionDomesticTourTable();

	public final Column<AttractionDomesticTourTable, Long>
		attractionDomesticTourId = createColumn(
			"attractionDomesticTourId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AttractionDomesticTourTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionDomesticTourTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionDomesticTourTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionDomesticTourTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionDomesticTourTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AttractionDomesticTourTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AttractionDomesticTourTable, String>
		domesticTourApplicantName = createColumn(
			"domesticTourApplicantName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionDomesticTourTable, String>
		domesticTourAddress = createColumn(
			"domesticTourAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionDomesticTourTable, String>
		domesticTourCompanyName = createColumn(
			"domesticTourCompanyName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionDomesticTourTable, String>
		domesticTourExactLocation = createColumn(
			"domesticTourExactLocation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionDomesticTourTable, String>
		domesticTourTelephone = createColumn(
			"domesticTourTelephone", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionDomesticTourTable, String> domesticTourEmail =
		createColumn(
			"domesticTourEmail", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionDomesticTourTable, Date> domesticTourDate =
		createColumn(
			"domesticTourDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<AttractionDomesticTourTable, String>
		domesticTourManagerName = createColumn(
			"domesticTourManagerName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionDomesticTourTable, String>
		domesticTourVehiclesNum = createColumn(
			"domesticTourVehiclesNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionDomesticTourTable, String>
		domesticTourEmployeesNo = createColumn(
			"domesticTourEmployeesNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionDomesticTourTable, String>
		domesticTourOfficeLocation = createColumn(
			"domesticTourOfficeLocation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionDomesticTourTable, Date>
		domesticTourSignDate = createColumn(
			"domesticTourSignDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<AttractionDomesticTourTable, Long> jtbApplicationId =
		createColumn(
			"jtbApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private AttractionDomesticTourTable() {
		super("nbp_jtb_domestic_tour", AttractionDomesticTourTable::new);
	}

}