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
 * The table class for the &quot;nbp_osi_insolv_total_liab&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CompanyTotalLiability
 * @generated
 */
public class CompanyTotalLiabilityTable
	extends BaseTable<CompanyTotalLiabilityTable> {

	public static final CompanyTotalLiabilityTable INSTANCE =
		new CompanyTotalLiabilityTable();

	public final Column<CompanyTotalLiabilityTable, Long>
		companyTotalLiabilityId = createColumn(
			"companyTotalLiabilityId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<CompanyTotalLiabilityTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CompanyTotalLiabilityTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CompanyTotalLiabilityTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CompanyTotalLiabilityTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CompanyTotalLiabilityTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CompanyTotalLiabilityTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CompanyTotalLiabilityTable, String> comTotalLiability =
		createColumn(
			"comTotalLiability", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CompanyTotalLiabilityTable, Long> osiInsolvencyId =
		createColumn(
			"osiInsolvencyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private CompanyTotalLiabilityTable() {
		super("nbp_osi_insolv_total_liab", CompanyTotalLiabilityTable::new);
	}

}