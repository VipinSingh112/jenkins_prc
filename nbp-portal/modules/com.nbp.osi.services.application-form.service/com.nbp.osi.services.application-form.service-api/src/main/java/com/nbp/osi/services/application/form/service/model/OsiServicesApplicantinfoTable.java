/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_osi_services_appli_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesApplicantinfo
 * @generated
 */
public class OsiServicesApplicantinfoTable
	extends BaseTable<OsiServicesApplicantinfoTable> {

	public static final OsiServicesApplicantinfoTable INSTANCE =
		new OsiServicesApplicantinfoTable();

	public final Column<OsiServicesApplicantinfoTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiServicesApplicantinfoTable, Long>
		osiServicesApplicanId = createColumn(
			"osiServicesApplicanId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<OsiServicesApplicantinfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiServicesApplicantinfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiServicesApplicantinfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiServicesApplicantinfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiServicesApplicantinfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiServicesApplicantinfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiServicesApplicantinfoTable, String> applicantNature =
		createColumn(
			"applicantNature", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiServicesApplicantinfoTable, String> indiFirstName =
		createColumn(
			"indiFirstName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiServicesApplicantinfoTable, String> indiLastName =
		createColumn(
			"indiLastName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiServicesApplicantinfoTable, String> companyName =
		createColumn(
			"companyName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiServicesApplicantinfoTable, String> address =
		createColumn(
			"address", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiServicesApplicantinfoTable, String> emailAddress =
		createColumn(
			"emailAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiServicesApplicantinfoTable, String> telephone =
		createColumn(
			"telephone", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiServicesApplicantinfoTable, Date> applicationDate =
		createColumn(
			"applicationDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<OsiServicesApplicantinfoTable, String> trnNumber =
		createColumn(
			"trnNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiServicesApplicantinfoTable, Long>
		osiServicesApplicationId = createColumn(
			"osiServicesApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private OsiServicesApplicantinfoTable() {
		super(
			"nbp_osi_services_appli_info", OsiServicesApplicantinfoTable::new);
	}

}