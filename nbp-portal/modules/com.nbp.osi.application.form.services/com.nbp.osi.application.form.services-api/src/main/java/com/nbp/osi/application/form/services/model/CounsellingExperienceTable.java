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
 * The table class for the &quot;nbp_osi_counselling&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CounsellingExperience
 * @generated
 */
public class CounsellingExperienceTable
	extends BaseTable<CounsellingExperienceTable> {

	public static final CounsellingExperienceTable INSTANCE =
		new CounsellingExperienceTable();

	public final Column<CounsellingExperienceTable, Long>
		counsellingExperienceId = createColumn(
			"counsellingExperienceId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<CounsellingExperienceTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CounsellingExperienceTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CounsellingExperienceTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CounsellingExperienceTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CounsellingExperienceTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CounsellingExperienceTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CounsellingExperienceTable, String> company =
		createColumn(
			"company", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CounsellingExperienceTable, String> position =
		createColumn(
			"position", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CounsellingExperienceTable, String> counsellingType =
		createColumn(
			"counsellingType", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CounsellingExperienceTable, String> serviceLength =
		createColumn(
			"serviceLength", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CounsellingExperienceTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CounsellingExperienceTable, Long> osiApplicationId =
		createColumn(
			"osiApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private CounsellingExperienceTable() {
		super("nbp_osi_counselling", CounsellingExperienceTable::new);
	}

}