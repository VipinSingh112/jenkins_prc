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
 * The table class for the &quot;nbp_sez_dev_corp_bus_add&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevShareCorporationBusAdd
 * @generated
 */
public class SezDevShareCorporationBusAddTable
	extends BaseTable<SezDevShareCorporationBusAddTable> {

	public static final SezDevShareCorporationBusAddTable INSTANCE =
		new SezDevShareCorporationBusAddTable();

	public final Column<SezDevShareCorporationBusAddTable, Long>
		sezDevCorporationBusinessAddId = createColumn(
			"sezDevCorporationBusinessAddId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<SezDevShareCorporationBusAddTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevShareCorporationBusAddTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevShareCorporationBusAddTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevShareCorporationBusAddTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevShareCorporationBusAddTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezDevShareCorporationBusAddTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezDevShareCorporationBusAddTable, String> name =
		createColumn("name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevShareCorporationBusAddTable, String> company =
		createColumn(
			"company", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevShareCorporationBusAddTable, String>
		relationship = createColumn(
			"relationship", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevShareCorporationBusAddTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevShareCorporationBusAddTable, Long>
		sezStatusApplicationId = createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezDevShareCorporationBusAddTable() {
		super(
			"nbp_sez_dev_corp_bus_add", SezDevShareCorporationBusAddTable::new);
	}

}