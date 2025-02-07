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
 * The table class for the &quot;nbp_janaac_acc_third_appli&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AccThirdPartyAppliInfo
 * @generated
 */
public class AccThirdPartyAppliInfoTable
	extends BaseTable<AccThirdPartyAppliInfoTable> {

	public static final AccThirdPartyAppliInfoTable INSTANCE =
		new AccThirdPartyAppliInfoTable();

	public final Column<AccThirdPartyAppliInfoTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyAppliInfoTable, Long>
		accThirdPartyAppliInfoId = createColumn(
			"accThirdPartyAppliInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AccThirdPartyAppliInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyAppliInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyAppliInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyAppliInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyAppliInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyAppliInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyAppliInfoTable, String> applicantName =
		createColumn(
			"applicantName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyAppliInfoTable, String> applicantAddress =
		createColumn(
			"applicantAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyAppliInfoTable, String>
		applicantTelephone = createColumn(
			"applicantTelephone", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyAppliInfoTable, String> applicantFaxNo =
		createColumn(
			"applicantFaxNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyAppliInfoTable, String> applicantWebsite =
		createColumn(
			"applicantWebsite", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyAppliInfoTable, String> certificationName =
		createColumn(
			"certificationName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyAppliInfoTable, String> certiAddress =
		createColumn(
			"certiAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyAppliInfoTable, String> personnelName =
		createColumn(
			"personnelName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyAppliInfoTable, String> personnelEmail =
		createColumn(
			"personnelEmail", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyAppliInfoTable, String>
		personnelContactName = createColumn(
			"personnelContactName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyAppliInfoTable, String>
		personnelContactEmail = createColumn(
			"personnelContactEmail", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyAppliInfoTable, String> personnelFMName =
		createColumn(
			"personnelFMName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyAppliInfoTable, String> personnelFMEmail =
		createColumn(
			"personnelFMEmail", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyAppliInfoTable, String>
		accreditationRequest = createColumn(
			"accreditationRequest", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyAppliInfoTable, String> accFdaScheme =
		createColumn(
			"accFdaScheme", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyAppliInfoTable, String> specifyOther =
		createColumn(
			"specifyOther", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyAppliInfoTable, String>
		supplementaryCertificate = createColumn(
			"supplementaryCertificate", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyAppliInfoTable, String>
		supplementaryOther = createColumn(
			"supplementaryOther", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyAppliInfoTable, String> listOfStandard =
		createColumn(
			"listOfStandard", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyAppliInfoTable, String>
		authorizedPersonnelName = createColumn(
			"authorizedPersonnelName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyAppliInfoTable, String>
		authorizedPersonnelPos = createColumn(
			"authorizedPersonnelPos", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyAppliInfoTable, Date>
		authorizedPersonnelDate = createColumn(
			"authorizedPersonnelDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<AccThirdPartyAppliInfoTable, Long> janaacApplicationId =
		createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private AccThirdPartyAppliInfoTable() {
		super("nbp_janaac_acc_third_appli", AccThirdPartyAppliInfoTable::new);
	}

}