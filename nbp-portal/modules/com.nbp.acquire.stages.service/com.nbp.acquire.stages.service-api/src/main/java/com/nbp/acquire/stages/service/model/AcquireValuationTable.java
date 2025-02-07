/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_acquire_valuation&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireValuation
 * @generated
 */
public class AcquireValuationTable extends BaseTable<AcquireValuationTable> {

	public static final AcquireValuationTable INSTANCE =
		new AcquireValuationTable();

	public final Column<AcquireValuationTable, Long> acquireValuationId =
		createColumn(
			"acquireValuationId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AcquireValuationTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquireValuationTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquireValuationTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquireValuationTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquireValuationTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AcquireValuationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AcquireValuationTable, String> caseId = createColumn(
		"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquireValuationTable, String> valuationNumber =
		createColumn(
			"valuationNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireValuationTable, String> valuationVolume =
		createColumn(
			"valuationVolume", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireValuationTable, String> valuationFolio =
		createColumn(
			"valuationFolio", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquireValuationTable, String> valuationStatus =
		createColumn(
			"valuationStatus", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private AcquireValuationTable() {
		super("nbp_acquire_valuation", AcquireValuationTable::new);
	}

}