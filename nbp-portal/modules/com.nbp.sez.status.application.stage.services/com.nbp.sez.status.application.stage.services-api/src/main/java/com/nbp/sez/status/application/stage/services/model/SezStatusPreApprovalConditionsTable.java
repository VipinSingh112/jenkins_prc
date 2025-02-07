/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_sez_pre_approval&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusPreApprovalConditions
 * @generated
 */
public class SezStatusPreApprovalConditionsTable
	extends BaseTable<SezStatusPreApprovalConditionsTable> {

	public static final SezStatusPreApprovalConditionsTable INSTANCE =
		new SezStatusPreApprovalConditionsTable();

	public final Column<SezStatusPreApprovalConditionsTable, Long>
		preApprovalId = createColumn(
			"preApprovalId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<SezStatusPreApprovalConditionsTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezStatusPreApprovalConditionsTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezStatusPreApprovalConditionsTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezStatusPreApprovalConditionsTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusPreApprovalConditionsTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezStatusPreApprovalConditionsTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezStatusPreApprovalConditionsTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusPreApprovalConditionsTable, Long>
		preApprovalLetterId = createColumn(
			"preApprovalLetterId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezStatusPreApprovalConditionsTable() {
		super("nbp_sez_pre_approval", SezStatusPreApprovalConditionsTable::new);
	}

}