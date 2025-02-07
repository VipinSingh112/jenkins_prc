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
 * The table class for the &quot;nbp_acquire_advertising&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireAdvertising
 * @generated
 */
public class AcquireAdvertisingTable
	extends BaseTable<AcquireAdvertisingTable> {

	public static final AcquireAdvertisingTable INSTANCE =
		new AcquireAdvertisingTable();

	public final Column<AcquireAdvertisingTable, Long> acquireAdvertisingId =
		createColumn(
			"acquireAdvertisingId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AcquireAdvertisingTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquireAdvertisingTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquireAdvertisingTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquireAdvertisingTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquireAdvertisingTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AcquireAdvertisingTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AcquireAdvertisingTable, String> caseId = createColumn(
		"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquireAdvertisingTable, Date> dateFrom = createColumn(
		"dateFrom", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AcquireAdvertisingTable, Date> dateTo = createColumn(
		"dateTo", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AcquireAdvertisingTable, String>
		advertisingMediaStatus = createColumn(
			"advertisingMediaStatus", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private AcquireAdvertisingTable() {
		super("nbp_acquire_advertising", AcquireAdvertisingTable::new);
	}

}