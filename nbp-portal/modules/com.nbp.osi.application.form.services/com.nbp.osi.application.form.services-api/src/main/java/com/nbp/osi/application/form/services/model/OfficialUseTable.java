/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_osi_official_use&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see OfficialUse
 * @generated
 */
public class OfficialUseTable extends BaseTable<OfficialUseTable> {

	public static final OfficialUseTable INSTANCE = new OfficialUseTable();

	public final Column<OfficialUseTable, Long> officialUseId = createColumn(
		"officialUseId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<OfficialUseTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OfficialUseTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OfficialUseTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OfficialUseTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OfficialUseTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OfficialUseTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OfficialUseTable, String> receivedBy = createColumn(
		"receivedBy", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OfficialUseTable, Date> receivedByDate = createColumn(
		"receivedByDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OfficialUseTable, String> verifiedBy = createColumn(
		"verifiedBy", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OfficialUseTable, Date> verifiedByDate = createColumn(
		"verifiedByDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OfficialUseTable, String> applicationAccepted =
		createColumn(
			"applicationAccepted", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OfficialUseTable, Date> dateCertificateIssued =
		createColumn(
			"dateCertificateIssued", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<OfficialUseTable, String> certificateNumber =
		createColumn(
			"certificateNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OfficialUseTable, String> remarksNotes = createColumn(
		"remarksNotes", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OfficialUseTable, Long> osiApplicationId = createColumn(
		"osiApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private OfficialUseTable() {
		super("nbp_osi_official_use", OfficialUseTable::new);
	}

}