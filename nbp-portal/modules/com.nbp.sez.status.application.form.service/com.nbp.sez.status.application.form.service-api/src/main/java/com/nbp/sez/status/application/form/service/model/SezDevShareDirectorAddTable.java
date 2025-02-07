/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_sez_dev_share_director_add&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevShareDirectorAdd
 * @generated
 */
public class SezDevShareDirectorAddTable
	extends BaseTable<SezDevShareDirectorAddTable> {

	public static final SezDevShareDirectorAddTable INSTANCE =
		new SezDevShareDirectorAddTable();

	public final Column<SezDevShareDirectorAddTable, Long>
		sezDevShareDirectorAddId = createColumn(
			"sezDevShareDirectorAddId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<SezDevShareDirectorAddTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevShareDirectorAddTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevShareDirectorAddTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevShareDirectorAddTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevShareDirectorAddTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezDevShareDirectorAddTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezDevShareDirectorAddTable, String> shareholderName =
		createColumn(
			"shareholderName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevShareDirectorAddTable, String> numOfShare =
		createColumn(
			"numOfShare", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevShareDirectorAddTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevShareDirectorAddTable, Long>
		sezStatusApplicationId = createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezDevShareDirectorAddTable() {
		super(
			"nbp_sez_dev_share_director_add", SezDevShareDirectorAddTable::new);
	}

}