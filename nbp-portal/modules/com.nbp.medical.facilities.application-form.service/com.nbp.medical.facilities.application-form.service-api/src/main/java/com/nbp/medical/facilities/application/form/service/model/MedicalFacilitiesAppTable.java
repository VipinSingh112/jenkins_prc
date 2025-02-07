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
 * The table class for the &quot;nbp_medical_facilities_app&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesApp
 * @generated
 */
public class MedicalFacilitiesAppTable
	extends BaseTable<MedicalFacilitiesAppTable> {

	public static final MedicalFacilitiesAppTable INSTANCE =
		new MedicalFacilitiesAppTable();

	public final Column<MedicalFacilitiesAppTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesAppTable, Long>
		medicalFacilitiesAppId = createColumn(
			"medicalFacilitiesAppId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<MedicalFacilitiesAppTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesAppTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesAppTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesAppTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesAppTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesAppTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesAppTable, String> natureOfApplicant =
		createColumn(
			"natureOfApplicant", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesAppTable, String> typeOfTransaction =
		createColumn(
			"typeOfTransaction", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesAppTable, Long> registrationNumber =
		createColumn(
			"registrationNumber", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesAppTable, String> medicalCategory =
		createColumn(
			"medicalCategory", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesAppTable, String> subCategory =
		createColumn(
			"subCategory", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesAppTable, String>
		nursingHomesCategory = createColumn(
			"nursingHomesCategory", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesAppTable, String>
		nursingSubCategoryVal = createColumn(
			"nursingSubCategoryVal", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesAppTable, String> numberOfBeds =
		createColumn(
			"numberOfBeds", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesAppTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesAppTable, Integer> status =
		createColumn(
			"status", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesAppTable, String> icmDocumentPath =
		createColumn(
			"icmDocumentPath", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesAppTable, String> applicationNumber =
		createColumn(
			"applicationNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesAppTable, String>
		expiredLicenseAppNumber = createColumn(
			"expiredLicenseAppNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesAppTable, Long> pdfFileEntryId =
		createColumn(
			"pdfFileEntryId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesAppTable, String> appCurrentStageName =
		createColumn(
			"appCurrentStageName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesAppTable, String> entityId =
		createColumn(
			"entityId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private MedicalFacilitiesAppTable() {
		super("nbp_medical_facilities_app", MedicalFacilitiesAppTable::new);
	}

}