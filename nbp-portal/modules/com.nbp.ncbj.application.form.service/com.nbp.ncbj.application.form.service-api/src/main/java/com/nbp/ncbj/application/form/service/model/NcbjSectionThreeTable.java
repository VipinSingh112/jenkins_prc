/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_ncbj_section_three&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSectionThree
 * @generated
 */
public class NcbjSectionThreeTable extends BaseTable<NcbjSectionThreeTable> {

	public static final NcbjSectionThreeTable INSTANCE =
		new NcbjSectionThreeTable();

	public final Column<NcbjSectionThreeTable, Long> ncbjSectionThreeId =
		createColumn(
			"ncbjSectionThreeId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<NcbjSectionThreeTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionThreeTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionThreeTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionThreeTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionThreeTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionThreeTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionThreeTable, String>
		processActivityDescription = createColumn(
			"processActivityDescription", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjSectionThreeTable, String> incomingMaterialsDes =
		createColumn(
			"incomingMaterialsDes", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjSectionThreeTable, String> processDescription =
		createColumn(
			"processDescription", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjSectionThreeTable, String> processActivitiesList =
		createColumn(
			"processActivitiesList", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjSectionThreeTable, String> specialActivities =
		createColumn(
			"specialActivities", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjSectionThreeTable, String> explainationBox =
		createColumn(
			"explainationBox", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjSectionThreeTable, String> categoryOne =
		createColumn(
			"categoryOne", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionThreeTable, String> categoryTwo =
		createColumn(
			"categoryTwo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionThreeTable, String> categoryThree =
		createColumn(
			"categoryThree", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionThreeTable, String> categoryFour =
		createColumn(
			"categoryFour", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionThreeTable, Long> ncbjApplicationId =
		createColumn(
			"ncbjApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private NcbjSectionThreeTable() {
		super("nbp_ncbj_section_three", NcbjSectionThreeTable::new);
	}

}