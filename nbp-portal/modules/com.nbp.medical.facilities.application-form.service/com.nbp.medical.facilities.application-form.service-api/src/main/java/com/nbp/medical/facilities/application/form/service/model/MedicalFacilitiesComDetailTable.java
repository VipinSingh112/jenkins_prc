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
 * The table class for the &quot;nbp_medical_company_detail&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesComDetail
 * @generated
 */
public class MedicalFacilitiesComDetailTable
	extends BaseTable<MedicalFacilitiesComDetailTable> {

	public static final MedicalFacilitiesComDetailTable INSTANCE =
		new MedicalFacilitiesComDetailTable();

	public final Column<MedicalFacilitiesComDetailTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesComDetailTable, Long>
		medicalFacilitiesComDetailId = createColumn(
			"medicalFacilitiesComDetailId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<MedicalFacilitiesComDetailTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesComDetailTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesComDetailTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesComDetailTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesComDetailTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesComDetailTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesComDetailTable, String> fullName =
		createColumn(
			"fullName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesComDetailTable, String>
		privateAddress = createColumn(
			"privateAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesComDetailTable, String>
		registeredOffice = createColumn(
			"registeredOffice", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesComDetailTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesComDetailTable, Long>
		medicalFacilitiesAppId = createColumn(
			"medicalFacilitiesAppId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private MedicalFacilitiesComDetailTable() {
		super(
			"nbp_medical_company_detail", MedicalFacilitiesComDetailTable::new);
	}

}