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
 * The table class for the &quot;nbp_sez_occ_location_add_box&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantLocationAddBox
 * @generated
 */
public class SezOccupantLocationAddBoxTable
	extends BaseTable<SezOccupantLocationAddBoxTable> {

	public static final SezOccupantLocationAddBoxTable INSTANCE =
		new SezOccupantLocationAddBoxTable();

	public final Column<SezOccupantLocationAddBoxTable, Long> sezOccLocationId =
		createColumn(
			"sezOccLocationId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<SezOccupantLocationAddBoxTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccupantLocationAddBoxTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccupantLocationAddBoxTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccupantLocationAddBoxTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezOccupantLocationAddBoxTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezOccupantLocationAddBoxTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezOccupantLocationAddBoxTable, String>
		developerCodeLocation = createColumn(
			"developerCodeLocation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupantLocationAddBoxTable, String> descTypeOfAct =
		createColumn(
			"descTypeOfAct", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezOccupantLocationAddBoxTable, String>
		locationCounter = createColumn(
			"locationCounter", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupantLocationAddBoxTable, Long>
		sezStatusApplicationId = createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezOccupantLocationAddBoxTable() {
		super(
			"nbp_sez_occ_location_add_box",
			SezOccupantLocationAddBoxTable::new);
	}

}