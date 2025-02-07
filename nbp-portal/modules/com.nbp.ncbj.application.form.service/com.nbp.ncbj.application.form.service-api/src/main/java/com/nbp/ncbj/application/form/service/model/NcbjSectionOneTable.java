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
 * The table class for the &quot;nbp_ncbj_section_one&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSectionOne
 * @generated
 */
public class NcbjSectionOneTable extends BaseTable<NcbjSectionOneTable> {

	public static final NcbjSectionOneTable INSTANCE =
		new NcbjSectionOneTable();

	public final Column<NcbjSectionOneTable, Long> ncbjSectionOneId =
		createColumn(
			"ncbjSectionOneId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<NcbjSectionOneTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionOneTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionOneTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionOneTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionOneTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionOneTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjSectionOneTable, String> numberOfProductTypes =
		createColumn(
			"numberOfProductTypes", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjSectionOneTable, String> pleaseListProduct =
		createColumn(
			"pleaseListProduct", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjSectionOneTable, Date> numberOfProductionLines =
		createColumn(
			"numberOfProductionLines", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<NcbjSectionOneTable, Date> exclusionActivities =
		createColumn(
			"exclusionActivities", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<NcbjSectionOneTable, Long> ncbjApplicationId =
		createColumn(
			"ncbjApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private NcbjSectionOneTable() {
		super("nbp_ncbj_section_one", NcbjSectionOneTable::new);
	}

}