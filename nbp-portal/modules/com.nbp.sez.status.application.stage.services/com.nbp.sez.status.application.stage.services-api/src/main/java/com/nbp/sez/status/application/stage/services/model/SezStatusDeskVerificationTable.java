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
 * The table class for the &quot;nbp_sez_status_desk_verificat&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusDeskVerification
 * @generated
 */
public class SezStatusDeskVerificationTable
	extends BaseTable<SezStatusDeskVerificationTable> {

	public static final SezStatusDeskVerificationTable INSTANCE =
		new SezStatusDeskVerificationTable();

	public final Column<SezStatusDeskVerificationTable, Long>
		SezDeskVerificationId = createColumn(
			"SezDeskVerificationId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<SezStatusDeskVerificationTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezStatusDeskVerificationTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezStatusDeskVerificationTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezStatusDeskVerificationTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusDeskVerificationTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezStatusDeskVerificationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezStatusDeskVerificationTable, Long> sezApplicationId =
		createColumn(
			"sezApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezStatusDeskVerificationTable, String> document =
		createColumn(
			"document", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusDeskVerificationTable, String> documentName =
		createColumn(
			"documentName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusDeskVerificationTable, String> status =
		createColumn(
			"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private SezStatusDeskVerificationTable() {
		super(
			"nbp_sez_status_desk_verificat",
			SezStatusDeskVerificationTable::new);
	}

}