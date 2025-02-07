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
 * The table class for the &quot;nbp_sez_dev_share_com_dire_add&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevShareComDirectorShipAdd
 * @generated
 */
public class SezDevShareComDirectorShipAddTable
	extends BaseTable<SezDevShareComDirectorShipAddTable> {

	public static final SezDevShareComDirectorShipAddTable INSTANCE =
		new SezDevShareComDirectorShipAddTable();

	public final Column<SezDevShareComDirectorShipAddTable, Long>
		sezDevSharComDirectorShipAddId = createColumn(
			"sezDevSharComDirectorShipAddId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<SezDevShareComDirectorShipAddTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevShareComDirectorShipAddTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevShareComDirectorShipAddTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevShareComDirectorShipAddTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevShareComDirectorShipAddTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezDevShareComDirectorShipAddTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezDevShareComDirectorShipAddTable, String> name =
		createColumn("name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevShareComDirectorShipAddTable, String> company =
		createColumn(
			"company", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevShareComDirectorShipAddTable, String>
		replationship = createColumn(
			"replationship", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevShareComDirectorShipAddTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevShareComDirectorShipAddTable, Long>
		sezStatusApplicationId = createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezDevShareComDirectorShipAddTable() {
		super(
			"nbp_sez_dev_share_com_dire_add",
			SezDevShareComDirectorShipAddTable::new);
	}

}