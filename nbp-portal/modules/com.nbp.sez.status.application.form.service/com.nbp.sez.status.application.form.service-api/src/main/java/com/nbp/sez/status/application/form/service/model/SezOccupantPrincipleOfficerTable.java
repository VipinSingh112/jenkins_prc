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
 * The table class for the &quot;nbp_sez_occ_prin_offic_add&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantPrincipleOfficer
 * @generated
 */
public class SezOccupantPrincipleOfficerTable
	extends BaseTable<SezOccupantPrincipleOfficerTable> {

	public static final SezOccupantPrincipleOfficerTable INSTANCE =
		new SezOccupantPrincipleOfficerTable();

	public final Column<SezOccupantPrincipleOfficerTable, Long>
		sezOccPrincOffId = createColumn(
			"sezOccPrincOffId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<SezOccupantPrincipleOfficerTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccupantPrincipleOfficerTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccupantPrincipleOfficerTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccupantPrincipleOfficerTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezOccupantPrincipleOfficerTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezOccupantPrincipleOfficerTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezOccupantPrincipleOfficerTable, String> name =
		createColumn("name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezOccupantPrincipleOfficerTable, String> position =
		createColumn(
			"position", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezOccupantPrincipleOfficerTable, String>
		principlOfficerCounter = createColumn(
			"principlOfficerCounter", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupantPrincipleOfficerTable, Long>
		sezStatusApplicationId = createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezOccupantPrincipleOfficerTable() {
		super(
			"nbp_sez_occ_prin_offic_add",
			SezOccupantPrincipleOfficerTable::new);
	}

}