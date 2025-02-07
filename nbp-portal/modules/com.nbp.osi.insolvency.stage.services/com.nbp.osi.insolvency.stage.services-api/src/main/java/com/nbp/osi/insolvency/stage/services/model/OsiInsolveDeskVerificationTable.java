/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.stage.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_osi_inso_desk_verification&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolveDeskVerification
 * @generated
 */
public class OsiInsolveDeskVerificationTable
	extends BaseTable<OsiInsolveDeskVerificationTable> {

	public static final OsiInsolveDeskVerificationTable INSTANCE =
		new OsiInsolveDeskVerificationTable();

	public final Column<OsiInsolveDeskVerificationTable, Long>
		OsiInsolveDeskVerificationId = createColumn(
			"OsiInsolveDeskVerificationId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<OsiInsolveDeskVerificationTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiInsolveDeskVerificationTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiInsolveDeskVerificationTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiInsolveDeskVerificationTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiInsolveDeskVerificationTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiInsolveDeskVerificationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiInsolveDeskVerificationTable, String> documentName =
		createColumn(
			"documentName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiInsolveDeskVerificationTable, String> status =
		createColumn(
			"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiInsolveDeskVerificationTable, Long> osiInsolvencyId =
		createColumn(
			"osiInsolvencyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private OsiInsolveDeskVerificationTable() {
		super(
			"nbp_osi_inso_desk_verification",
			OsiInsolveDeskVerificationTable::new);
	}

}