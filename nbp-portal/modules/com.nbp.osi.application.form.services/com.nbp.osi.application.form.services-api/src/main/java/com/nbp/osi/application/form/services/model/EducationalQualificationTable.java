/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_osi_education_details&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see EducationalQualification
 * @generated
 */
public class EducationalQualificationTable
	extends BaseTable<EducationalQualificationTable> {

	public static final EducationalQualificationTable INSTANCE =
		new EducationalQualificationTable();

	public final Column<EducationalQualificationTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<EducationalQualificationTable, Long>
		educationalDetailId = createColumn(
			"educationalDetailId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<EducationalQualificationTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<EducationalQualificationTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<EducationalQualificationTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<EducationalQualificationTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<EducationalQualificationTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<EducationalQualificationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<EducationalQualificationTable, String> institution =
		createColumn(
			"institution", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<EducationalQualificationTable, String>
		qualificationType = createColumn(
			"qualificationType", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<EducationalQualificationTable, Date>
		qualificationPeriod = createColumn(
			"qualificationPeriod", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<EducationalQualificationTable, String>
		qualificationGrade = createColumn(
			"qualificationGrade", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<EducationalQualificationTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<EducationalQualificationTable, Long> osiApplicationId =
		createColumn(
			"osiApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private EducationalQualificationTable() {
		super("nbp_osi_education_details", EducationalQualificationTable::new);
	}

}