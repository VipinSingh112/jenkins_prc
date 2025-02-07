/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_creative_director_box&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeDirectorListinAddBox
 * @generated
 */
public class CreativeDirectorListinAddBoxTable
	extends BaseTable<CreativeDirectorListinAddBoxTable> {

	public static final CreativeDirectorListinAddBoxTable INSTANCE =
		new CreativeDirectorListinAddBoxTable();

	public final Column<CreativeDirectorListinAddBoxTable, Long>
		creativeDirectorBoxId = createColumn(
			"creativeDirectorBoxId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<CreativeDirectorListinAddBoxTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeDirectorListinAddBoxTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeDirectorListinAddBoxTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeDirectorListinAddBoxTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeDirectorListinAddBoxTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CreativeDirectorListinAddBoxTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CreativeDirectorListinAddBoxTable, String> fullName =
		createColumn(
			"fullName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeDirectorListinAddBoxTable, String> title =
		createColumn("title", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeDirectorListinAddBoxTable, String> trn =
		createColumn("trn", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeDirectorListinAddBoxTable, String>
		directorCountre = createColumn(
			"directorCountre", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeDirectorListinAddBoxTable, Long>
		CreativeApplicationId = createColumn(
			"CreativeApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private CreativeDirectorListinAddBoxTable() {
		super(
			"nbp_creative_director_box",
			CreativeDirectorListinAddBoxTable::new);
	}

}