/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_jadsc_appli_preli_deter&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see JadscAppliPreliminationDete
 * @generated
 */
public class JadscAppliPreliminationDeteTable
	extends BaseTable<JadscAppliPreliminationDeteTable> {

	public static final JadscAppliPreliminationDeteTable INSTANCE =
		new JadscAppliPreliminationDeteTable();

	public final Column<JadscAppliPreliminationDeteTable, Long>
		jadscAppliPreliminationDeteId = createColumn(
			"jadscAppliPreliminationDeteId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<JadscAppliPreliminationDeteTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JadscAppliPreliminationDeteTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JadscAppliPreliminationDeteTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JadscAppliPreliminationDeteTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JadscAppliPreliminationDeteTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JadscAppliPreliminationDeteTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JadscAppliPreliminationDeteTable, Date> dateOfPreDete =
		createColumn(
			"dateOfPreDete", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JadscAppliPreliminationDeteTable, String> Outcome =
		createColumn(
			"Outcome", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JadscAppliPreliminationDeteTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private JadscAppliPreliminationDeteTable() {
		super(
			"nbp_jadsc_appli_preli_deter",
			JadscAppliPreliminationDeteTable::new);
	}

}