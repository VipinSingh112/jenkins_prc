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
 * The table class for the &quot;nbp_jtb_bike_rental&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionBikeRentalInfo
 * @generated
 */
public class AttractionBikeRentalInfoTable
	extends BaseTable<AttractionBikeRentalInfoTable> {

	public static final AttractionBikeRentalInfoTable INSTANCE =
		new AttractionBikeRentalInfoTable();

	public final Column<AttractionBikeRentalInfoTable, Long>
		attractionBikeRentalInfoId = createColumn(
			"attractionBikeRentalInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AttractionBikeRentalInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionBikeRentalInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionBikeRentalInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionBikeRentalInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionBikeRentalInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AttractionBikeRentalInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AttractionBikeRentalInfoTable, String> applicantName =
		createColumn(
			"applicantName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionBikeRentalInfoTable, String> address =
		createColumn(
			"address", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionBikeRentalInfoTable, String> companyName =
		createColumn(
			"companyName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionBikeRentalInfoTable, String> exactLocation =
		createColumn(
			"exactLocation", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionBikeRentalInfoTable, String> telephone =
		createColumn(
			"telephone", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionBikeRentalInfoTable, String> email =
		createColumn("email", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionBikeRentalInfoTable, Date> registrationDate =
		createColumn(
			"registrationDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<AttractionBikeRentalInfoTable, String> managerName =
		createColumn(
			"managerName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionBikeRentalInfoTable, String> numberOfBikes =
		createColumn(
			"numberOfBikes", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionBikeRentalInfoTable, String> numberOfHelmets =
		createColumn(
			"numberOfHelmets", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionBikeRentalInfoTable, String>
		numberOfEmployees = createColumn(
			"numberOfEmployees", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionBikeRentalInfoTable, Date> signatureDate =
		createColumn(
			"signatureDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AttractionBikeRentalInfoTable, String>
		motorBikeIndustry = createColumn(
			"motorBikeIndustry", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionBikeRentalInfoTable, Long> jtbApplicationId =
		createColumn(
			"jtbApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private AttractionBikeRentalInfoTable() {
		super("nbp_jtb_bike_rental", AttractionBikeRentalInfoTable::new);
	}

}