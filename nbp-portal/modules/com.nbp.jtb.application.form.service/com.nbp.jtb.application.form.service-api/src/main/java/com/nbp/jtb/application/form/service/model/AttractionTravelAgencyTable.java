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
 * The table class for the &quot;nbp_jtb_tarvel_agency&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionTravelAgency
 * @generated
 */
public class AttractionTravelAgencyTable
	extends BaseTable<AttractionTravelAgencyTable> {

	public static final AttractionTravelAgencyTable INSTANCE =
		new AttractionTravelAgencyTable();

	public final Column<AttractionTravelAgencyTable, Long>
		attractionTravelAgencyId = createColumn(
			"attractionTravelAgencyId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AttractionTravelAgencyTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionTravelAgencyTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionTravelAgencyTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionTravelAgencyTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionTravelAgencyTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AttractionTravelAgencyTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AttractionTravelAgencyTable, String> applicantName =
		createColumn(
			"applicantName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionTravelAgencyTable, String> agencyAddress =
		createColumn(
			"agencyAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionTravelAgencyTable, String> agencyTelephone =
		createColumn(
			"agencyTelephone", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionTravelAgencyTable, String> agencyName =
		createColumn(
			"agencyName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionTravelAgencyTable, String> agencyAddressSec =
		createColumn(
			"agencyAddressSec", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionTravelAgencyTable, String>
		agencyTelephoneNum = createColumn(
			"agencyTelephoneNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionTravelAgencyTable, String> isRegistered =
		createColumn(
			"isRegistered", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionTravelAgencyTable, String> regstParticulars =
		createColumn(
			"regstParticulars", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionTravelAgencyTable, String> proprietorName =
		createColumn(
			"proprietorName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionTravelAgencyTable, String> managerName =
		createColumn(
			"managerName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionTravelAgencyTable, String> managerAddress =
		createColumn(
			"managerAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionTravelAgencyTable, String> secretaryName =
		createColumn(
			"secretaryName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionTravelAgencyTable, String> secretaryAddress =
		createColumn(
			"secretaryAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionTravelAgencyTable, String> bankerName =
		createColumn(
			"bankerName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionTravelAgencyTable, String>
		bondingCompanyName = createColumn(
			"bondingCompanyName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionTravelAgencyTable, String>
		bondingCompanyAddress = createColumn(
			"bondingCompanyAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionTravelAgencyTable, String> auditorsName =
		createColumn(
			"auditorsName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionTravelAgencyTable, String> auditorsAddress =
		createColumn(
			"auditorsAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionTravelAgencyTable, String> numberOfEmployees =
		createColumn(
			"numberOfEmployees", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionTravelAgencyTable, Date> signDate =
		createColumn(
			"signDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AttractionTravelAgencyTable, Long> jtbApplicationId =
		createColumn(
			"jtbApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private AttractionTravelAgencyTable() {
		super("nbp_jtb_tarvel_agency", AttractionTravelAgencyTable::new);
	}

}