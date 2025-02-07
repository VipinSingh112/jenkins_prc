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
 * The table class for the &quot;nbp_osi_shareholder&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see ShareholdersHoldings
 * @generated
 */
public class ShareholdersHoldingsTable
	extends BaseTable<ShareholdersHoldingsTable> {

	public static final ShareholdersHoldingsTable INSTANCE =
		new ShareholdersHoldingsTable();

	public final Column<ShareholdersHoldingsTable, Long>
		shareholdersHoldingsId = createColumn(
			"shareholdersHoldingsId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<ShareholdersHoldingsTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ShareholdersHoldingsTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ShareholdersHoldingsTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ShareholdersHoldingsTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ShareholdersHoldingsTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ShareholdersHoldingsTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ShareholdersHoldingsTable, String> shareholderName =
		createColumn(
			"shareholderName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ShareholdersHoldingsTable, Date> shareholderDate =
		createColumn(
			"shareholderDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<ShareholdersHoldingsTable, String>
		shareholderOccupation = createColumn(
			"shareholderOccupation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ShareholdersHoldingsTable, String> shareholderShares =
		createColumn(
			"shareholderShares", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ShareholdersHoldingsTable, String> shareholderAddress =
		createColumn(
			"shareholderAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ShareholdersHoldingsTable, String> shareholderCounter =
		createColumn(
			"shareholderCounter", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ShareholdersHoldingsTable, Long> osiInsolvencyId =
		createColumn(
			"osiInsolvencyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private ShareholdersHoldingsTable() {
		super("nbp_osi_shareholder", ShareholdersHoldingsTable::new);
	}

}