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
 * The table class for the &quot;nbp_medical_maternity_home&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesMaterHome
 * @generated
 */
public class MedicalFacilitiesMaterHomeTable
	extends BaseTable<MedicalFacilitiesMaterHomeTable> {

	public static final MedicalFacilitiesMaterHomeTable INSTANCE =
		new MedicalFacilitiesMaterHomeTable();

	public final Column<MedicalFacilitiesMaterHomeTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesMaterHomeTable, Long>
		medicalFacilitiesMaterHomeId = createColumn(
			"medicalFacilitiesMaterHomeId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<MedicalFacilitiesMaterHomeTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesMaterHomeTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesMaterHomeTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesMaterHomeTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesMaterHomeTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesMaterHomeTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesMaterHomeTable, String> nurseName =
		createColumn(
			"nurseName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesMaterHomeTable, String>
		nurseQualification = createColumn(
			"nurseQualification", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesMaterHomeTable, String> otherPerson =
		createColumn(
			"otherPerson", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesMaterHomeTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MedicalFacilitiesMaterHomeTable, Long>
		medicalFacilitiesAppId = createColumn(
			"medicalFacilitiesAppId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private MedicalFacilitiesMaterHomeTable() {
		super(
			"nbp_medical_maternity_home", MedicalFacilitiesMaterHomeTable::new);
	}

}