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
 * The table class for the &quot;nbp_medical_nursing_staff&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesNurseStaff
 * @generated
 */
public class MedicalFacilitiesNurseStaffTable
	extends BaseTable<MedicalFacilitiesNurseStaffTable> {

	public static final MedicalFacilitiesNurseStaffTable INSTANCE =
		new MedicalFacilitiesNurseStaffTable();

	public final Column<MedicalFacilitiesNurseStaffTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesNurseStaffTable, Long>
		medicalFacilitiesNurseStaffId = createColumn(
			"medicalFacilitiesNurseStaffId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<MedicalFacilitiesNurseStaffTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesNurseStaffTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesNurseStaffTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesNurseStaffTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesNurseStaffTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesNurseStaffTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesNurseStaffTable, String> nStaffName =
		createColumn(
			"nStaffName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesNurseStaffTable, String>
		nStaffQualification = createColumn(
			"nStaffQualification", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesNurseStaffTable, String> nStaffState =
		createColumn(
			"nStaffState", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesNurseStaffTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesNurseStaffTable, Long>
		medicalFacilitiesAppId = createColumn(
			"medicalFacilitiesAppId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private MedicalFacilitiesNurseStaffTable() {
		super(
			"nbp_medical_nursing_staff", MedicalFacilitiesNurseStaffTable::new);
	}

}