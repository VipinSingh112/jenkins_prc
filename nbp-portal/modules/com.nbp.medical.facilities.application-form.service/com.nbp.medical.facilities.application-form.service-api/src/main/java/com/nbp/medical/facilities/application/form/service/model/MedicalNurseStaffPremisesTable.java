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
 * The table class for the &quot;nbp_medical_staff_premises&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalNurseStaffPremises
 * @generated
 */
public class MedicalNurseStaffPremisesTable
	extends BaseTable<MedicalNurseStaffPremisesTable> {

	public static final MedicalNurseStaffPremisesTable INSTANCE =
		new MedicalNurseStaffPremisesTable();

	public final Column<MedicalNurseStaffPremisesTable, Long>
		medicalNurseStaffPremisesId = createColumn(
			"medicalNurseStaffPremisesId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<MedicalNurseStaffPremisesTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MedicalNurseStaffPremisesTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MedicalNurseStaffPremisesTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MedicalNurseStaffPremisesTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MedicalNurseStaffPremisesTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MedicalNurseStaffPremisesTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MedicalNurseStaffPremisesTable, String>
		nursingStaffCategory = createColumn(
			"nursingStaffCategory", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MedicalNurseStaffPremisesTable, Long>
		medicalFacilitiesAppId = createColumn(
			"medicalFacilitiesAppId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private MedicalNurseStaffPremisesTable() {
		super(
			"nbp_medical_staff_premises", MedicalNurseStaffPremisesTable::new);
	}

}