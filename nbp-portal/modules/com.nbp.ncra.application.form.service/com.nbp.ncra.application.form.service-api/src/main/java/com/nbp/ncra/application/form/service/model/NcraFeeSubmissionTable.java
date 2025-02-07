/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_ncra_fee_payment&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see NcraFeeSubmission
 * @generated
 */
public class NcraFeeSubmissionTable extends BaseTable<NcraFeeSubmissionTable> {

	public static final NcraFeeSubmissionTable INSTANCE =
		new NcraFeeSubmissionTable();

	public final Column<NcraFeeSubmissionTable, Long> ncraFeeSubmissionId =
		createColumn(
			"ncraFeeSubmissionId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<NcraFeeSubmissionTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcraFeeSubmissionTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcraFeeSubmissionTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcraFeeSubmissionTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcraFeeSubmissionTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcraFeeSubmissionTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcraFeeSubmissionTable, String> creditStatus =
		createColumn(
			"creditStatus", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcraFeeSubmissionTable, Long> ncraApplicationId =
		createColumn(
			"ncraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private NcraFeeSubmissionTable() {
		super("nbp_ncra_fee_payment", NcraFeeSubmissionTable::new);
	}

}