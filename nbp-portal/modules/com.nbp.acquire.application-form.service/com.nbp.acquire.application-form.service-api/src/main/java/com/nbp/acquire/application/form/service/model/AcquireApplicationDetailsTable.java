/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_acquire_details&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireApplicationDetails
 * @generated
 */
public class AcquireApplicationDetailsTable
	extends BaseTable<AcquireApplicationDetailsTable> {

	public static final AcquireApplicationDetailsTable INSTANCE =
		new AcquireApplicationDetailsTable();

	public final Column<AcquireApplicationDetailsTable, Long>
		acquireApplicationDetailsId = createColumn(
			"acquireApplicationDetailsId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AcquireApplicationDetailsTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquireApplicationDetailsTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquireApplicationDetailsTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquireApplicationDetailsTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquireApplicationDetailsTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AcquireApplicationDetailsTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AcquireApplicationDetailsTable, String> applicantName =
		createColumn(
			"applicantName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquireApplicationDetailsTable, String>
		applicantOrganisation = createColumn(
			"applicantOrganisation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireApplicationDetailsTable, String>
		applicantPostalAddr = createColumn(
			"applicantPostalAddr", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireApplicationDetailsTable, String> applicantEmail =
		createColumn(
			"applicantEmail", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquireApplicationDetailsTable, String>
		applicantTeleNum = createColumn(
			"applicantTeleNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireApplicationDetailsTable, Long>
		acquireApplicationId = createColumn(
			"acquireApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private AcquireApplicationDetailsTable() {
		super("nbp_acquire_details", AcquireApplicationDetailsTable::new);
	}

}