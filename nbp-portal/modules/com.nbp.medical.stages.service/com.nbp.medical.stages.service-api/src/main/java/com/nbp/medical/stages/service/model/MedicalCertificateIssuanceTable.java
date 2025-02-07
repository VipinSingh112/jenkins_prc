/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.stages.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_medical_licence_issu&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalCertificateIssuance
 * @generated
 */
public class MedicalCertificateIssuanceTable
	extends BaseTable<MedicalCertificateIssuanceTable> {

	public static final MedicalCertificateIssuanceTable INSTANCE =
		new MedicalCertificateIssuanceTable();

	public final Column<MedicalCertificateIssuanceTable, Long>
		medicalCertificateIssuanceId = createColumn(
			"medicalCertificateIssuanceId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<MedicalCertificateIssuanceTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MedicalCertificateIssuanceTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MedicalCertificateIssuanceTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MedicalCertificateIssuanceTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MedicalCertificateIssuanceTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MedicalCertificateIssuanceTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MedicalCertificateIssuanceTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MedicalCertificateIssuanceTable, String> licenceNumber =
		createColumn(
			"licenceNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MedicalCertificateIssuanceTable, String> status =
		createColumn(
			"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MedicalCertificateIssuanceTable, String>
		medicalCategory = createColumn(
			"medicalCategory", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MedicalCertificateIssuanceTable, Date>
		dateOfLicIssuance = createColumn(
			"dateOfLicIssuance", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<MedicalCertificateIssuanceTable, Date>
		dateOfLicenseExpiration = createColumn(
			"dateOfLicenseExpiration", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<MedicalCertificateIssuanceTable, Long>
		docLicFileEntryId = createColumn(
			"docLicFileEntryId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private MedicalCertificateIssuanceTable() {
		super("nbp_medical_licence_issu", MedicalCertificateIssuanceTable::new);
	}

}