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
 * The table class for the &quot;nbp_jadsc_appli_final_deter&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see JadscAppliFinalDeter
 * @generated
 */
public class JadscAppliFinalDeterTable
	extends BaseTable<JadscAppliFinalDeterTable> {

	public static final JadscAppliFinalDeterTable INSTANCE =
		new JadscAppliFinalDeterTable();

	public final Column<JadscAppliFinalDeterTable, Long>
		jadscAppliFinalDeterId = createColumn(
			"jadscAppliFinalDeterId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<JadscAppliFinalDeterTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JadscAppliFinalDeterTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JadscAppliFinalDeterTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JadscAppliFinalDeterTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JadscAppliFinalDeterTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JadscAppliFinalDeterTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JadscAppliFinalDeterTable, Date> dateOfFinalDeter =
		createColumn(
			"dateOfFinalDeter", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<JadscAppliFinalDeterTable, String> Outcome =
		createColumn(
			"Outcome", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JadscAppliFinalDeterTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private JadscAppliFinalDeterTable() {
		super("nbp_jadsc_appli_final_deter", JadscAppliFinalDeterTable::new);
	}

}