/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_janaac_acc_cer_app_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyApplicantInfo
 * @generated
 */
public class AccCerBodyApplicantInfoTable
	extends BaseTable<AccCerBodyApplicantInfoTable> {

	public static final AccCerBodyApplicantInfoTable INSTANCE =
		new AccCerBodyApplicantInfoTable();

	public final Column<AccCerBodyApplicantInfoTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyApplicantInfoTable, Long>
		accCerBodyApplicantInfoId = createColumn(
			"accCerBodyApplicantInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AccCerBodyApplicantInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyApplicantInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyApplicantInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyApplicantInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyApplicantInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyApplicantInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyApplicantInfoTable, String> applicantName =
		createColumn(
			"applicantName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyApplicantInfoTable, String> applicantAddress =
		createColumn(
			"applicantAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyApplicantInfoTable, String>
		applicantTelephone = createColumn(
			"applicantTelephone", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyApplicantInfoTable, String> applicantFaxNo =
		createColumn(
			"applicantFaxNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyApplicantInfoTable, String> applicantWebsite =
		createColumn(
			"applicantWebsite", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyApplicantInfoTable, String>
		certificationName = createColumn(
			"certificationName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyApplicantInfoTable, String> certiAddress =
		createColumn(
			"certiAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyApplicantInfoTable, String> personnelName =
		createColumn(
			"personnelName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyApplicantInfoTable, String> personnelEmail =
		createColumn(
			"personnelEmail", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyApplicantInfoTable, String>
		personnelContactName = createColumn(
			"personnelContactName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyApplicantInfoTable, String>
		personnelContactEmail = createColumn(
			"personnelContactEmail", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyApplicantInfoTable, String> personnelFMName =
		createColumn(
			"personnelFMName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyApplicantInfoTable, String> personnelFMEmail =
		createColumn(
			"personnelFMEmail", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyApplicantInfoTable, String>
		accreditationRequest = createColumn(
			"accreditationRequest", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyApplicantInfoTable, String> managementSystem =
		createColumn(
			"managementSystem", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyApplicantInfoTable, String> specifyOther =
		createColumn(
			"specifyOther", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyApplicantInfoTable, String> listOfStandard =
		createColumn(
			"listOfStandard", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyApplicantInfoTable, String>
		authorizedPersonnelName = createColumn(
			"authorizedPersonnelName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyApplicantInfoTable, String>
		authorizedPersonnelPos = createColumn(
			"authorizedPersonnelPos", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyApplicantInfoTable, Date>
		authorizedPersonnelDate = createColumn(
			"authorizedPersonnelDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyApplicantInfoTable, Long>
		janaacApplicationId = createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private AccCerBodyApplicantInfoTable() {
		super("nbp_janaac_acc_cer_app_info", AccCerBodyApplicantInfoTable::new);
	}

}