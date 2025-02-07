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
 * The table class for the &quot;nbp_sez_occ_location_add&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccLocationAdd
 * @generated
 */
public class SezOccLocationAddTable extends BaseTable<SezOccLocationAddTable> {

	public static final SezOccLocationAddTable INSTANCE =
		new SezOccLocationAddTable();

	public final Column<SezOccLocationAddTable, Long> sezOccLocationAddId =
		createColumn(
			"sezOccLocationAddId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<SezOccLocationAddTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccLocationAddTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccLocationAddTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccLocationAddTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezOccLocationAddTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezOccLocationAddTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezOccLocationAddTable, String> developerLocation =
		createColumn(
			"developerLocation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccLocationAddTable, String>
		developerLocationDescription = createColumn(
			"developerLocationDescription", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccLocationAddTable, String> counter = createColumn(
		"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezOccLocationAddTable, Long> sezStatusApplicationId =
		createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezOccLocationAddTable() {
		super("nbp_sez_occ_location_add", SezOccLocationAddTable::new);
	}

}