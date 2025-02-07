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
 * The table class for the &quot;nbp_acquire_desk_verification&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireDeskVerification
 * @generated
 */
public class AcquireDeskVerificationTable
	extends BaseTable<AcquireDeskVerificationTable> {

	public static final AcquireDeskVerificationTable INSTANCE =
		new AcquireDeskVerificationTable();

	public final Column<AcquireDeskVerificationTable, Long>
		acquireDeskVerificationId = createColumn(
			"acquireDeskVerificationId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AcquireDeskVerificationTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquireDeskVerificationTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquireDeskVerificationTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquireDeskVerificationTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquireDeskVerificationTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AcquireDeskVerificationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AcquireDeskVerificationTable, Long>
		acquireApplicationId = createColumn(
			"acquireApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<AcquireDeskVerificationTable, String> documentName =
		createColumn(
			"documentName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquireDeskVerificationTable, String> documentStatus =
		createColumn(
			"documentStatus", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private AcquireDeskVerificationTable() {
		super(
			"nbp_acquire_desk_verification", AcquireDeskVerificationTable::new);
	}

}