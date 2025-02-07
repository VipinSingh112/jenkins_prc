/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_manu_inter_certificate&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see ManuInternationalCertificate
 * @generated
 */
public class ManuInternationalCertificateTable
	extends BaseTable<ManuInternationalCertificateTable> {

	public static final ManuInternationalCertificateTable INSTANCE =
		new ManuInternationalCertificateTable();

	public final Column<ManuInternationalCertificateTable, Long>
		manuInternationalCertificateId = createColumn(
			"manuInternationalCertificateId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<ManuInternationalCertificateTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ManuInternationalCertificateTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ManuInternationalCertificateTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ManuInternationalCertificateTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuInternationalCertificateTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ManuInternationalCertificateTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ManuInternationalCertificateTable, String>
		companyCertified = createColumn(
			"companyCertified", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ManuInternationalCertificateTable, String> other =
		createColumn("other", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuInternationalCertificateTable, Long>
		manufacturingApplicationId = createColumn(
			"manufacturingApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private ManuInternationalCertificateTable() {
		super(
			"nbp_manu_inter_certificate",
			ManuInternationalCertificateTable::new);
	}

}