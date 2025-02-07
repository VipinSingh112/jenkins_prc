/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_ncbj_corrective_act&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjApplicationCorrectiveAction
 * @generated
 */
public class NcbjApplicationCorrectiveActionTable
	extends BaseTable<NcbjApplicationCorrectiveActionTable> {

	public static final NcbjApplicationCorrectiveActionTable INSTANCE =
		new NcbjApplicationCorrectiveActionTable();

	public final Column<NcbjApplicationCorrectiveActionTable, Long>
		ncbjAppCorrActionId = createColumn(
			"ncbjAppCorrActionId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<NcbjApplicationCorrectiveActionTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjApplicationCorrectiveActionTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjApplicationCorrectiveActionTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjApplicationCorrectiveActionTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjApplicationCorrectiveActionTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjApplicationCorrectiveActionTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjApplicationCorrectiveActionTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjApplicationCorrectiveActionTable, Long>
		preApprovalLetterId = createColumn(
			"preApprovalLetterId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private NcbjApplicationCorrectiveActionTable() {
		super(
			"nbp_ncbj_corrective_act",
			NcbjApplicationCorrectiveActionTable::new);
	}

}