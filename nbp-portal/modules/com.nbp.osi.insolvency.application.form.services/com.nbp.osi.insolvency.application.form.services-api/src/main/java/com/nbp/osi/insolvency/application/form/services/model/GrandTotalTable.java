/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_osi_grand_total&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see GrandTotal
 * @generated
 */
public class GrandTotalTable extends BaseTable<GrandTotalTable> {

	public static final GrandTotalTable INSTANCE = new GrandTotalTable();

	public final Column<GrandTotalTable, Long> grandTotalId = createColumn(
		"grandTotalId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<GrandTotalTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<GrandTotalTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<GrandTotalTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<GrandTotalTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<GrandTotalTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<GrandTotalTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<GrandTotalTable, String> totalSecuredLiabilities =
		createColumn(
			"totalSecuredLiabilities", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<GrandTotalTable, String> securedTotalMonthlyPayments =
		createColumn(
			"securedTotalMonthlyPayments", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<GrandTotalTable, String> totalPreferredLiabilities =
		createColumn(
			"totalPreferredLiabilities", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<GrandTotalTable, String> preferredTotalMonthlyPayments =
		createColumn(
			"preferredTotalMonthlyPayments", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<GrandTotalTable, String> totalUnsecuredLiabilities =
		createColumn(
			"totalUnsecuredLiabilities", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<GrandTotalTable, String> unsecuredTotalMonthlyPayments =
		createColumn(
			"unsecuredTotalMonthlyPayments", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<GrandTotalTable, String> grandTotal = createColumn(
		"grandTotal", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<GrandTotalTable, Long> osiInsolvencyId = createColumn(
		"osiInsolvencyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private GrandTotalTable() {
		super("nbp_osi_grand_total", GrandTotalTable::new);
	}

}