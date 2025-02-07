/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_hsra_medical_pract_add&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalPractitionerAdd
 * @generated
 */
public class MedicalPractitionerAddTable
	extends BaseTable<MedicalPractitionerAddTable> {

	public static final MedicalPractitionerAddTable INSTANCE =
		new MedicalPractitionerAddTable();

	public final Column<MedicalPractitionerAddTable, Long>
		medicalPractitionerAddId = createColumn(
			"medicalPractitionerAddId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<MedicalPractitionerAddTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MedicalPractitionerAddTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MedicalPractitionerAddTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MedicalPractitionerAddTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MedicalPractitionerAddTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MedicalPractitionerAddTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MedicalPractitionerAddTable, String>
		medicalPractitionerName = createColumn(
			"medicalPractitionerName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MedicalPractitionerAddTable, String>
		medicalPractitionerAddress = createColumn(
			"medicalPractitionerAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MedicalPractitionerAddTable, String>
		medicalPractitionerTelephone = createColumn(
			"medicalPractitionerTelephone", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MedicalPractitionerAddTable, String>
		medicalPractitionerFax = createColumn(
			"medicalPractitionerFax", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MedicalPractitionerAddTable, String>
		medicalPractitionerEmail = createColumn(
			"medicalPractitionerEmail", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MedicalPractitionerAddTable, String>
		medicalPractitionerLicenceNo = createColumn(
			"medicalPractitionerLicenceNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MedicalPractitionerAddTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MedicalPractitionerAddTable, Long> hsraApplicationId =
		createColumn(
			"hsraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private MedicalPractitionerAddTable() {
		super("nbp_hsra_medical_pract_add", MedicalPractitionerAddTable::new);
	}

}