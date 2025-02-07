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
 * The table class for the &quot;nbp_osi_ver_company&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see VerificationCompanyInfo
 * @generated
 */
public class VerificationCompanyInfoTable
	extends BaseTable<VerificationCompanyInfoTable> {

	public static final VerificationCompanyInfoTable INSTANCE =
		new VerificationCompanyInfoTable();

	public final Column<VerificationCompanyInfoTable, Long>
		verificationCompanyInfoId = createColumn(
			"verificationCompanyInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<VerificationCompanyInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<VerificationCompanyInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<VerificationCompanyInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<VerificationCompanyInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<VerificationCompanyInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<VerificationCompanyInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<VerificationCompanyInfoTable, String> verComName =
		createColumn(
			"verComName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<VerificationCompanyInfoTable, String> verComTrn =
		createColumn(
			"verComTrn", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<VerificationCompanyInfoTable, Long> osiInsolvencyId =
		createColumn(
			"osiInsolvencyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private VerificationCompanyInfoTable() {
		super("nbp_osi_ver_company", VerificationCompanyInfoTable::new);
	}

}