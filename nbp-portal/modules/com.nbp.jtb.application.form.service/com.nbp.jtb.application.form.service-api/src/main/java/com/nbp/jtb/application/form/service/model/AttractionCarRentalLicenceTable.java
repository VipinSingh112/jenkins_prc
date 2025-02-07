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
 * The table class for the &quot;nbp_jtb_car_rental_licence&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionCarRentalLicence
 * @generated
 */
public class AttractionCarRentalLicenceTable
	extends BaseTable<AttractionCarRentalLicenceTable> {

	public static final AttractionCarRentalLicenceTable INSTANCE =
		new AttractionCarRentalLicenceTable();

	public final Column<AttractionCarRentalLicenceTable, Long>
		attractionCarRentalLicId = createColumn(
			"attractionCarRentalLicId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AttractionCarRentalLicenceTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentalLicenceTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentalLicenceTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentalLicenceTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentalLicenceTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentalLicenceTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentalLicenceTable, String>
		ncrApplicantName = createColumn(
			"ncrApplicantName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentalLicenceTable, String> ncrAddress =
		createColumn(
			"ncrAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentalLicenceTable, String>
		ncrCompanyName = createColumn(
			"ncrCompanyName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentalLicenceTable, String>
		ncrCompanyAddr = createColumn(
			"ncrCompanyAddr", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentalLicenceTable, String> ncrTelephone =
		createColumn(
			"ncrTelephone", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentalLicenceTable, String> ncrEmail =
		createColumn(
			"ncrEmail", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentalLicenceTable, String>
		ncrManagerName = createColumn(
			"ncrManagerName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentalLicenceTable, Date> ncrDate =
		createColumn(
			"ncrDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentalLicenceTable, String> ncrVehiclesNo =
		createColumn(
			"ncrVehiclesNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentalLicenceTable, String>
		ncrEmployeesNo = createColumn(
			"ncrEmployeesNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentalLicenceTable, String> ncrOfficeLoc =
		createColumn(
			"ncrOfficeLoc", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentalLicenceTable, String> ncrPosition =
		createColumn(
			"ncrPosition", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentalLicenceTable, Date> ncrSignDate =
		createColumn(
			"ncrSignDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentalLicenceTable, Long>
		jtbApplicationId = createColumn(
			"jtbApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private AttractionCarRentalLicenceTable() {
		super(
			"nbp_jtb_car_rental_licence", AttractionCarRentalLicenceTable::new);
	}

}