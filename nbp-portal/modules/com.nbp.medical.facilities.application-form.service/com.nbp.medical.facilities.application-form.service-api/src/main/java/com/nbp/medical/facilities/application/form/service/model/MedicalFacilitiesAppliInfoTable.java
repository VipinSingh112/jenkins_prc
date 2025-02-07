/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_medical_appli_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesAppliInfo
 * @generated
 */
public class MedicalFacilitiesAppliInfoTable
	extends BaseTable<MedicalFacilitiesAppliInfoTable> {

	public static final MedicalFacilitiesAppliInfoTable INSTANCE =
		new MedicalFacilitiesAppliInfoTable();

	public final Column<MedicalFacilitiesAppliInfoTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesAppliInfoTable, Long>
		medicalFacilitiesAppliId = createColumn(
			"medicalFacilitiesAppliId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<MedicalFacilitiesAppliInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesAppliInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesAppliInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesAppliInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesAppliInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesAppliInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesAppliInfoTable, String> applicantName =
		createColumn(
			"applicantName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesAppliInfoTable, String>
		appliTelephoneNumber = createColumn(
			"appliTelephoneNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesAppliInfoTable, String> appliAddress =
		createColumn(
			"appliAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesAppliInfoTable, String>
		appliEmailAddress = createColumn(
			"appliEmailAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesAppliInfoTable, String>
		appliNationality = createColumn(
			"appliNationality", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesAppliInfoTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesAppliInfoTable, Long>
		medicalFacilitiesAppId = createColumn(
			"medicalFacilitiesAppId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private MedicalFacilitiesAppliInfoTable() {
		super("nbp_medical_appli_info", MedicalFacilitiesAppliInfoTable::new);
	}

}