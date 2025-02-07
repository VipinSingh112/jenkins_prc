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
 * The table class for the &quot;nbp_acquire_tendering&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireTendering
 * @generated
 */
public class AcquireTenderingTable extends BaseTable<AcquireTenderingTable> {

	public static final AcquireTenderingTable INSTANCE =
		new AcquireTenderingTable();

	public final Column<AcquireTenderingTable, Long> acquireTenderingId =
		createColumn(
			"acquireTenderingId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AcquireTenderingTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquireTenderingTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquireTenderingTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquireTenderingTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquireTenderingTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AcquireTenderingTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AcquireTenderingTable, String> caseId = createColumn(
		"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquireTenderingTable, String> nameOfEachBidders =
		createColumn(
			"nameOfEachBidders", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireTenderingTable, String> bidPriceofeachBid =
		createColumn(
			"bidPriceofeachBid", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireTenderingTable, String> minPriceOfTenderOffer =
		createColumn(
			"minPriceOfTenderOffer", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireTenderingTable, String> meetsMinimum =
		createColumn(
			"meetsMinimum", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquireTenderingTable, String> highestOffer =
		createColumn(
			"highestOffer", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquireTenderingTable, String> status = createColumn(
		"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private AcquireTenderingTable() {
		super("nbp_acquire_tendering", AcquireTenderingTable::new);
	}

}