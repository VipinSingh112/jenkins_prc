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
 * The table class for the &quot;nbp_sez_occ_princ_dir_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantPrincipleDirector
 * @generated
 */
public class SezOccupantPrincipleDirectorTable
	extends BaseTable<SezOccupantPrincipleDirectorTable> {

	public static final SezOccupantPrincipleDirectorTable INSTANCE =
		new SezOccupantPrincipleDirectorTable();

	public final Column<SezOccupantPrincipleDirectorTable, Long>
		sezOccPrincDirectId = createColumn(
			"sezOccPrincDirectId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<SezOccupantPrincipleDirectorTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccupantPrincipleDirectorTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccupantPrincipleDirectorTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccupantPrincipleDirectorTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezOccupantPrincipleDirectorTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezOccupantPrincipleDirectorTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezOccupantPrincipleDirectorTable, String>
		occShareholderName = createColumn(
			"occShareholderName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupantPrincipleDirectorTable, String>
		occShareholderNation = createColumn(
			"occShareholderNation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupantPrincipleDirectorTable, String>
		occShareholderShares = createColumn(
			"occShareholderShares", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupantPrincipleDirectorTable, String>
		occShareholderCounter = createColumn(
			"occShareholderCounter", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupantPrincipleDirectorTable, Long>
		sezStatusApplicationId = createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezOccupantPrincipleDirectorTable() {
		super(
			"nbp_sez_occ_princ_dir_info",
			SezOccupantPrincipleDirectorTable::new);
	}

}