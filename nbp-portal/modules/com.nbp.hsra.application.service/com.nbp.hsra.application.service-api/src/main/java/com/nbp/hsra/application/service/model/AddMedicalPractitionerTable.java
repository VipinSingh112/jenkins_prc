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
 * The table class for the &quot;nbp_hsra_medical_practitioner&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AddMedicalPractitioner
 * @generated
 */
public class AddMedicalPractitionerTable
	extends BaseTable<AddMedicalPractitionerTable> {

	public static final AddMedicalPractitionerTable INSTANCE =
		new AddMedicalPractitionerTable();

	public final Column<AddMedicalPractitionerTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddMedicalPractitionerTable, Long>
		addMedicalPractitionerId = createColumn(
			"addMedicalPractitionerId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AddMedicalPractitionerTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddMedicalPractitionerTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddMedicalPractitionerTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddMedicalPractitionerTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddMedicalPractitionerTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddMedicalPractitionerTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddMedicalPractitionerTable, Date>
		medicalPractitionerDate = createColumn(
			"medicalPractitionerDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<AddMedicalPractitionerTable, Date> applicantDate =
		createColumn(
			"applicantDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddMedicalPractitionerTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddMedicalPractitionerTable, Long> hsraApplicationId =
		createColumn(
			"hsraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private AddMedicalPractitionerTable() {
		super(
			"nbp_hsra_medical_practitioner", AddMedicalPractitionerTable::new);
	}

}