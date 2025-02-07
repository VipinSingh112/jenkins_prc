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
 * The table class for the &quot;nbp_jadsc_appli_initi_inves&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see JadscApplicationInitiateInvestigation
 * @generated
 */
public class JadscApplicationInitiateInvestigationTable
	extends BaseTable<JadscApplicationInitiateInvestigationTable> {

	public static final JadscApplicationInitiateInvestigationTable INSTANCE =
		new JadscApplicationInitiateInvestigationTable();

	public final Column<JadscApplicationInitiateInvestigationTable, Long>
		jadscAppliInvestiId = createColumn(
			"jadscAppliInvestiId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<JadscApplicationInitiateInvestigationTable, Long>
		groupId = createColumn(
			"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JadscApplicationInitiateInvestigationTable, Long>
		companyId = createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JadscApplicationInitiateInvestigationTable, Long>
		userId = createColumn(
			"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JadscApplicationInitiateInvestigationTable, String>
		userName = createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JadscApplicationInitiateInvestigationTable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JadscApplicationInitiateInvestigationTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JadscApplicationInitiateInvestigationTable, Date>
		dateOfIniInvest = createColumn(
			"dateOfIniInvest", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<JadscApplicationInitiateInvestigationTable, String>
		outcome = createColumn(
			"outcome", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JadscApplicationInitiateInvestigationTable, String>
		caseId = createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private JadscApplicationInitiateInvestigationTable() {
		super(
			"nbp_jadsc_appli_initi_inves",
			JadscApplicationInitiateInvestigationTable::new);
	}

}